package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "security")
@js.native
object security extends js.Object {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
    */
  @js.native
  abstract class AccessRuleContainerBase protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.AccessRuleContainerBase {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object AccessRuleContainerBase extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
    */
  @js.native
  class DemoUser protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.DemoUser {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object DemoUser extends js.Object {
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.securityMod.security.ProjectSecurity): typingsSlinky.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class FileDocumentAccessRuleContainer protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.FileDocumentAccessRuleContainer {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object FileDocumentAccessRuleContainer extends js.Object {
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.securityMod.security.ProjectSecurity): typingsSlinky.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ImageAccessRuleContainer protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.ImageAccessRuleContainer {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object ImageAccessRuleContainer extends js.Object {
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.securityMod.security.ProjectSecurity): typingsSlinky.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
    */
  @js.native
  class ModuleRole protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.ModuleRole {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object ModuleRole extends js.Object {
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.securityMod.security.ModuleSecurity): typingsSlinky.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
    */
  @js.native
  class ModuleSecurity protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.ModuleSecurity {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  /* static members */
  @js.native
  object ModuleSecurity extends js.Object {
    
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: IModule): typingsSlinky.mendixmodelsdk.securityMod.security.ModuleSecurity = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
    */
  @js.native
  class PasswordPolicySettings protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.PasswordPolicySettings {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object PasswordPolicySettings extends js.Object {
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.securityMod.security.ProjectSecurity): typingsSlinky.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
    */
  @js.native
  class ProjectSecurity protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.ProjectSecurity {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object ProjectSecurity extends js.Object {
    
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.securityMod.security.ProjectSecurity = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class SecurityLevel ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.SecurityLevel
  /* static members */
  @js.native
  object SecurityLevel extends js.Object {
    
    var CheckEverything: typingsSlinky.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    
    var CheckFormsAndMicroflows: typingsSlinky.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    
    var CheckNothing: typingsSlinky.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/user-roles relevant section in reference guide}
    */
  @js.native
  class UserRole protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.security.UserRole {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  /* static members */
  @js.native
  object UserRole extends js.Object {
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.securityMod.security.ProjectSecurity): typingsSlinky.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
}
