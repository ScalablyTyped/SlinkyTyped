package typingsSlinky.petitDashDom.petitDashDomMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Component
  import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.ComponentProps
  import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.DomElements
  import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.IntrinsicProps
  import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.Props
  import typingsSlinky.petitDashDom.petitDashDomMod.PetitDom.VNode

  // tslint:disable-next-line:no-empty-interface
  type Element = VNode
  // tslint:disable-next-line:no-empty-interface
  type ElementClass = Component[ComponentProps]
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = IntrinsicProps
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = Props[org.scalajs.dom.raw.Element]
  type IntrinsicElements = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'main' ]: petit-dom.petit-dom.PetitDom.Props<petit-dom.petit-dom.PetitDom.DomElements[P]> & {  content? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>}}
    */ typingsSlinky.petitDashDom.petitDashDomStrings.IntrinsicElements with DomElements
}
