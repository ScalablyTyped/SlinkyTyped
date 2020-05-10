package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.ABORT
import typingsSlinky.chromeApps.chromeAppsStrings.ACCESS_DENIED
import typingsSlinky.chromeApps.chromeAppsStrings.EXISTS
import typingsSlinky.chromeApps.chromeAppsStrings.FAILED
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_OPERATION
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_URL
import typingsSlinky.chromeApps.chromeAppsStrings.IN_USE
import typingsSlinky.chromeApps.chromeAppsStrings.IO
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_A_FILE
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_EMPTY
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_FOUND
import typingsSlinky.chromeApps.chromeAppsStrings.NO_MEMORY
import typingsSlinky.chromeApps.chromeAppsStrings.NO_SPACE
import typingsSlinky.chromeApps.chromeAppsStrings.OK
import typingsSlinky.chromeApps.chromeAppsStrings.SECURITY
import typingsSlinky.chromeApps.chromeAppsStrings.TOO_MANY_OPENED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonABORT extends js.Object {
  var ABORT: typingsSlinky.chromeApps.chromeAppsStrings.ABORT = js.native
  var ACCESS_DENIED: typingsSlinky.chromeApps.chromeAppsStrings.ACCESS_DENIED = js.native
  var EXISTS: typingsSlinky.chromeApps.chromeAppsStrings.EXISTS = js.native
  var FAILED: typingsSlinky.chromeApps.chromeAppsStrings.FAILED = js.native
  var INVALID_OPERATION: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_OPERATION = js.native
  var INVALID_URL: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_URL = js.native
  var IN_USE: typingsSlinky.chromeApps.chromeAppsStrings.IN_USE = js.native
  var IO: typingsSlinky.chromeApps.chromeAppsStrings.IO = js.native
  var NOT_A_DIRECTORY: typingsSlinky.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY = js.native
  var NOT_A_FILE: typingsSlinky.chromeApps.chromeAppsStrings.NOT_A_FILE = js.native
  var NOT_EMPTY: typingsSlinky.chromeApps.chromeAppsStrings.NOT_EMPTY = js.native
  var NOT_FOUND: typingsSlinky.chromeApps.chromeAppsStrings.NOT_FOUND = js.native
  var NO_MEMORY: typingsSlinky.chromeApps.chromeAppsStrings.NO_MEMORY = js.native
  var NO_SPACE: typingsSlinky.chromeApps.chromeAppsStrings.NO_SPACE = js.native
  var OK: typingsSlinky.chromeApps.chromeAppsStrings.OK = js.native
  var SECURITY: typingsSlinky.chromeApps.chromeAppsStrings.SECURITY = js.native
  var TOO_MANY_OPENED: typingsSlinky.chromeApps.chromeAppsStrings.TOO_MANY_OPENED = js.native
}

object AnonABORT {
  @scala.inline
  def apply(
    ABORT: ABORT,
    ACCESS_DENIED: ACCESS_DENIED,
    EXISTS: EXISTS,
    FAILED: FAILED,
    INVALID_OPERATION: INVALID_OPERATION,
    INVALID_URL: INVALID_URL,
    IN_USE: IN_USE,
    IO: IO,
    NOT_A_DIRECTORY: NOT_A_DIRECTORY,
    NOT_A_FILE: NOT_A_FILE,
    NOT_EMPTY: NOT_EMPTY,
    NOT_FOUND: NOT_FOUND,
    NO_MEMORY: NO_MEMORY,
    NO_SPACE: NO_SPACE,
    OK: OK,
    SECURITY: SECURITY,
    TOO_MANY_OPENED: TOO_MANY_OPENED
  ): AnonABORT = {
    val __obj = js.Dynamic.literal(ABORT = ABORT.asInstanceOf[js.Any], ACCESS_DENIED = ACCESS_DENIED.asInstanceOf[js.Any], EXISTS = EXISTS.asInstanceOf[js.Any], FAILED = FAILED.asInstanceOf[js.Any], INVALID_OPERATION = INVALID_OPERATION.asInstanceOf[js.Any], INVALID_URL = INVALID_URL.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], NOT_A_DIRECTORY = NOT_A_DIRECTORY.asInstanceOf[js.Any], NOT_A_FILE = NOT_A_FILE.asInstanceOf[js.Any], NOT_EMPTY = NOT_EMPTY.asInstanceOf[js.Any], NOT_FOUND = NOT_FOUND.asInstanceOf[js.Any], NO_MEMORY = NO_MEMORY.asInstanceOf[js.Any], NO_SPACE = NO_SPACE.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], SECURITY = SECURITY.asInstanceOf[js.Any], TOO_MANY_OPENED = TOO_MANY_OPENED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonABORT]
  }
  @scala.inline
  implicit class AnonABORTOps[Self <: AnonABORT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withABORT(value: ABORT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ABORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACCESS_DENIED(value: ACCESS_DENIED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_DENIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXISTS(value: EXISTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXISTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAILED(value: FAILED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_OPERATION(value: INVALID_OPERATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_OPERATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_URL(value: INVALID_URL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIN_USE(value: IN_USE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN_USE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIO(value: IO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_A_DIRECTORY(value: NOT_A_DIRECTORY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_A_DIRECTORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_A_FILE(value: NOT_A_FILE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_A_FILE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_EMPTY(value: NOT_EMPTY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_EMPTY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_FOUND(value: NOT_FOUND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_MEMORY(value: NO_MEMORY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_MEMORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_SPACE(value: NO_SPACE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_SPACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: OK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSECURITY(value: SECURITY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SECURITY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOO_MANY_OPENED(value: TOO_MANY_OPENED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOO_MANY_OPENED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

