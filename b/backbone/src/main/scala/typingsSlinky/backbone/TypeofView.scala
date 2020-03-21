package typingsSlinky.backbone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.View
import typingsSlinky.backbone.mod.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofView
  extends Instantiable0[View[Model]]
     with Instantiable1[
      /* options */ ViewOptions[/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any], 
      View[Model]
    ] {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  def extend(properties: js.Any): js.Any = js.native
  def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
}

