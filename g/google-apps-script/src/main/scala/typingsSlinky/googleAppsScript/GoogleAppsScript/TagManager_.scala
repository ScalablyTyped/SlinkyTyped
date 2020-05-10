package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Collection.AccountsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Account
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.AccountAccess
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.BuiltInVariable
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Condition
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Container
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerAccess
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerVersion
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionRequestVersionOptions
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.CustomTemplate
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Entity
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Environment
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Folder
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Parameter
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.SetupTag
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Tag
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.TeardownTag
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Timestamp
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Trigger
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.UserPermission
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Variable
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.VariableFormatValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Workspace
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.Zone
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneBoundary
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneChildContainer
import typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneTypeRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagManager_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.native
  // Create a new instance of Account
  def newAccount(): Account = js.native
  // Create a new instance of AccountAccess
  def newAccountAccess(): AccountAccess = js.native
  // Create a new instance of BuiltInVariable
  def newBuiltInVariable(): BuiltInVariable = js.native
  // Create a new instance of Condition
  def newCondition(): Condition = js.native
  // Create a new instance of Container
  def newContainer(): Container = js.native
  // Create a new instance of ContainerAccess
  def newContainerAccess(): ContainerAccess = js.native
  // Create a new instance of ContainerVersion
  def newContainerVersion(): ContainerVersion = js.native
  // Create a new instance of CreateContainerVersionRequestVersionOptions
  def newCreateContainerVersionRequestVersionOptions(): CreateContainerVersionRequestVersionOptions = js.native
  // Create a new instance of CustomTemplate
  def newCustomTemplate(): CustomTemplate = js.native
  // Create a new instance of Entity
  def newEntity(): Entity = js.native
  // Create a new instance of Environment
  def newEnvironment(): Environment = js.native
  // Create a new instance of Folder
  def newFolder(): Folder = js.native
  // Create a new instance of Parameter
  def newParameter(): Parameter = js.native
  // Create a new instance of SetupTag
  def newSetupTag(): SetupTag = js.native
  // Create a new instance of Tag
  def newTag(): Tag = js.native
  // Create a new instance of TeardownTag
  def newTeardownTag(): TeardownTag = js.native
  // Create a new instance of Timestamp
  def newTimestamp(): Timestamp = js.native
  // Create a new instance of Trigger
  def newTrigger(): Trigger = js.native
  // Create a new instance of UserPermission
  def newUserPermission(): UserPermission = js.native
  // Create a new instance of Variable
  def newVariable(): Variable = js.native
  // Create a new instance of VariableFormatValue
  def newVariableFormatValue(): VariableFormatValue = js.native
  // Create a new instance of Workspace
  def newWorkspace(): Workspace = js.native
  // Create a new instance of Zone
  def newZone(): Zone = js.native
  // Create a new instance of ZoneBoundary
  def newZoneBoundary(): ZoneBoundary = js.native
  // Create a new instance of ZoneChildContainer
  def newZoneChildContainer(): ZoneChildContainer = js.native
  // Create a new instance of ZoneTypeRestriction
  def newZoneTypeRestriction(): ZoneTypeRestriction = js.native
}

object TagManager_ {
  @scala.inline
  def apply(
    newAccount: () => Account,
    newAccountAccess: () => AccountAccess,
    newBuiltInVariable: () => BuiltInVariable,
    newCondition: () => Condition,
    newContainer: () => Container,
    newContainerAccess: () => ContainerAccess,
    newContainerVersion: () => ContainerVersion,
    newCreateContainerVersionRequestVersionOptions: () => CreateContainerVersionRequestVersionOptions,
    newCustomTemplate: () => CustomTemplate,
    newEntity: () => Entity,
    newEnvironment: () => Environment,
    newFolder: () => Folder,
    newParameter: () => Parameter,
    newSetupTag: () => SetupTag,
    newTag: () => Tag,
    newTeardownTag: () => TeardownTag,
    newTimestamp: () => Timestamp,
    newTrigger: () => Trigger,
    newUserPermission: () => UserPermission,
    newVariable: () => Variable,
    newVariableFormatValue: () => VariableFormatValue,
    newWorkspace: () => Workspace,
    newZone: () => Zone,
    newZoneBoundary: () => ZoneBoundary,
    newZoneChildContainer: () => ZoneChildContainer,
    newZoneTypeRestriction: () => ZoneTypeRestriction
  ): TagManager_ = {
    val __obj = js.Dynamic.literal(newAccount = js.Any.fromFunction0(newAccount), newAccountAccess = js.Any.fromFunction0(newAccountAccess), newBuiltInVariable = js.Any.fromFunction0(newBuiltInVariable), newCondition = js.Any.fromFunction0(newCondition), newContainer = js.Any.fromFunction0(newContainer), newContainerAccess = js.Any.fromFunction0(newContainerAccess), newContainerVersion = js.Any.fromFunction0(newContainerVersion), newCreateContainerVersionRequestVersionOptions = js.Any.fromFunction0(newCreateContainerVersionRequestVersionOptions), newCustomTemplate = js.Any.fromFunction0(newCustomTemplate), newEntity = js.Any.fromFunction0(newEntity), newEnvironment = js.Any.fromFunction0(newEnvironment), newFolder = js.Any.fromFunction0(newFolder), newParameter = js.Any.fromFunction0(newParameter), newSetupTag = js.Any.fromFunction0(newSetupTag), newTag = js.Any.fromFunction0(newTag), newTeardownTag = js.Any.fromFunction0(newTeardownTag), newTimestamp = js.Any.fromFunction0(newTimestamp), newTrigger = js.Any.fromFunction0(newTrigger), newUserPermission = js.Any.fromFunction0(newUserPermission), newVariable = js.Any.fromFunction0(newVariable), newVariableFormatValue = js.Any.fromFunction0(newVariableFormatValue), newWorkspace = js.Any.fromFunction0(newWorkspace), newZone = js.Any.fromFunction0(newZone), newZoneBoundary = js.Any.fromFunction0(newZoneBoundary), newZoneChildContainer = js.Any.fromFunction0(newZoneChildContainer), newZoneTypeRestriction = js.Any.fromFunction0(newZoneTypeRestriction))
    __obj.asInstanceOf[TagManager_]
  }
  @scala.inline
  implicit class TagManager_Ops[Self <: TagManager_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAccount(value: () => Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAccountAccess(value: () => AccountAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAccountAccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBuiltInVariable(value: () => BuiltInVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBuiltInVariable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCondition(value: () => Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCondition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewContainer(value: () => Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewContainerAccess(value: () => ContainerAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContainerAccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewContainerVersion(value: () => ContainerVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newContainerVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateContainerVersionRequestVersionOptions(value: () => CreateContainerVersionRequestVersionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateContainerVersionRequestVersionOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCustomTemplate(value: () => CustomTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCustomTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEntity(value: () => Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEntity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEnvironment(value: () => Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEnvironment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFolder(value: () => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParameter(value: () => Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParameter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSetupTag(value: () => SetupTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSetupTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTag(value: () => Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTeardownTag(value: () => TeardownTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTeardownTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTimestamp(value: () => Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTimestamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTrigger(value: () => Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTrigger")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUserPermission(value: () => UserPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUserPermission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVariable(value: () => Variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVariable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVariableFormatValue(value: () => VariableFormatValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVariableFormatValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWorkspace(value: () => Workspace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWorkspace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewZone(value: () => Zone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewZoneBoundary(value: () => ZoneBoundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newZoneBoundary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewZoneChildContainer(value: () => ZoneChildContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newZoneChildContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewZoneTypeRestriction(value: () => ZoneTypeRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newZoneTypeRestriction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAccounts(value: AccountsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(js.undefined)
        ret
    }
  }
  
}

