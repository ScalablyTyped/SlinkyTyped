package typingsSlinky.ol.builderGroupMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ol.builderTypeMod.BuilderType
import typingsSlinky.ol.canvasMod.DeclutterGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuilderGroup extends js.Object {
  def addDeclutter(group: Boolean): DeclutterGroups = js.native
  def finish(): StringDictionary[typingsSlinky.ol.olStrings.BuilderGroup with TopLevel[js.Any]] = js.native
  def getBuilder(zIndex: js.UndefOr[Double], builderType: BuilderType): typingsSlinky.ol.vectorContextMod.default = js.native
}

object BuilderGroup {
  @scala.inline
  def apply(
    addDeclutter: Boolean => DeclutterGroups,
    finish: () => StringDictionary[typingsSlinky.ol.olStrings.BuilderGroup with TopLevel[js.Any]],
    getBuilder: (js.UndefOr[Double], BuilderType) => typingsSlinky.ol.vectorContextMod.default
  ): BuilderGroup = {
    val __obj = js.Dynamic.literal(addDeclutter = js.Any.fromFunction1(addDeclutter), finish = js.Any.fromFunction0(finish), getBuilder = js.Any.fromFunction2(getBuilder))
    __obj.asInstanceOf[BuilderGroup]
  }
  @scala.inline
  implicit class BuilderGroupOps[Self <: BuilderGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDeclutter(value: Boolean => DeclutterGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeclutter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinish(value: () => StringDictionary[typingsSlinky.ol.olStrings.BuilderGroup with TopLevel[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBuilder(value: (js.UndefOr[Double], BuilderType) => typingsSlinky.ol.vectorContextMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuilder")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

