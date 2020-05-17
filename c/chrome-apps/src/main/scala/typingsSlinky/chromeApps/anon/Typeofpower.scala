package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpower extends js.Object {
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  val Level: DISPLAY = js.native
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): Unit = js.native
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      Exclude[
        /* keyof typeof Level */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
      ]
    ]
  ): Unit = js.native
}

object Typeofpower {
  @scala.inline
  def apply(
    Level: DISPLAY,
    releaseKeepAwake: () => Unit,
    requestKeepAwake: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      Exclude[
        /* keyof typeof Level */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
      ]
    ] => Unit
  ): Typeofpower = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any], releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
  @scala.inline
  implicit class TypeofpowerOps[Self <: Typeofpower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: DISPLAY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseKeepAwake(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseKeepAwake")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestKeepAwake(
      value: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
          /* keyof typeof Level */ String, 
          Exclude[
            /* keyof typeof Level */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
          ]
        ] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestKeepAwake")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

