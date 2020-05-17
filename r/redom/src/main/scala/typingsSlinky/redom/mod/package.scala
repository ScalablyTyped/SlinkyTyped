package typingsSlinky.redom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RedomComponentConstructor = typingsSlinky.redom.mod.RedomComponentClass
  type RedomComponentFactoryFunction = js.Function0[typingsSlinky.redom.mod.RedomComponent]
  type RedomMiddleware = js.Function1[/* el */ org.scalajs.dom.raw.HTMLElement, scala.Unit]
  type RouterDictionary = org.scalablytyped.runtime.StringDictionary[typingsSlinky.redom.mod.RedomComponentConstructor]
}
