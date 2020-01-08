package typingsSlinky.activexDashWia

import typingsSlinky.activexDashWia.WIA.CommonDialog
import typingsSlinky.activexDashWia.WIA.DeviceManager
import typingsSlinky.activexDashWia.WIA.ImageFile
import typingsSlinky.activexDashWia.WIA.ImageProcess
import typingsSlinky.activexDashWia.WIA.Rational
import typingsSlinky.activexDashWia.WIA.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("WIA.CommonDialog")
  var WIADotCommonDialog: CommonDialog = js.native
  @JSName("WIA.DeviceManager")
  var WIADotDeviceManager: DeviceManager = js.native
  @JSName("WIA.ImageFile")
  var WIADotImageFile: ImageFile = js.native
  @JSName("WIA.ImageProcess")
  var WIADotImageProcess: ImageProcess = js.native
  @JSName("WIA.Rational")
  var WIADotRational: Rational = js.native
  @JSName("WIA.Vector")
  var WIADotVector_Original: Vector[_] = js.native
  /** Returns the specified item in the vector by position */
  @JSName("WIA.Vector")
  def WIADotVector(Index: Double): js.Any = js.native
}

