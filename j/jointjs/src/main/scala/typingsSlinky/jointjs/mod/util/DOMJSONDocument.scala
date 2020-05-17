package typingsSlinky.jointjs.mod.util

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMJSONDocument extends js.Object {
  var fragment: DocumentFragment = js.native
  var groupSelectors: StringDictionary[js.Array[Element]] = js.native
  var selectors: StringDictionary[Element] = js.native
}

object DOMJSONDocument {
  @scala.inline
  def apply(
    fragment: DocumentFragment,
    groupSelectors: StringDictionary[js.Array[Element]],
    selectors: StringDictionary[Element]
  ): DOMJSONDocument = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], groupSelectors = groupSelectors.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMJSONDocument]
  }
  @scala.inline
  implicit class DOMJSONDocumentOps[Self <: DOMJSONDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragment(value: DocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSelectors(value: StringDictionary[js.Array[Element]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectors(value: StringDictionary[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

