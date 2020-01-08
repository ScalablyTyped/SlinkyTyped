package typingsSlinky.coreDashObject.coreDashObjectMod

import typingsSlinky.coreDashObject.dashPrivateUtilsMod.Constructor
import typingsSlinky.coreDashObject.dashPrivateUtilsMod.Mix
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-object", JSImport.Namespace)
@js.native
class ^ () extends CoreObject

@JSImport("core-object", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extend[BaseClass /* <: Constructor[_] */, Ext /* <: ExtendOptions[InstanceType[BaseClass]] */](options: Ext with (ExtendThisType[InstanceType[BaseClass], Ext])): BaseClass with (Constructor[Mix[InstanceType[BaseClass], Ext]]) = js.native
}

