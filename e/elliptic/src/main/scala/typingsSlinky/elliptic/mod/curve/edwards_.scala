package typingsSlinky.elliptic.mod.curve

import typingsSlinky.elliptic.mod.BNInput
import typingsSlinky.elliptic.mod.curve.edwards.EdwardsConf
import typingsSlinky.elliptic.mod.curve.edwards.EdwardsPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "curve.edwards")
@js.native
class edwards_ protected () extends base {
  def this(conf: EdwardsConf) = this()
  
  var a: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  var c: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  var c2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  var d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  var dd: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  def point(x: BNInput, y: BNInput): EdwardsPoint = js.native
  def point(x: BNInput, y: BNInput, z: js.UndefOr[BNInput], t: BNInput): EdwardsPoint = js.native
  def point(x: BNInput, y: BNInput, z: BNInput): EdwardsPoint = js.native
  
  def pointFromJSON(obj: js.Array[BNInput]): EdwardsPoint = js.native
  
  def pointFromX(x: BNInput): EdwardsPoint = js.native
  def pointFromX(x: BNInput, odd: Boolean): EdwardsPoint = js.native
  
  def pointFromY(y: BNInput): EdwardsPoint = js.native
  def pointFromY(y: BNInput, odd: Boolean): EdwardsPoint = js.native
}
