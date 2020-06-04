package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formItemMod {
  type ChildrenType = typingsSlinky.antd.formItemMod.RenderChildren | slinky.core.TagMod[scala.Any]
  type RcFieldProps = typingsSlinky.std.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldProps */ js.Any, 
    typingsSlinky.antd.antdStrings.children
  ]
  type RenderChildren = js.Function1[
    /* form */ typingsSlinky.rcFieldForm.interfaceMod.FormInstance, 
    slinky.core.TagMod[scala.Any]
  ]
}
