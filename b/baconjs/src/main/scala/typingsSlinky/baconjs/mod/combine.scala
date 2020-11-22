package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.typesMod.Function0
import typingsSlinky.baconjs.typesMod.Function1
import typingsSlinky.baconjs.typesMod.Function2
import typingsSlinky.baconjs.typesMod.Function3
import typingsSlinky.baconjs.typesMod.Function4
import typingsSlinky.baconjs.typesMod.Function5
import typingsSlinky.baconjs.typesMod.Function6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "combine")
@js.native
object combine extends js.Object {
  
  def apply[R](fn: js.Function, observables: js.Array[default[_]]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[R](fn: Function0[R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[R](observables: js.Array[default[_]], fn: js.Function): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, R](a: default[V], fn: Function1[V, R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, R](fn: Function1[V, R], a: default[V]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, R](a: default[V], b: default[V2], fn: Function2[V, V2, R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, R](fn: Function2[V, V2, R], a: default[V], b: default[V2]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, R](a: default[V], b: default[V2], c: default[V3], fn: Function3[V, V2, V3, R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, R](fn: Function3[V, V2, V3, R], a: default[V], b: default[V2], c: default[V3]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, V4, R](a: default[V], b: default[V2], c: default[V3], d: default[V4], fn: Function4[V, V2, V3, V4, R]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, V4, R](fn: Function4[V, V2, V3, V4, R], a: default[V], b: default[V2], c: default[V3], d: default[V4]): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, V4, V5, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, V4, V5, V6, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
  def apply[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6]
  ): typingsSlinky.baconjs.observableMod.Property[R] = js.native
}
