package typingsSlinky.cordovaPluginsDiagnostic.anon

import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64
import typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARMv6 extends js.Object {
  var ARMv6: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6 = js.native
  var ARMv7: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7 = js.native
  var ARMv8: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8 = js.native
  // Android only
  var MIPS: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS = js.native
  var MIPS_64: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64 = js.native
  // Both iOS and Android
  var UNKNOWN: unknown = js.native
  var X86: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86 = js.native
  var X86_64: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64 = js.native
}

object ARMv6 {
  @scala.inline
  def apply(
    ARMv6: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6,
    ARMv7: ARMv7,
    ARMv8: ARMv8,
    MIPS: MIPS,
    MIPS_64: MIPS_64,
    UNKNOWN: unknown,
    X86: X86,
    X86_64: X86_64
  ): ARMv6 = {
    val __obj = js.Dynamic.literal(ARMv6 = ARMv6.asInstanceOf[js.Any], ARMv7 = ARMv7.asInstanceOf[js.Any], ARMv8 = ARMv8.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS_64 = MIPS_64.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], X86 = X86.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARMv6]
  }
  @scala.inline
  implicit class ARMv6Ops[Self <: ARMv6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARMv6(value: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARMv6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARMv7(value: ARMv7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARMv7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARMv8(value: ARMv8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARMv8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIPS(value: MIPS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIPS_64(value: MIPS_64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIPS_64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN(value: unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX86(value: X86): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X86")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX86_64(value: X86_64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X86_64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

