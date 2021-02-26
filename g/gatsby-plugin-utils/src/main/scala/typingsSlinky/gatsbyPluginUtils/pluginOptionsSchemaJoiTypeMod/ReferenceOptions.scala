package typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typingsSlinky.gatsbyPluginUtils.anon.Global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceOptions extends HierarchySeparatorOptions {
  
  /**
    * a function with the signature `function(value)` where `value` is the resolved reference value and the return value is the adjusted value to use.
    * Note that the adjust feature will not perform any type validation on the adjusted value and it must match the value expected by the rule it is used in.
    * Cannot be used with `map`.
    *
    * @example `(value) => value + 5`
    */
  var adjust: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * If set to a number, sets the reference relative starting point.
    * Cannot be combined with separator prefix characters.
    * Defaults to the reference key prefix (or 1 if none present)
    */
  var ancestor: js.UndefOr[Double] = js.native
  
  /**
    * creates an in-reference.
    */
  var in: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, the reference resolves by reaching into maps and sets.
    */
  var iterables: js.UndefOr[Boolean] = js.native
  
  /**
    * an array of array pairs using the format `[[key, value], [key, value]]` used to maps the resolved reference value to another value.
    * If the resolved value is not in the map, it is returned as-is.
    * Cannot be used with `adjust`.
    */
  var map: js.UndefOr[js.Array[js.Tuple2[_, _]]] = js.native
  
  /**
    * overrides default prefix characters.
    */
  var prefix: js.UndefOr[Global] = js.native
}
object ReferenceOptions {
  
  @scala.inline
  def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  
  @scala.inline
  implicit class ReferenceOptionsMutableBuilder[Self <: ReferenceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjust(value: /* value */ js.Any => _): Self = StObject.set(x, "adjust", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    
    @scala.inline
    def setAncestor(value: Double): Self = StObject.set(x, "ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorUndefined: Self = StObject.set(x, "ancestor", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    @scala.inline
    def setIterables(value: Boolean): Self = StObject.set(x, "iterables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterablesUndefined: Self = StObject.set(x, "iterables", js.undefined)
    
    @scala.inline
    def setMap(value: js.Array[js.Tuple2[_, _]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: (js.Tuple2[js.Any, js.Any])*): Self = StObject.set(x, "map", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: Global): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
