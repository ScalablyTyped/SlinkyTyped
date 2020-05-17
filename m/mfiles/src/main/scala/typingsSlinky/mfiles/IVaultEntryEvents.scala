package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import typingsSlinky.mfiles.anon.Finally
import typingsSlinky.mfiles.anon.FinallyOnError
import typingsSlinky.mfiles.anon.OnError
import typingsSlinky.mfiles.anon.OnSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultEntryEvents extends IEvents {
  var OnAddObjectFile: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* sourceObjectFile */ ISourceObjectFile, 
      Null | Boolean | Finally
    ]
  ] = js.native
  var OnAddObjectToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnAddObjectsToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.native
  var OnChangeVaultLanguage: js.UndefOr[js.Function1[/* languageID */ Double, Null | Boolean | OnError]] = js.native
  var OnCheckInObject: js.UndefOr[
    js.Function2[
      /* objVer */ IObjVer, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnCheckInObjects: js.UndefOr[
    js.Function2[
      /* objVers */ IObjVers, 
      /* propertyValues */ IPropertyValues, 
      Null | Boolean | FinallyOnError
    ]
  ] = js.native
  var OnCheckOutObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.native
  var OnCheckOutObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.native
  var OnCreateObject: js.UndefOr[
    js.Function6[
      /* objectType */ Double, 
      /* propertyValues */ IPropertyValues, 
      /* sourceObjectFiles */ ISourceObjectFiles, 
      /* accessControlList */ IAccessControlList, 
      /* checkInRequested */ Boolean, 
      /* singleFileRequested */ Boolean, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnDestroyObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnDestroyObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnError]] = js.native
  var OnDestroyObjectVersions: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | OnError]] = js.native
  var OnDestroyObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.native
  var OnLogOut: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.native
  var OnLoggedIn: js.UndefOr[js.Function0[Unit]] = js.native
  var OnModifyObjectVersionLabels: js.UndefOr[
    js.Function5[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      /* singleLabelRequired */ Boolean, 
      Null | Boolean | OnError
    ]
  ] = js.native
  var OnNotification: js.UndefOr[js.Function3[/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any, _]] = js.native
  var OnObjectAddedToFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectCheckedIn: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectCheckedOut: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectCheckoutUndone: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectCheckoutsUndone: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectCreated: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectDestroyed: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectFileAdded: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.native
  var OnObjectFileRemoved: js.UndefOr[js.Function2[/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer, Unit]] = js.native
  var OnObjectFileRenamed: js.UndefOr[
    js.Function2[/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile, Unit]
  ] = js.native
  var OnObjectLevelPropertySet: js.UndefOr[js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Unit]] = js.native
  var OnObjectOfflineAvailabilityRemoved: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectOfflineAvailabilitySet: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectRemoved: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectRemovedFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Unit]] = js.native
  var OnObjectUndeleted: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectVersionDestroyed: js.UndefOr[js.Function1[/* objVer */ IObjVer, Unit]] = js.native
  var OnObjectVersionLabelsModified: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* clearFromOtherVersions */ Boolean, 
      /* append */ Boolean, 
      /* labelIDs */ IIDs, 
      Unit
    ]
  ] = js.native
  var OnObjectVersionPermissionsSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectVersionRolledBack: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnObjectVersionsDestroyed: js.UndefOr[js.Function1[/* objVers */ IObjVers, Unit]] = js.native
  var OnObjectsAddedToFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.native
  var OnObjectsCheckedIn: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectsCheckedOut: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectsDestroyed: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.native
  var OnObjectsRemoved: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnObjectsRemovedFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Unit]] = js.native
  var OnPropertiesOfObjectVersionSet: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, Unit]] = js.native
  var OnPropertiesOfObjectVersionsSet: js.UndefOr[js.Function1[/* objectVersions */ IObjectVersions, Unit]] = js.native
  var OnRemoveObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.native
  var OnRemoveObjectFile: js.UndefOr[
    js.Function2[/* objVer */ IObjVer, /* fileVer */ IFileVer, Null | Boolean | OnSuccess]
  ] = js.native
  var OnRemoveObjectFromFavorites: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnRemoveObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnRemoveObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.native
  var OnRemoveObjectsFromFavorites: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | OnError]] = js.native
  var OnRenameObjectFile: js.UndefOr[
    js.Function4[
      /* objVer */ IObjVer, 
      /* fileVer */ IFileVer, 
      /* newName */ Null | ITypedValue, 
      /* newExtension */ Null | ITypedValue, 
      Null | Boolean | Finally
    ]
  ] = js.native
  var OnRollBackObjectVersion: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnSuccess]] = js.native
  var OnSetObjectLevelProperty: js.UndefOr[
    js.Function2[/* objID */ IObjID, /* propertyValue */ IPropertyValue, Null | Boolean | OnError]
  ] = js.native
  var OnSetObjectOfflineAvailability: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnError]] = js.native
  var OnSetObjectVersionPermissions: js.UndefOr[
    js.Function3[
      /* objVer */ IObjVer, 
      /* changeAllVersions */ Boolean, 
      /* accessControlList */ IAccessControlList, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnSetPropertiesOfObjectVersion: js.UndefOr[
    js.Function3[
      /* setPropertiesParams */ ISetPropertiesParams, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | OnSuccess
    ]
  ] = js.native
  var OnSetPropertiesOfObjectVersions: js.UndefOr[
    js.Function3[
      /* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, 
      /* singlePropertyUpdate */ Boolean, 
      /* singlePropertyRemove */ Boolean, 
      Null | Boolean | FinallyOnError
    ]
  ] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
  var OnSwitchToOfflineMode: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.native
  var OnSwitchToOnlineMode: js.UndefOr[js.Function0[Null | Boolean | OnError]] = js.native
  var OnSwitchedToOfflineMode: js.UndefOr[js.Function0[Unit]] = js.native
  var OnSwitchedToOnlineMode: js.UndefOr[js.Function0[Unit]] = js.native
  var OnUndeleteObject: js.UndefOr[js.Function1[/* objID */ IObjID, Null | Boolean | OnSuccess]] = js.native
  var OnUndeleteObjects: js.UndefOr[js.Function1[/* objIDs */ IObjIDs, Null | Boolean | FinallyOnError]] = js.native
  var OnUndoObjectCheckout: js.UndefOr[js.Function1[/* objVer */ IObjVer, Null | Boolean | OnSuccess]] = js.native
  var OnUndoObjectCheckouts: js.UndefOr[js.Function1[/* objVers */ IObjVers, Null | Boolean | FinallyOnError]] = js.native
  var OnVaultLanguageChanged: js.UndefOr[js.Function1[/* languageID */ Double, Unit]] = js.native
}

object IVaultEntryEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IVaultEntryEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IVaultEntryEvents]
  }
  @scala.inline
  implicit class IVaultEntryEventsOps[Self <: IVaultEntryEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAddObjectFile(
      value: (/* objVer */ IObjVer, /* sourceObjectFile */ ISourceObjectFile) => Null | Boolean | Finally
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAddObjectFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAddObjectFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAddObjectFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddObjectToFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAddObjectToFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAddObjectToFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAddObjectToFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAddObjectsToFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAddObjectsToFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAddObjectsToFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnAddObjectsToFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeVaultLanguage(value: /* languageID */ Double => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnChangeVaultLanguage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeVaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnChangeVaultLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheckInObject(value: (/* objVer */ IObjVer, /* propertyValues */ IPropertyValues) => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckInObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCheckInObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckInObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheckInObjects(
      value: (/* objVers */ IObjVers, /* propertyValues */ IPropertyValues) => Null | Boolean | FinallyOnError
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckInObjects")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCheckInObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckInObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheckOutObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckOutObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCheckOutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckOutObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheckOutObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckOutObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCheckOutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCheckOutObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateObject(
      value: (/* objectType */ Double, /* propertyValues */ IPropertyValues, /* sourceObjectFiles */ ISourceObjectFiles, /* accessControlList */ IAccessControlList, /* checkInRequested */ Boolean, /* singleFileRequested */ Boolean) => Null | Boolean | OnSuccess
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCreateObject")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnCreateObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCreateObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyObject(value: /* objID */ IObjID => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroyObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObjectVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroyObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyObjectVersions(value: /* objVers */ IObjVers => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObjectVersions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroyObjectVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObjectVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyObjects(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroyObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDestroyObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLogOut(value: () => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnLogOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLogOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnLogOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoggedIn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnLoggedIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoggedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnLoggedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModifyObjectVersionLabels(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs, /* singleLabelRequired */ Boolean) => Null | Boolean | OnError
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnModifyObjectVersionLabels")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnModifyObjectVersionLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnModifyObjectVersionLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotification(value: (/* id */ String, /* data1 */ js.Any, /* data2 */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNotification")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectAddedToFavorites(value: /* objID */ IObjID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectAddedToFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectAddedToFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectAddedToFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectCheckedIn(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckedIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectCheckedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectCheckedOut(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckedOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectCheckedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckedOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectCheckoutUndone(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckoutUndone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectCheckoutUndone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckoutUndone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectCheckoutsUndone(value: /* objectVersions */ IObjectVersions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckoutsUndone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectCheckoutsUndone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCheckoutsUndone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectCreated(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectDestroyed(value: /* objID */ IObjID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectDestroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectFileAdded(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectFileAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectFileAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectFileAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectFileRemoved(value: (/* objectVersion */ IObjectVersion, /* fileVer */ IFileVer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectFileRemoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectFileRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectFileRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectFileRenamed(value: (/* objectVersion */ IObjectVersion, /* objectFile */ IObjectFile) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectFileRenamed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectFileRenamed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectFileRenamed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectLevelPropertySet(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectLevelPropertySet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnObjectLevelPropertySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectLevelPropertySet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectOfflineAvailabilityRemoved(value: /* objID */ IObjID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectOfflineAvailabilityRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectOfflineAvailabilityRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectOfflineAvailabilityRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectOfflineAvailabilitySet(value: /* objID */ IObjID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectOfflineAvailabilitySet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectOfflineAvailabilitySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectOfflineAvailabilitySet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectRemoved(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectRemovedFromFavorites(value: /* objID */ IObjID => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectRemovedFromFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectRemovedFromFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectRemovedFromFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectUndeleted(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectUndeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectUndeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectUndeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectVersionDestroyed(value: /* objVer */ IObjVer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectVersionDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionDestroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectVersionLabelsModified(
      value: (/* objVer */ IObjVer, /* clearFromOtherVersions */ Boolean, /* append */ Boolean, /* labelIDs */ IIDs) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionLabelsModified")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnObjectVersionLabelsModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionLabelsModified")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectVersionPermissionsSet(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionPermissionsSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectVersionPermissionsSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionPermissionsSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectVersionRolledBack(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionRolledBack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectVersionRolledBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionRolledBack")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectVersionsDestroyed(value: /* objVers */ IObjVers => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionsDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectVersionsDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectVersionsDestroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectsAddedToFavorites(value: /* objIDs */ IObjIDs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsAddedToFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectsAddedToFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsAddedToFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectsCheckedIn(value: /* objectVersions */ IObjectVersions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsCheckedIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectsCheckedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsCheckedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectsCheckedOut(value: /* objectVersions */ IObjectVersions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsCheckedOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectsCheckedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsCheckedOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectsDestroyed(value: /* objIDs */ IObjIDs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectsDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsDestroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectsRemoved(value: /* objectVersions */ IObjectVersions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectsRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnObjectsRemovedFromFavorites(value: /* objIDs */ IObjIDs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsRemovedFromFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnObjectsRemovedFromFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnObjectsRemovedFromFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPropertiesOfObjectVersionSet(value: /* objectVersion */ IObjectVersion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPropertiesOfObjectVersionSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPropertiesOfObjectVersionSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPropertiesOfObjectVersionSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPropertiesOfObjectVersionsSet(value: /* objectVersions */ IObjectVersions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPropertiesOfObjectVersionsSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPropertiesOfObjectVersionsSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPropertiesOfObjectVersionsSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveObjectFile(value: (/* objVer */ IObjVer, /* fileVer */ IFileVer) => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveObjectFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveObjectFromFavorites(value: /* objID */ IObjID => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectFromFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveObjectFromFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectFromFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectOfflineAvailability")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveObjectOfflineAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectOfflineAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveObjectsFromFavorites(value: /* objIDs */ IObjIDs => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectsFromFavorites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveObjectsFromFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRemoveObjectsFromFavorites")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenameObjectFile(
      value: (/* objVer */ IObjVer, /* fileVer */ IFileVer, /* newName */ Null | ITypedValue, /* newExtension */ Null | ITypedValue) => Null | Boolean | Finally
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRenameObjectFile")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnRenameObjectFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRenameObjectFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRollBackObjectVersion(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRollBackObjectVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRollBackObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRollBackObjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetObjectLevelProperty(value: (/* objID */ IObjID, /* propertyValue */ IPropertyValue) => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetObjectLevelProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSetObjectLevelProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetObjectLevelProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetObjectOfflineAvailability(value: /* objID */ IObjID => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetObjectOfflineAvailability")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSetObjectOfflineAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetObjectOfflineAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetObjectVersionPermissions(
      value: (/* objVer */ IObjVer, /* changeAllVersions */ Boolean, /* accessControlList */ IAccessControlList) => Null | Boolean | OnSuccess
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetObjectVersionPermissions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSetObjectVersionPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetObjectVersionPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetPropertiesOfObjectVersion(
      value: (/* setPropertiesParams */ ISetPropertiesParams, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | OnSuccess
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetPropertiesOfObjectVersion")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSetPropertiesOfObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetPropertiesOfObjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSetPropertiesOfObjectVersions(
      value: (/* setPropertiesParamsOfMultipleObjects */ ISetPropertiesParamsOfMultipleObjects, /* singlePropertyUpdate */ Boolean, /* singlePropertyRemove */ Boolean) => Null | Boolean | FinallyOnError
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetPropertiesOfObjectVersions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSetPropertiesOfObjectVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSetPropertiesOfObjectVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwitchToOfflineMode(value: () => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchToOfflineMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwitchToOfflineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchToOfflineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwitchToOnlineMode(value: () => Null | Boolean | OnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchToOnlineMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwitchToOnlineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchToOnlineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwitchedToOfflineMode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchedToOfflineMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwitchedToOfflineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchedToOfflineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwitchedToOnlineMode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchedToOnlineMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwitchedToOnlineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSwitchedToOnlineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUndeleteObject(value: /* objID */ IObjID => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndeleteObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUndeleteObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndeleteObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUndeleteObjects(value: /* objIDs */ IObjIDs => Null | Boolean | FinallyOnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndeleteObjects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUndeleteObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndeleteObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUndoObjectCheckout(value: /* objVer */ IObjVer => Null | Boolean | OnSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndoObjectCheckout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUndoObjectCheckout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndoObjectCheckout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUndoObjectCheckouts(value: /* objVers */ IObjVers => Null | Boolean | FinallyOnError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndoObjectCheckouts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUndoObjectCheckouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnUndoObjectCheckouts")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVaultLanguageChanged(value: /* languageID */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnVaultLanguageChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVaultLanguageChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnVaultLanguageChanged")(js.undefined)
        ret
    }
  }
  
}

