package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that enables interactivity within UI elements. The action does not happen directly on
  * the client but rather invokes an Apps Script callback function with optional parameters.
  *
  *     var image = CardService.newImage()
  *         .setOnClickAction(CardService.newAction()
  *             .setFunctionName("handleImageClick")
  *             .setParameters({imageSrc: 'carImage'}));
  */
@js.native
trait Action extends js.Object {
  def setFunctionName(functionName: String): Action = js.native
  def setLoadIndicator(loadIndicator: LoadIndicator): Action = js.native
  /** @deprecated DO NOT USE */ def setMethodName(functionName: String): Action = js.native
  def setParameters(parameters: StringDictionary[String]): Action = js.native
}

object Action {
  @scala.inline
  def apply(
    setFunctionName: String => Action,
    setLoadIndicator: LoadIndicator => Action,
    setMethodName: String => Action,
    setParameters: StringDictionary[String] => Action
  ): Action = {
    val __obj = js.Dynamic.literal(setFunctionName = js.Any.fromFunction1(setFunctionName), setLoadIndicator = js.Any.fromFunction1(setLoadIndicator), setMethodName = js.Any.fromFunction1(setMethodName), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetFunctionName(value: String => Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFunctionName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLoadIndicator(value: LoadIndicator => Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMethodName(value: String => Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMethodName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParameters(value: StringDictionary[String] => Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParameters")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

