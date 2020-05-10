package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait decoratorsPropertyPropertyMetadata extends Object {
  /**
    * The property decorator that creates a two-way binding between the property it decorates and an inner property of one of its members.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var aliasOf: js.UndefOr[String] = js.native
  /**
    * The function to use to [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting) the property. Alternative to define the `type`. The function is called with the value set by the user and should return the cast value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var cast: js.UndefOr[js.Function] = js.native
  /**
    * Indicates whether the property can be set during construction but is otherwise read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    *
    * @default false
    */
  var constructOnly: js.UndefOr[Boolean] = js.native
  /**
    * Property names of dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var dependsOn: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether the property is read-only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    *
    * @default false
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * The constructor used to [autocast](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#autocasting) the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var `type`: js.UndefOr[js.Function] = js.native
  /**
    * The default value for the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html#property)
    */
  var value: js.UndefOr[js.Any] = js.native
}

object decoratorsPropertyPropertyMetadata {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): decoratorsPropertyPropertyMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[decoratorsPropertyPropertyMetadata]
  }
  @scala.inline
  implicit class decoratorsPropertyPropertyMetadataOps[Self <: decoratorsPropertyPropertyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasOf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasOf")(js.undefined)
        ret
    }
    @scala.inline
    def withCast(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withConstructOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDependsOn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependsOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

