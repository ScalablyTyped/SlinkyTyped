package typingsSlinky.emberData.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object DS {
  
  @scala.inline
  def VERSION: java.lang.String = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  @scala.inline
  def attr(): typingsSlinky.ember.mod.default.ComputedProperty[_, _] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")().asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[_, _]]
  @scala.inline
  def attr(options: typingsSlinky.emberData.mod.DS.AttrOptions[_]): typingsSlinky.ember.mod.default.ComputedProperty[_, _] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[_, _]]
  @scala.inline
  def attr(target: js.Any, propertyKey: java.lang.String): scala.Unit = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def attr_boolean(`type`: typingsSlinky.emberData.emberDataStrings.boolean): typingsSlinky.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean]]
  @scala.inline
  def attr_boolean(
    `type`: typingsSlinky.emberData.emberDataStrings.boolean,
    options: typingsSlinky.emberData.mod.DS.AttrOptions[scala.Boolean]
  ): typingsSlinky.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean] = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[scala.Boolean, scala.Boolean]]
  
  @scala.inline
  def attr_date(`type`: typingsSlinky.emberData.emberDataStrings.date): typingsSlinky.ember.mod.default.ComputedProperty[js.Date, js.Date] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[js.Date, js.Date]]
  @scala.inline
  def attr_date(
    `type`: typingsSlinky.emberData.emberDataStrings.date,
    options: typingsSlinky.emberData.mod.DS.AttrOptions[js.Date]
  ): typingsSlinky.ember.mod.default.ComputedProperty[js.Date, js.Date] = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[js.Date, js.Date]]
  
  @scala.inline
  def attr_number(`type`: typingsSlinky.emberData.emberDataStrings.number): typingsSlinky.ember.mod.default.ComputedProperty[scala.Double, scala.Double] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[scala.Double, scala.Double]]
  @scala.inline
  def attr_number(
    `type`: typingsSlinky.emberData.emberDataStrings.number,
    options: typingsSlinky.emberData.mod.DS.AttrOptions[scala.Double]
  ): typingsSlinky.ember.mod.default.ComputedProperty[scala.Double, scala.Double] = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[scala.Double, scala.Double]]
  
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  @scala.inline
  def attr_string(`type`: typingsSlinky.emberData.emberDataStrings.string): typingsSlinky.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String]]
  @scala.inline
  def attr_string(
    `type`: typingsSlinky.emberData.emberDataStrings.string,
    options: typingsSlinky.emberData.mod.DS.AttrOptions[java.lang.String]
  ): typingsSlinky.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String] = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("attr")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[java.lang.String, java.lang.String]]
  
  @scala.inline
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](modelName: K): typingsSlinky.ember.mod.default.ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typingsSlinky.emberData.mod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("belongsTo")(modelName.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[
    (/* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any) with (typingsSlinky.emberData.mod.DS.PromiseObject[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]), 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ]]
  /**
    * `DS.belongsTo` is used to define One-To-One and One-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  @scala.inline
  def belongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](
    modelName: K,
    options: (typingsSlinky.emberData.mod.DS.RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with typingsSlinky.emberData.mod.DS.Sync with typingsSlinky.emberData.mod.DS.Async
  ): typingsSlinky.ember.mod.default.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ] = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("belongsTo")(modelName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
  ]]
  
  /**
    * Convert an array of errors in JSON-API format into an object.
    */
  @scala.inline
  def errorsArrayToHash(errors: js.Array[_]): js.Object = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("errorsArrayToHash")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  /**
    * Convert an hash of errors into an array with errors in JSON-API format.
    */
  @scala.inline
  def errorsHashToArray(errors: js.Object): js.Array[_] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("errorsHashToArray")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](`type`: K): typingsSlinky.ember.mod.default.ComputedProperty[
    typingsSlinky.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsSlinky.ember.mod.Ember.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("hasMany")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[
    typingsSlinky.emberData.mod.DS.PromiseManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsSlinky.ember.mod.Ember.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ]]
  /**
    * `DS.hasMany` is used to define One-To-Many and Many-To-Many
    * relationships on a [DS.Model](/api/data/classes/DS.Model.html).
    */
  @scala.inline
  def hasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](
    `type`: K,
    options: (typingsSlinky.emberData.mod.DS.RelationshipOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]) with typingsSlinky.emberData.mod.DS.Sync with typingsSlinky.emberData.mod.DS.Async
  ): typingsSlinky.ember.mod.default.ComputedProperty[
    typingsSlinky.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsSlinky.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ] = (typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("hasMany")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.ember.mod.default.ComputedProperty[
    typingsSlinky.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ], 
    typingsSlinky.emberData.mod.DS.ManyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any
    ]
  ]]
  
  /**
    * This method normalizes a modelName into the format Ember Data uses
    * internally.
    */
  @scala.inline
  def normalizeModelName[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ java.lang.String */](modelName: K): java.lang.String = typingsSlinky.emberData.mod.DS.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeModelName")(modelName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
