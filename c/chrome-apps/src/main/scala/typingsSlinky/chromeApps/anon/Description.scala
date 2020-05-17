package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description extends js.Object {
  var description: String = js.native
  var state: ToStringLiteral[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
    /* keyof typeof ServiceStatus */ String, 
    Exclude[
      /* keyof typeof ServiceStatus */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
    ]
  ] = js.native
}

object Description {
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
      /* keyof typeof ServiceStatus */ String, 
      Exclude[
        /* keyof typeof ServiceStatus */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
      ]
    ]
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(
      value: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
          /* keyof typeof ServiceStatus */ String, 
          Exclude[
            /* keyof typeof ServiceStatus */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus[keyof typeof ServiceStatus] */ js.Any
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

