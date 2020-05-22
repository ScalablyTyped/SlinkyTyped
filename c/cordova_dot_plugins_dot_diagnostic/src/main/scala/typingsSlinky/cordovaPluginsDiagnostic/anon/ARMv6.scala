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

trait ARMv6 extends js.Object {
  var ARMv6: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6
  var ARMv7: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7
  var ARMv8: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8
  // Android only
  var MIPS: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS
  var MIPS_64: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64
  // Both iOS and Android
  var UNKNOWN: unknown
  var X86: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86
  var X86_64: typingsSlinky.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64
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
}

