package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DeepCopier")
@js.native
class DeepCopier ()
  extends typingsSlinky.babylonjs.indexMod.DeepCopier
/* static members */
@JSImport("babylonjs/Legacy/legacy", "DeepCopier")
@js.native
object DeepCopier extends js.Object {
  
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  def DeepCopy(source: js.Any, destination: js.Any): Unit = js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.UndefOr[scala.Nothing],
    mustCopyList: js.Array[String]
  ): Unit = js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.Array[String],
    mustCopyList: js.Array[String]
  ): Unit = js.native
}
