package typingsSlinky.alexaSdk.mod.templateBuilders

import typingsSlinky.alexaSdk.mod.Image
import typingsSlinky.alexaSdk.mod.ListItem
import typingsSlinky.alexaSdk.mod.TextField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to build a list of ListItems for ListTemplate
  */
@JSImport("alexa-sdk", "templateBuilders.ListItemBuilder")
@js.native
class ListItemBuilder () extends js.Object {
  
  /**
    * Add an item to the list of template
    * @param image image
    * @param token token
    * @param primaryText primaryText
    * @param secondaryText secondaryText
    * @param tertiaryText tertiaryText
    */
  def addItem(image: Image, token: String, primaryText: TextField): ListItemBuilder = js.native
  def addItem(
    image: Image,
    token: String,
    primaryText: TextField,
    secondaryText: js.UndefOr[scala.Nothing],
    tertiaryText: TextField
  ): ListItemBuilder = js.native
  def addItem(image: Image, token: String, primaryText: TextField, secondaryText: TextField): ListItemBuilder = js.native
  def addItem(
    image: Image,
    token: String,
    primaryText: TextField,
    secondaryText: TextField,
    tertiaryText: TextField
  ): ListItemBuilder = js.native
  
  def build(): js.Array[ListItem] = js.native
  
  var items: js.Array[ListItem] = js.native
}
