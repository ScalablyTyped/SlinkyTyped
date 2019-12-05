package typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEntityMutability
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEntityType
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Entity.DraftEntityInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T * / any} */ @js.native
trait ContentState extends js.Object {
  def addEntity(instance: DraftEntityInstance): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createEntity(`type`: DraftEntityType, mutability: DraftEntityMutability, data: js.Object): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def getBlockAfter(key: String): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getBlockBefore(key: String): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getBlockForKey(key: String): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getBlockMap(): BlockMap = js.native
  def getBlocksAsArray(): js.Array[typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock] = js.native
  def getEntity(key: String): js.Any = js.native
  def getEntityMap(): js.Any = js.native
  def getFirstBlock(): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getKeyAfter(key: String): String = js.native
  def getKeyBefore(key: String): String = js.native
  def getLastBlock(): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock = js.native
  def getLastCreatedEntityKey(): String = js.native
  def getPlainText(): String = js.native
  def getPlainText(delimiter: String): String = js.native
  def getSelectionAfter(): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState = js.native
  def getSelectionBefore(): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState = js.native
  def hasText(): Boolean = js.native
  def mergeEntityData(key: String, toMerge: StringDictionary[js.Any]): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def replaceEntityData(key: String, toMerge: StringDictionary[js.Any]): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
}

