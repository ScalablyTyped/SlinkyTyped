package typingsSlinky.elasticlunr.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialisedDocumentStore[T] extends js.Object {
  var docInfo: StringDictionary[
    typingsSlinky.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with TopLevel[js.Any]
  ] = js.native
  var docs: StringDictionary[T] = js.native
}

object SerialisedDocumentStore {
  @scala.inline
  def apply[T](
    docInfo: StringDictionary[
      typingsSlinky.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with TopLevel[js.Any]
    ],
    docs: StringDictionary[T]
  ): SerialisedDocumentStore[T] = {
    val __obj = js.Dynamic.literal(docInfo = docInfo.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedDocumentStore[T]]
  }
  @scala.inline
  implicit class SerialisedDocumentStoreOps[Self[t] <: SerialisedDocumentStore[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDocInfo(
      value: StringDictionary[
          typingsSlinky.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with TopLevel[js.Any]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs(value: StringDictionary[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

