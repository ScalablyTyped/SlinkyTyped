package typingsSlinky.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostType extends StObject
/**
  * Specifies the host Office application in which the add-in is running.
  */
@JSGlobal("Office.HostType")
@js.native
object HostType extends StObject {
  
  /**
    * The Office host is Microsoft Access.
    *
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  @js.native
  sealed trait Access extends HostType
  
  /**
    * The Office host is Microsoft Excel.
    */
  @js.native
  sealed trait Excel extends HostType
  
  /**
    * The Office host is Microsoft OneNote.
    */
  @js.native
  sealed trait OneNote extends HostType
  
  /**
    * The Office host is Microsoft Outlook.
    */
  @js.native
  sealed trait Outlook extends HostType
  
  /**
    * The Office host is Microsoft PowerPoint.
    */
  @js.native
  sealed trait PowerPoint extends HostType
  
  /**
    * The Office host is Microsoft Project.
    */
  @js.native
  sealed trait Project extends HostType
  
  /**
    * The Office host is Microsoft Word.
    */
  @js.native
  sealed trait Word extends HostType
}
