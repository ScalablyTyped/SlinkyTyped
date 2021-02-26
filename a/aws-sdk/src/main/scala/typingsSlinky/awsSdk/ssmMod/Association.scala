package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Association extends StObject {
  
  /**
    * The ID created by the system when you create an association. An association is a binding between a document and a set of targets with a schedule.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationId] = js.native
  
  /**
    * The association name.
    */
  var AssociationName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationName] = js.native
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationVersion] = js.native
  
  /**
    * The version of the document used in the association.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * The date on which the association was last run.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.native
  
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ScheduleExpression] = js.native
  
  /**
    * The instances targeted by the request to create an association. 
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}
object Association {
  
  @scala.inline
  def apply(): Association = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Association]
  }
  
  @scala.inline
  implicit class AssociationMutableBuilder[Self <: Association] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setLastExecutionDate(value: js.Date): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOverview(value: AssociationOverview): Self = StObject.set(x, "Overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "Overview", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
