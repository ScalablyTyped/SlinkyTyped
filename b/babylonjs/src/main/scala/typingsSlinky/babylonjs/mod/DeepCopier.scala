package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DeepCopier")
@js.native
class DeepCopier ()
  extends typingsSlinky.babylonjs.legacyMod.DeepCopier
/* static members */
object DeepCopier {
  
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  @JSImport("babylonjs", "DeepCopier.DeepCopy")
  @js.native
  def DeepCopy(source: js.Any, destination: js.Any): Unit = js.native
  @JSImport("babylonjs", "DeepCopier.DeepCopy")
  @js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.UndefOr[scala.Nothing],
    mustCopyList: js.Array[String]
  ): Unit = js.native
  @JSImport("babylonjs", "DeepCopier.DeepCopy")
  @js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = js.native
  @JSImport("babylonjs", "DeepCopier.DeepCopy")
  @js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.Array[String],
    mustCopyList: js.Array[String]
  ): Unit = js.native
}
