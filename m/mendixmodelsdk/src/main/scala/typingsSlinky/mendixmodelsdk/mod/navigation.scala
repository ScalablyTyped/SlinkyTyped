package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigation {
  
  @JSImport("mendixmodelsdk", "navigation.DeviceType")
  @js.native
  class DeviceType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.DeviceType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DeviceType {
    
    @JSImport("mendixmodelsdk", "navigation.DeviceType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.DeviceType.Desktop")
    @js.native
    def Desktop: typingsSlinky.mendixmodelsdk.navigationMod.navigation.DeviceType = js.native
    @scala.inline
    def Desktop_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.DeviceType.Phone")
    @js.native
    def Phone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.DeviceType = js.native
    @scala.inline
    def Phone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.DeviceType.Tablet")
    @js.native
    def Tablet: typingsSlinky.mendixmodelsdk.navigationMod.navigation.DeviceType = js.native
    @scala.inline
    def Tablet_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.HomePage")
  @js.native
  class HomePage protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.HomePage {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object HomePage {
    
    @JSImport("mendixmodelsdk", "navigation.HomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePage.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.HomePage = js.native
    
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * The new HomePage will be automatically stored in the 'homePage' property
      * of the parent NavigationProfile element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePage.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile): typingsSlinky.mendixmodelsdk.navigationMod.navigation.HomePage = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePage.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
    */
  @JSImport("mendixmodelsdk", "navigation.HomePageBase")
  @js.native
  abstract class HomePageBase protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.HomePageBase {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object HomePageBase {
    
    @JSImport("mendixmodelsdk", "navigation.HomePageBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePageBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePageBase.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.22.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile")
  @js.native
  class NativeNavigationProfile protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.NativeNavigationProfile {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativeNavigationProfile {
    
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile = js.native
    
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "navigation.NavigationDocument")
  @js.native
  class NavigationDocument protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.NavigationDocument {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object NavigationDocument {
    
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NavigationDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument.createIn")
    @js.native
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.2.0: added public
    */
  @JSImport("mendixmodelsdk", "navigation.NavigationProfile")
  @js.native
  class NavigationProfile protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.NavigationProfile {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NavigationProfile {
    
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderDesktopProfile")
    @js.native
    def createInNavigationDocumentUnderDesktopProfile(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderHybridPhoneProfile")
    @js.native
    def createInNavigationDocumentUnderHybridPhoneProfile(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderHybridPhoneProfile6")
    @js.native
    def createInNavigationDocumentUnderHybridPhoneProfile6(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderHybridTabletProfile")
    @js.native
    def createInNavigationDocumentUnderHybridTabletProfile(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderHybridTabletProfile6")
    @js.native
    def createInNavigationDocumentUnderHybridTabletProfile6(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.0.1
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderOfflinePhoneProfile")
    @js.native
    def createInNavigationDocumentUnderOfflinePhoneProfile(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderPhoneProfile")
    @js.native
    def createInNavigationDocumentUnderPhoneProfile(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderProfiles")
    @js.native
    def createInNavigationDocumentUnderProfiles(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.createInNavigationDocumentUnderTabletProfile")
    @js.native
    def createInNavigationDocumentUnderTabletProfile(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase")
  @js.native
  abstract class NavigationProfileBase protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.NavigationProfileBase {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NavigationProfileBase {
    
    @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.22.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
  @js.native
  class OfflineEntityConfig protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.OfflineEntityConfig {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OfflineEntityConfig {
    
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntityConfig = js.native
    
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
      * of the parent NavigationProfileBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfileBase): typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntityConfig = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode")
  @js.native
  class OfflineEntitySyncDownloadMode protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.OfflineEntitySyncDownloadMode {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object OfflineEntitySyncDownloadMode {
    
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.All")
    @js.native
    def All: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    @scala.inline
    def All_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.Constrained")
    @js.native
    def Constrained: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    @scala.inline
    def Constrained_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constrained")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.None")
    @js.native
    def None: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.NoneAndPreserveData")
    @js.native
    def NoneAndPreserveData: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    @scala.inline
    def NoneAndPreserveData_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoneAndPreserveData")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def None_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.ProfileKind")
  @js.native
  class ProfileKind protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.ProfileKind {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ProfileKind {
    
    @JSImport("mendixmodelsdk", "navigation.ProfileKind")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Hybrid")
    @js.native
    def Hybrid: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridOffline")
    @js.native
    def HybridOffline: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def HybridOffline_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridOffline")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridPhone")
    @js.native
    def HybridPhone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridPhoneOffline")
    @js.native
    def HybridPhoneOffline: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def HybridPhoneOffline_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhoneOffline")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def HybridPhone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridTablet")
    @js.native
    def HybridTablet: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridTabletOffline")
    @js.native
    def HybridTabletOffline: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def HybridTabletOffline_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTabletOffline")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def HybridTablet_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Hybrid_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hybrid")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.NativePhone")
    @js.native
    def NativePhone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def NativePhone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativePhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Phone")
    @js.native
    def Phone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.PhoneOffline")
    @js.native
    def PhoneOffline: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def PhoneOffline_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PhoneOffline")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Phone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Responsive")
    @js.native
    def Responsive: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.ResponsiveOffline")
    @js.native
    def ResponsiveOffline: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def ResponsiveOffline_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResponsiveOffline")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Responsive_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Responsive")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Tablet")
    @js.native
    def Tablet: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.TabletOffline")
    @js.native
    def TabletOffline: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind = js.native
    @scala.inline
    def TabletOffline_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabletOffline")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Tablet_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.ProfileType")
  @js.native
  class ProfileType protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.ProfileType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ProfileType {
    
    @JSImport("mendixmodelsdk", "navigation.ProfileType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.Desktop")
    @js.native
    def Desktop: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    @scala.inline
    def Desktop_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridPhone")
    @js.native
    def HybridPhone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridPhone6")
    @js.native
    def HybridPhone6: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    @scala.inline
    def HybridPhone6_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone6")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def HybridPhone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridTablet")
    @js.native
    def HybridTablet: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridTablet6")
    @js.native
    def HybridTablet6: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    @scala.inline
    def HybridTablet6_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet6")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def HybridTablet_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.OfflinePhone")
    @js.native
    def OfflinePhone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    @scala.inline
    def OfflinePhone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OfflinePhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.Phone")
    @js.native
    def Phone: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    @scala.inline
    def Phone_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.Tablet")
    @js.native
    def Tablet: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType = js.native
    @scala.inline
    def Tablet_=(x: typingsSlinky.mendixmodelsdk.navigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
  @js.native
  class RoleBasedHomePage protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.RoleBasedHomePage {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object RoleBasedHomePage {
    
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.RoleBasedHomePage = js.native
    
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
      * of the parent NavigationProfile element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile): typingsSlinky.mendixmodelsdk.navigationMod.navigation.RoleBasedHomePage = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.0.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage")
  @js.native
  class RoleBasedNativeHomePage protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.RoleBasedNativeHomePage {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object RoleBasedNativeHomePage {
    
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.navigationMod.navigation.RoleBasedNativeHomePage = js.native
    
    /**
      * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
      * The new RoleBasedNativeHomePage will be automatically stored in the 'roleBasedNativeHomePages' property
      * of the parent NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile): typingsSlinky.mendixmodelsdk.navigationMod.navigation.RoleBasedNativeHomePage = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
