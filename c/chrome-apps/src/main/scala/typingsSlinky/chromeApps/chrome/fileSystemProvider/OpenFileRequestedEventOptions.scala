package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.anon.READ
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.FilePathRequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFileRequestedEventOptions extends FilePathRequestedEventOptions {
  /**
    * Whether the file will be used for reading or writing.
    * @see ChangeType
    */
  var mode: ToStringLiteral[
    READ, 
    /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
    Exclude[
      /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
      typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE
    ]
  ] = js.native
}

object OpenFileRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: String,
    fileSystemId: String,
    mode: ToStringLiteral[
      READ, 
      /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
      Exclude[
        /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
        typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE
      ]
    ],
    requestId: integer
  ): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
  @scala.inline
  implicit class OpenFileRequestedEventOptionsOps[Self <: OpenFileRequestedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(
      value: ToStringLiteral[
          READ, 
          /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
          Exclude[
            /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
            typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

