package typingsSlinky.petitDashDom.petitDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PetitDom {
  import org.scalajs.dom.raw.Element

  type ComponentProps = js.Object
  type Content = String | VNode
  type DOMElementProps[E /* <: Element */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? E[P]}
    */ typingsSlinky.petitDashDom.petitDashDomStrings.DOMElementProps with E
  type Key = String | Double
  type Props[E /* <: Element */] = IntrinsicProps with DOMElementProps[E]
  type ShouldUpdate[P /* <: ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[VNode], 
    /* oldContent */ js.Array[VNode], 
    Boolean
  ]
}
