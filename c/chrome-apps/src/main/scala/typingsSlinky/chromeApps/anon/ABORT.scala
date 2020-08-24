package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.ACCESS_DENIED
import typingsSlinky.chromeApps.chromeAppsStrings.EXISTS
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
trait ABORT extends js.Object {
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

object ABORT {
  @scala.inline
  def apply(
    ABORT: typingsSlinky.chromeApps.chromeAppsStrings.ABORT,
    ACCESS_DENIED: ACCESS_DENIED,
    EXISTS: EXISTS,
    FAILED: typingsSlinky.chromeApps.chromeAppsStrings.FAILED,
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
  ): ABORT = {
    val __obj = js.Dynamic.literal(ABORT = ABORT.asInstanceOf[js.Any], ACCESS_DENIED = ACCESS_DENIED.asInstanceOf[js.Any], EXISTS = EXISTS.asInstanceOf[js.Any], FAILED = FAILED.asInstanceOf[js.Any], INVALID_OPERATION = INVALID_OPERATION.asInstanceOf[js.Any], INVALID_URL = INVALID_URL.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], NOT_A_DIRECTORY = NOT_A_DIRECTORY.asInstanceOf[js.Any], NOT_A_FILE = NOT_A_FILE.asInstanceOf[js.Any], NOT_EMPTY = NOT_EMPTY.asInstanceOf[js.Any], NOT_FOUND = NOT_FOUND.asInstanceOf[js.Any], NO_MEMORY = NO_MEMORY.asInstanceOf[js.Any], NO_SPACE = NO_SPACE.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], SECURITY = SECURITY.asInstanceOf[js.Any], TOO_MANY_OPENED = TOO_MANY_OPENED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABORT]
  }
  @scala.inline
  implicit class ABORTOps[Self <: ABORT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setABORT(value: typingsSlinky.chromeApps.chromeAppsStrings.ABORT): Self = this.set("ABORT", value.asInstanceOf[js.Any])
    @scala.inline
    def setACCESS_DENIED(value: ACCESS_DENIED): Self = this.set("ACCESS_DENIED", value.asInstanceOf[js.Any])
    @scala.inline
    def setEXISTS(value: EXISTS): Self = this.set("EXISTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAILED(value: typingsSlinky.chromeApps.chromeAppsStrings.FAILED): Self = this.set("FAILED", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_OPERATION(value: INVALID_OPERATION): Self = this.set("INVALID_OPERATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_URL(value: INVALID_URL): Self = this.set("INVALID_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setIN_USE(value: IN_USE): Self = this.set("IN_USE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIO(value: IO): Self = this.set("IO", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_A_DIRECTORY(value: NOT_A_DIRECTORY): Self = this.set("NOT_A_DIRECTORY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_A_FILE(value: NOT_A_FILE): Self = this.set("NOT_A_FILE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_EMPTY(value: NOT_EMPTY): Self = this.set("NOT_EMPTY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_FOUND(value: NOT_FOUND): Self = this.set("NOT_FOUND", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_MEMORY(value: NO_MEMORY): Self = this.set("NO_MEMORY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_SPACE(value: NO_SPACE): Self = this.set("NO_SPACE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOK(value: OK): Self = this.set("OK", value.asInstanceOf[js.Any])
    @scala.inline
    def setSECURITY(value: SECURITY): Self = this.set("SECURITY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOO_MANY_OPENED(value: TOO_MANY_OPENED): Self = this.set("TOO_MANY_OPENED", value.asInstanceOf[js.Any])
  }
  
}

