package typingsSlinky.ol.builderGroupMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ol.builderTypeMod.BuilderType
import typingsSlinky.ol.canvasMod.DeclutterGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuilderGroup extends js.Object {
  def addDeclutter(group: Boolean): DeclutterGroups
  def finish(): StringDictionary[typingsSlinky.ol.olStrings.BuilderGroup with TopLevel[js.Any]]
  def getBuilder(zIndex: js.UndefOr[Double], builderType: BuilderType): typingsSlinky.ol.vectorContextMod.default
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
}

