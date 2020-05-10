package typingsSlinky.elasticlunr.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialisedIndexData[T] extends js.Object {
  var documentStore: SerialisedDocumentStore[T] = js.native
  var fields: js.Array[/* keyof T */ String] = js.native
  var index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typingsSlinky.elasticlunr.elasticlunrStrings.SerialisedIndexData with TopLevel[js.Any] = js.native
  var pipeline: SerialisedPipeline = js.native
  var ref: /* keyof T */ String = js.native
  var version: String = js.native
}

object SerialisedIndexData {
  @scala.inline
  def apply[T](
    documentStore: SerialisedDocumentStore[T],
    fields: js.Array[/* keyof T */ String],
    index: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
    */ typingsSlinky.elasticlunr.elasticlunrStrings.SerialisedIndexData with TopLevel[js.Any],
    pipeline: SerialisedPipeline,
    ref: /* keyof T */ String,
    version: String
  ): SerialisedIndexData[T] = {
    val __obj = js.Dynamic.literal(documentStore = documentStore.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedIndexData[T]]
  }
  @scala.inline
  implicit class SerialisedIndexDataOps[Self[t] <: SerialisedIndexData[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDocumentStore(value: SerialisedDocumentStore[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[/* keyof T */ String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? elasticlunr.elasticlunr.InvertedIndexNode}
      */ typingsSlinky.elasticlunr.elasticlunrStrings.SerialisedIndexData with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeline(value: SerialisedPipeline): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: /* keyof T */ String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

