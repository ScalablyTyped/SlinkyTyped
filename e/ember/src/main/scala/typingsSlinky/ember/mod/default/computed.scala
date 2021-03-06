package typingsSlinky.ember.mod.default

import typingsSlinky.emberObject.anon.Id
import typingsSlinky.emberObject.anon.Until
import typingsSlinky.emberObject.typesMod.ComputedPropertyCallback
import typingsSlinky.std.MethodDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof EmberObjectNs.computed` */
object computed {
  
  @JSImport("ember", "default.computed")
  @js.native
  def apply(deps: java.lang.String*): MethodDecorator = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply(
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    k7: java.lang.String,
    rest: js.Any*
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](cb: ComputedPropertyCallback[T]): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](k1: java.lang.String, cb: ComputedPropertyCallback[T]): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, cb: ComputedPropertyCallback[T]): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](k1: java.lang.String, k2: java.lang.String, k3: java.lang.String, cb: ComputedPropertyCallback[T]): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  @JSImport("ember", "default.computed")
  @js.native
  def apply[T](
    k1: java.lang.String,
    k2: java.lang.String,
    k3: java.lang.String,
    k4: java.lang.String,
    k5: java.lang.String,
    k6: java.lang.String,
    cb: ComputedPropertyCallback[T]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[T, T] = js.native
  
  /* was `typeof ComputedNamespace.alias` */
  @JSImport("ember", "default.computed.alias")
  @js.native
  def alias(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.and` */
  @JSImport("ember", "default.computed.and")
  @js.native
  def and(dependentKeys: java.lang.String*): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.bool` */
  @JSImport("ember", "default.computed.bool")
  @js.native
  def bool(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.collect` */
  @JSImport("ember", "default.computed.collect")
  @js.native
  def collect(dependentKeys: java.lang.String*): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.deprecatingAlias` */
  @JSImport("ember", "default.computed.deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  /* was `typeof ComputedNamespace.deprecatingAlias` */
  @JSImport("ember", "default.computed.deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: Id): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  @JSImport("ember", "default.computed.deprecatingAlias")
  @js.native
  def deprecatingAlias(dependentKey: java.lang.String, options: Until): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.empty` */
  @JSImport("ember", "default.computed.empty")
  @js.native
  def empty(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.equal` */
  @JSImport("ember", "default.computed.equal")
  @js.native
  def equal(dependentKey: java.lang.String, value: js.Any): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.filter` */
  @JSImport("ember", "default.computed.filter")
  @js.native
  def filter(
    dependentKey: java.lang.String,
    additionalDependentKeys: js.Array[java.lang.String],
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  /* was `typeof ComputedNamespace.filter` */
  @JSImport("ember", "default.computed.filter")
  @js.native
  def filter(
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.filterBy` */
  @JSImport("ember", "default.computed.filterBy")
  @js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("ember", "default.computed.filterBy")
  @js.native
  def filterBy(dependentKey: java.lang.String, propertyKey: java.lang.String, value: js.Any): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.gt` */
  @JSImport("ember", "default.computed.gt")
  @js.native
  def gt(dependentKey: java.lang.String, value: Double): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.gte` */
  @JSImport("ember", "default.computed.gte")
  @js.native
  def gte(dependentKey: java.lang.String, value: Double): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.intersect` */
  @JSImport("ember", "default.computed.intersect")
  @js.native
  def intersect(propertyKeys: java.lang.String*): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.lt` */
  @JSImport("ember", "default.computed.lt")
  @js.native
  def lt(dependentKey: java.lang.String, value: Double): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.lte` */
  @JSImport("ember", "default.computed.lte")
  @js.native
  def lte(dependentKey: java.lang.String, value: Double): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.map` */
  @JSImport("ember", "default.computed.map")
  @js.native
  def map[U](
    dependentKey: java.lang.String,
    callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[U], js.Array[U]] = js.native
  
  /* was `typeof ComputedNamespace.mapBy` */
  @JSImport("ember", "default.computed.mapBy")
  @js.native
  def mapBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.max` */
  @JSImport("ember", "default.computed.max")
  @js.native
  def max(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  
  /* was `typeof ComputedNamespace.min` */
  @JSImport("ember", "default.computed.min")
  @js.native
  def min(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  
  /* was `typeof ComputedNamespace.none` */
  @JSImport("ember", "default.computed.none")
  @js.native
  def none(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.not` */
  @JSImport("ember", "default.computed.not")
  @js.native
  def not(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.notEmpty` */
  @JSImport("ember", "default.computed.notEmpty")
  @js.native
  def notEmpty(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.oneWay` */
  @JSImport("ember", "default.computed.oneWay")
  @js.native
  def oneWay(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.or` */
  @JSImport("ember", "default.computed.or")
  @js.native
  def or(dependentKeys: java.lang.String*): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
  
  /* was `typeof ComputedNamespace.readOnly` */
  @JSImport("ember", "default.computed.readOnly")
  @js.native
  def readOnly(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.reads` */
  @JSImport("ember", "default.computed.reads")
  @js.native
  def reads(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[_, _] = js.native
  
  /* was `typeof ComputedNamespace.setDiff` */
  @JSImport("ember", "default.computed.setDiff")
  @js.native
  def setDiff(setAProperty: java.lang.String, setBProperty: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.sort` */
  @JSImport("ember", "default.computed.sort")
  @js.native
  def sort(
    itemsKey: java.lang.String,
    dependentKeys: js.Array[java.lang.String],
    sortDefinition: java.lang.String
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("ember", "default.computed.sort")
  @js.native
  def sort(
    itemsKey: java.lang.String,
    dependentKeys: js.Array[java.lang.String],
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  /* was `typeof ComputedNamespace.sort` */
  @JSImport("ember", "default.computed.sort")
  @js.native
  def sort(itemsKey: java.lang.String, sortDefinition: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  @JSImport("ember", "default.computed.sort")
  @js.native
  def sort(
    itemsKey: java.lang.String,
    sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]
  ): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.sum` */
  @JSImport("ember", "default.computed.sum")
  @js.native
  def sum(dependentKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[Double, Double] = js.native
  
  /* was `typeof ComputedNamespace.union` */
  @JSImport("ember", "default.computed.union")
  @js.native
  def union(propertyKeys: java.lang.String*): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.uniq` */
  @JSImport("ember", "default.computed.uniq")
  @js.native
  def uniq(propertyKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.uniqBy` */
  @JSImport("ember", "default.computed.uniqBy")
  @js.native
  def uniqBy(dependentKey: java.lang.String, propertyKey: java.lang.String): typingsSlinky.emberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  
  /* was `typeof ComputedNamespace.match` */
  @JSImport("ember", "default.computed.match")
  @js.native
  def `match`(dependentKey: java.lang.String, regexp: js.RegExp): typingsSlinky.emberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
}
