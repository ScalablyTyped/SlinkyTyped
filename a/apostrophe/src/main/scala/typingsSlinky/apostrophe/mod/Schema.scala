package typingsSlinky.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  def addFieldType(`type`: AposType): Unit = js.native
  def addFilters(schema: Schema, options: js.Any, cursor: js.Any): Unit = js.native
  def addJoinSlugFilter(field: js.Any, cursor: js.Any, suffix: js.Any): Unit = js.native
  def afterInit(): Unit = js.native
  def compose(options: AposObject): Unit = js.native
  def convert(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
  def createRoutes(): js.Array[_] = js.native
  def cursorFilterInterested(cursor: js.Any, name: String): Unit = js.native
  def empty(schema: Schema, `object`: AposObject): Unit = js.native
  def export(
    req: js.Any,
    schema: Schema,
    to: js.Any,
    `object`: AposObject,
    output: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
  def getFieldType(typeName: String): Unit = js.native
  def indexFields(schema: Schema, `object`: AposObject, texts: js.Any): Unit = js.native
  def isVisible(schema: Schema, `object`: AposObject, name: String): Unit = js.native
  def join(req: js.Any, schema: Schema, objectOrArray: js.Any, withJoins: js.Any, callback: js.Function0[_]): Unit = js.native
  def joinDriver(
    req: js.Any,
    method: js.Any,
    reverse: js.Any,
    items: js.Any,
    idField: js.Any,
    relationshipsField: js.Any,
    objectField: js.Any,
    options: js.Any,
    callback: js.Function0[_]
  ): Unit = js.native
  def joinFilterChoices(field: js.Any, cursor: js.Any, valueField: js.Any): Unit = js.native
  def newInstance(schema: Schema): js.Any = js.native
  def pageServe(req: js.Any): Unit = js.native
  def pushAssets(): Unit = js.native
  def pushCreateSingleton(): Unit = js.native
  def refine(schema: Schema, options: AposObject): Unit = js.native
  def sortedDistinct(property: js.Any, cursor: js.Any, callback: js.Function0[_]): Unit = js.native
  def subset(schema: Schema, fields: Fields): Schema = js.native
  def subsetInstance(schema: Schema, instance: AposObject): js.Any = js.native
  def toGroups(fields: Fields): Unit = js.native
  def validate(schema: Schema, options: js.Any): Unit = js.native
}

object Schema {
  @scala.inline
  def apply(
    addFieldType: AposType => Unit,
    addFilters: (Schema, js.Any, js.Any) => Unit,
    addJoinSlugFilter: (js.Any, js.Any, js.Any) => Unit,
    afterInit: () => Unit,
    compose: AposObject => Unit,
    convert: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit,
    createRoutes: () => js.Array[_],
    cursorFilterInterested: (js.Any, String) => Unit,
    empty: (Schema, AposObject) => Unit,
    export: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit,
    getFieldType: String => Unit,
    indexFields: (Schema, AposObject, js.Any) => Unit,
    isVisible: (Schema, AposObject, String) => Unit,
    join: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => Unit,
    joinDriver: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => Unit,
    joinFilterChoices: (js.Any, js.Any, js.Any) => Unit,
    newInstance: Schema => js.Any,
    pageServe: js.Any => Unit,
    pushAssets: () => Unit,
    pushCreateSingleton: () => Unit,
    refine: (Schema, AposObject) => Unit,
    sortedDistinct: (js.Any, js.Any, js.Function0[_]) => Unit,
    subset: (Schema, Fields) => Schema,
    subsetInstance: (Schema, AposObject) => js.Any,
    toGroups: Fields => Unit,
    validate: (Schema, js.Any) => Unit
  ): Schema = {
    val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1(addFieldType), addFilters = js.Any.fromFunction3(addFilters), addJoinSlugFilter = js.Any.fromFunction3(addJoinSlugFilter), afterInit = js.Any.fromFunction0(afterInit), compose = js.Any.fromFunction1(compose), convert = js.Any.fromFunction6(convert), createRoutes = js.Any.fromFunction0(createRoutes), cursorFilterInterested = js.Any.fromFunction2(cursorFilterInterested), empty = js.Any.fromFunction2(empty), export = js.Any.fromFunction6(export), getFieldType = js.Any.fromFunction1(getFieldType), indexFields = js.Any.fromFunction3(indexFields), isVisible = js.Any.fromFunction3(isVisible), join = js.Any.fromFunction5(join), joinDriver = js.Any.fromFunction9(joinDriver), joinFilterChoices = js.Any.fromFunction3(joinFilterChoices), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1(pageServe), pushAssets = js.Any.fromFunction0(pushAssets), pushCreateSingleton = js.Any.fromFunction0(pushCreateSingleton), refine = js.Any.fromFunction2(refine), sortedDistinct = js.Any.fromFunction3(sortedDistinct), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1(toGroups), validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFieldType(value: AposType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFieldType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddFilters(value: (Schema, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilters")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddJoinSlugFilter(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addJoinSlugFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAfterInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompose(value: AposObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvert(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withCreateRoutes(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRoutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCursorFilterInterested(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorFilterInterested")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEmpty(value: (Schema, AposObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExport(value: (js.Any, Schema, js.Any, AposObject, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withGetFieldType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndexFields(value: (Schema, AposObject, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFields")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: (Schema, AposObject, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withJoin(value: (js.Any, Schema, js.Any, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withJoinDriver(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinDriver")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withJoinFilterChoices(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinFilterChoices")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNewInstance(value: Schema => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPageServe(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageServe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPushAssets(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushAssets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPushCreateSingleton(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushCreateSingleton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefine(value: (Schema, AposObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortedDistinct(value: (js.Any, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedDistinct")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSubset(value: (Schema, Fields) => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubsetInstance(value: (Schema, AposObject) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subsetInstance")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToGroups(value: Fields => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidate(value: (Schema, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

