package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.anon.READ
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenedFileInfo extends StObject {
  
  /** The path of the opened file. */
  var filePath: String = js.native
  
  /**
    * Whether the file was opened for reading or writing.
    * @see OpenFileMode
    */
  var mode: ToStringLiteral[
    READ, 
    /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
    Exclude[
      /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
      typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE
    ]
  ] = js.native
  
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: integer = js.native
}
object OpenedFileInfo {
  
  @scala.inline
  def apply(
    filePath: String,
    mode: ToStringLiteral[
      READ, 
      /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
      Exclude[
        /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
        typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE
      ]
    ],
    openRequestId: integer
  ): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileInfo]
  }
  
  @scala.inline
  implicit class OpenedFileInfoMutableBuilder[Self <: OpenedFileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(
      value: ToStringLiteral[
          READ, 
          /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
          Exclude[
            /* keyof chrome-apps.anon.READ */ typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE, 
            typingsSlinky.chromeApps.chromeAppsStrings.READ | WRITE
          ]
        ]
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
