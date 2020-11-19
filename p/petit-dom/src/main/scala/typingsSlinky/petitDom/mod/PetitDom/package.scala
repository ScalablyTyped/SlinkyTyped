package typingsSlinky.petitDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object PetitDom {
  
  type ComponentProps = js.Object
  
  type Content = java.lang.String | typingsSlinky.petitDom.mod.PetitDom.VNode
  
  type DOMElementProps[E /* <: org.scalajs.dom.raw.Element */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? E[P]}
    */ typingsSlinky.petitDom.petitDomStrings.DOMElementProps with org.scalablytyped.runtime.TopLevel[E]
  
  type Key = java.lang.String | scala.Double
  
  type Props[E /* <: org.scalajs.dom.raw.Element */] = typingsSlinky.petitDom.mod.PetitDom.IntrinsicProps with typingsSlinky.petitDom.mod.PetitDom.DOMElementProps[E]
  
  type ShouldUpdate[P /* <: typingsSlinky.petitDom.mod.PetitDom.ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[typingsSlinky.petitDom.mod.PetitDom.VNode], 
    /* oldContent */ js.Array[typingsSlinky.petitDom.mod.PetitDom.VNode], 
    scala.Boolean
  ]
}
