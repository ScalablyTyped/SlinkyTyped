package typingsSlinky.petitDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PetitDom {
  type ComponentProps = js.Object
  type DOMElementProps[E /* <: org.scalajs.dom.raw.Element */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? E[P]}
    */ typingsSlinky.petitDom.petitDomStrings.DOMElementProps with org.scalablytyped.runtime.TopLevel[E]
  type Props[E /* <: org.scalajs.dom.raw.Element */] = typingsSlinky.petitDom.mod.PetitDom.IntrinsicProps with typingsSlinky.petitDom.mod.PetitDom.DOMElementProps[E]
  type ShouldUpdate[P /* <: typingsSlinky.petitDom.mod.PetitDom.ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[typingsSlinky.petitDom.mod.PetitDom.VNode], 
    /* oldContent */ js.Array[typingsSlinky.petitDom.mod.PetitDom.VNode], 
    scala.Boolean
  ]
}
