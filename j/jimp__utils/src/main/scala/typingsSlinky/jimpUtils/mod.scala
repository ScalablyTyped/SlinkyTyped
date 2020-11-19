package typingsSlinky.jimpUtils

import typingsSlinky.jimpUtils.jimpUtilsBooleans.`false`
import typingsSlinky.jimpUtils.jimpUtilsBooleans.`true`
import typingsSlinky.std.Omit
import typingsSlinky.typescript.mod.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isNodePattern(cb: js.Function): `true` = js.native
  def isNodePattern(cb: Omit[_, js.Function]): `false` = js.native
  
  def scan(
    image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ js.Any,
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.Function4[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Image */ /* image */ js.Any, 
      /* _x */ Double, 
      /* _y */ Double, 
      /* idx */ Double, 
      Unit
    ]
  ): js.Any = js.native
  
  def throwError(error: String): ThrowStatement = js.native
  def throwError(error: String, cb: js.Function1[/* err */ js.Error, Unit]): ThrowStatement = js.native
  def throwError(error: js.Error): ThrowStatement = js.native
  def throwError(error: js.Error, cb: js.Function1[/* err */ js.Error, Unit]): ThrowStatement = js.native
}
