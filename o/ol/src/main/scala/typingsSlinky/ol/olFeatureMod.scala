package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColongeometry
import typingsSlinky.ol.styleStyleMod.StyleFunction
import typingsSlinky.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olFeatureMod {
  
  @JSImport("ol/Feature", JSImport.Default)
  @js.native
  class default[GeomType /* <: typingsSlinky.ol.geometryMod.default */] () extends Feature[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ol/Feature", "createStyleFunction")
  @js.native
  def createStyleFunction(obj: js.Array[typingsSlinky.ol.styleStyleMod.default]): StyleFunction = js.native
  @JSImport("ol/Feature", "createStyleFunction")
  @js.native
  def createStyleFunction(obj: StyleFunction): StyleFunction = js.native
  @JSImport("ol/Feature", "createStyleFunction")
  @js.native
  def createStyleFunction(obj: typingsSlinky.ol.styleStyleMod.default): StyleFunction = js.native
  
  @js.native
  trait Feature[GeomType /* <: typingsSlinky.ol.geometryMod.default */]
    extends typingsSlinky.ol.objectMod.default {
    
    /**
      * Get the feature's default geometry.  A feature may have any number of named
      * geometries.  The "default" geometry (the one that is rendered by default) is
      * set when calling {@link module:ol/Feature~Feature#setGeometry}.
      */
    def getGeometry(): js.UndefOr[GeomType] = js.native
    
    /**
      * Get the name of the feature's default geometry.  By default, the default
      * geometry is named geometry.
      */
    def getGeometryName(): String = js.native
    
    /**
      * Get the feature identifier.  This is a stable identifier for the feature and
      * is either set when reading data from a remote source or set explicitly by
      * calling {@link module:ol/Feature~Feature#setId}.
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * Get the feature's style. Will return what was provided to the
      * {@link module:ol/Feature~Feature#setStyle} method.
      */
    def getStyle(): js.UndefOr[StyleLike] = js.native
    
    /**
      * Get the feature's style function.
      */
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    
    @JSName("on")
    def on_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the default geometry for the feature.  This will update the property
      * with the name returned by {@link module:ol/Feature~Feature#getGeometryName}.
      */
    def setGeometry(): Unit = js.native
    def setGeometry(geometry: GeomType): Unit = js.native
    
    /**
      * Set the property name to be used when getting the feature's default geometry.
      * When calling {@link module:ol/Feature~Feature#getGeometry}, the value of the property with
      * this name will be returned.
      */
    def setGeometryName(name: String): Unit = js.native
    
    /**
      * Set the feature id.  The feature id is considered stable and may be used when
      * requesting features or comparing identifiers returned from a remote source.
      * The feature id can be used with the
      * {@link module:ol/source/Vector~VectorSource#getFeatureById} method.
      */
    def setId(): Unit = js.native
    def setId(id: String): Unit = js.native
    def setId(id: Double): Unit = js.native
    
    /**
      * Set the style for the feature to override the layer style.  This can be a
      * single style object, an array of styles, or a function that takes a
      * resolution and returns an array of styles. To unset the feature style, call
      * setStyle() without arguments or a falsey value.
      */
    def setStyle(): Unit = js.native
    def setStyle(opt_style: StyleLike): Unit = js.native
    
    @JSName("un")
    def un_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  type FeatureClass = Feature[typingsSlinky.ol.geometryMod.default] | typingsSlinky.ol.renderFeatureMod.default
  
  type FeatureLike = Feature[typingsSlinky.ol.geometryMod.default] | typingsSlinky.ol.renderFeatureMod.default
}
