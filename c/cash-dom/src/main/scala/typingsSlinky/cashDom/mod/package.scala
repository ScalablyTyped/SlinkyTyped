package typingsSlinky.cashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparator = java.lang.String | typingsSlinky.cashDom.mod.Ele | typingsSlinky.cashDom.mod.Cash | (js.ThisFunction2[
    /* this */ typingsSlinky.cashDom.mod.EleLoose, 
    /* index */ scala.Double, 
    /* ele */ typingsSlinky.cashDom.mod.EleLoose, 
    scala.Boolean
  ])
  
  type Context = org.scalajs.dom.raw.Document | org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.Element
  
  type EachArrayCallback[T] = js.ThisFunction2[/* this */ T, /* index */ scala.Double, /* ele */ T, js.Any]
  
  type EachObjectCallback[T] = js.ThisFunction2[/* this */ T, /* key */ java.lang.String, /* value */ T, js.Any]
  
  type Ele = org.scalajs.dom.raw.Window | org.scalajs.dom.raw.Document | org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Node
  
  type EleLoose = org.scalajs.dom.raw.HTMLElement with org.scalajs.dom.raw.Element with org.scalajs.dom.raw.Node
  
  type MapCallback[T] = js.ThisFunction2[/* this */ T, /* index */ scala.Double, /* ele */ T, typingsSlinky.cashDom.mod.Ele]
  
  type PlainObject[T] = typingsSlinky.std.Record[java.lang.String, T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cashDom.mod.falsy
    - java.lang.String
    - js.Function
    - typingsSlinky.std.HTMLCollection
    - typingsSlinky.std.NodeList
    - typingsSlinky.cashDom.mod.Ele
    - js.Array[typingsSlinky.cashDom.mod.Ele]
    - typingsSlinky.std.ArrayLike[typingsSlinky.cashDom.mod.Ele]
    - typingsSlinky.cashDom.mod.Cash
  */
  type Selector = js.UndefOr[
    typingsSlinky.cashDom.mod._Selector | js.Array[typingsSlinky.cashDom.mod.Ele] | typingsSlinky.std.ArrayLike[typingsSlinky.cashDom.mod.Ele] | java.lang.String | js.Function | org.scalajs.dom.raw.HTMLCollection | org.scalajs.dom.raw.NodeList | typingsSlinky.cashDom.mod.Ele | scala.Null
  ]
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.cashDom.cashDomBooleans.`false`
    - typingsSlinky.cashDom.cashDomNumbers.`0`
    - typingsSlinky.cashDom.cashDomStrings._empty
  */
  type falsy = js.UndefOr[typingsSlinky.cashDom.mod._falsy | scala.Null]
}
