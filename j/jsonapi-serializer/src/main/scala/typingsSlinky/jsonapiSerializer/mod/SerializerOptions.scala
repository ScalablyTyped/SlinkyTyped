package typingsSlinky.jsonapiSerializer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializerOptions extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.native
  var dataLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
  var dataMeta: js.UndefOr[js.Function0[Unit] | js.Object] = js.native
  var id: js.UndefOr[String] = js.native
  var ignoreRelationshipData: js.UndefOr[Boolean] = js.native
  var included: js.UndefOr[Boolean] = js.native
  var keyForAttribute: js.UndefOr[String | KeyForAttribute] = js.native
  var meta: js.UndefOr[js.Object] = js.native
  var nullIfMissing: js.UndefOr[Boolean] = js.native
  var pluralizeType: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[js.Function0[Unit] | Boolean | String] = js.native
  var relationshipLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
  var relationshipMeta: js.UndefOr[js.Object] = js.native
  var topLevelLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
  var transform: js.UndefOr[Transform] = js.native
  var typeForAttribute: js.UndefOr[TypeForAttribute] = js.native
}

object SerializerOptions {
  @scala.inline
  def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLinks(value: StringDictionary[String | LinkFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMetaFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMeta")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDataMeta(value: js.Function0[Unit] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRelationshipData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRelationshipData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRelationshipData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRelationshipData")(js.undefined)
        ret
    }
    @scala.inline
    def withIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyForAttributeFunction1(value: /* attribute */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyForAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyForAttribute(value: String | KeyForAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyForAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyForAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyForAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withNullIfMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullIfMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullIfMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullIfMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralizeType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withRefFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRef(value: js.Function0[Unit] | Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipLinks(value: StringDictionary[String | LinkFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipMeta(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLevelLinks(value: StringDictionary[String | LinkFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLevelLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLevelLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* record */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeForAttribute(value: (/* attribute */ String, /* object */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeForAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTypeForAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeForAttribute")(js.undefined)
        ret
    }
  }
  
}

