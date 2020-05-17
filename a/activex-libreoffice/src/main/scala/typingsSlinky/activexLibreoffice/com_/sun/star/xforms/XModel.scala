package typingsSlinky.activexLibreoffice.com_.sun.star.xforms

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XSet
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent an {@link XForms} model */
@js.native
trait XModel extends js.Object {
  /** get a container containing all bindings; also supports XNameAccess */
  val Bindings: XSet = js.native
  /** provides management access to the XSD data types associated with the model */
  val DataTypeRepository: XDataTypeRepository = js.native
  /** get the default instance for this model */
  val DefaultInstance: XDocument = js.native
  /** get the {@link XForms} model ID */
  var ID: String = js.native
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  val Instances: XSet = js.native
  /** get container containing all submissions; also supports XNameAccess */
  val Submissions: XSet = js.native
  /**
    * clone an arbitrary binding element for this model; still needs
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def cloneBinding(binding: XPropertySet): XPropertySet = js.native
  /**
    * clone an arbitrary submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def cloneSubmission(submission: XPropertySet): XSubmission = js.native
  /**
    * create a binding element for this model
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def createBinding(): XPropertySet = js.native
  /**
    * create a submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def createSubmission(): XSubmission = js.native
  /**
    * get a binding with a certain ID
    *
    * This is a convenience method: the same result can also be obtained through {@link getBindings()}
    */
  def getBinding(id: String): XPropertySet = js.native
  /** get a container containing all bindings; also supports XNameAccess */
  def getBindings(): XSet = js.native
  /** provides management access to the XSD data types associated with the model */
  def getDataTypeRepository(): XDataTypeRepository = js.native
  /** get the default instance for this model */
  def getDefaultInstance(): XDocument = js.native
  /** get the {@link XForms} model ID */
  def getID(): String = js.native
  /** retrieves the instance with the given id */
  def getInstanceDocument(id: String): XDocument = js.native
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  def getInstances(): XSet = js.native
  /**
    * get a submission with a certain ID.
    *
    * This is a convenience method: the same result can also be obtained through {@link getSubmissions()} .
    */
  def getSubmission(id: String): XSubmission = js.native
  /** get container containing all submissions; also supports XNameAccess */
  def getSubmissions(): XSet = js.native
  /** initialize the model */
  def initialize(): Unit = js.native
  /** rebuild the model */
  def rebuild(): Unit = js.native
  /** re-evaluate all calculate attributes */
  def recalculate(): Unit = js.native
  /** refresh the model */
  def refresh(): Unit = js.native
  /** re-evaluate all validity attributes */
  def revalidate(): Unit = js.native
  /** set the {@link XForms} model ID */
  def setID(id: String): Unit = js.native
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id ).submit()` .
    * @param id the ID of the submission to execute
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submit(id: String): Unit = js.native
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id, handler ).submit()` .
    * @param id the ID of the submission to execute
    * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submitWithInteraction(id: String, aHandler: XInteractionHandler): Unit = js.native
}

object XModel {
  @scala.inline
  def apply(
    Bindings: XSet,
    DataTypeRepository: XDataTypeRepository,
    DefaultInstance: XDocument,
    ID: String,
    Instances: XSet,
    Submissions: XSet,
    cloneBinding: XPropertySet => XPropertySet,
    cloneSubmission: XPropertySet => XSubmission,
    createBinding: () => XPropertySet,
    createSubmission: () => XSubmission,
    getBinding: String => XPropertySet,
    getBindings: () => XSet,
    getDataTypeRepository: () => XDataTypeRepository,
    getDefaultInstance: () => XDocument,
    getID: () => String,
    getInstanceDocument: String => XDocument,
    getInstances: () => XSet,
    getSubmission: String => XSubmission,
    getSubmissions: () => XSet,
    initialize: () => Unit,
    rebuild: () => Unit,
    recalculate: () => Unit,
    refresh: () => Unit,
    revalidate: () => Unit,
    setID: String => Unit,
    submit: String => Unit,
    submitWithInteraction: (String, XInteractionHandler) => Unit
  ): XModel = {
    val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
    __obj.asInstanceOf[XModel]
  }
  @scala.inline
  implicit class XModelOps[Self <: XModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: XSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTypeRepository(value: XDataTypeRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTypeRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultInstance(value: XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: XSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmissions(value: XSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Submissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneBinding(value: XPropertySet => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloneSubmission(value: XPropertySet => XSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneSubmission")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateBinding(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBinding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSubmission(value: () => XSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSubmission")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBinding(value: String => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBindings(value: () => XSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBindings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataTypeRepository(value: () => XDataTypeRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataTypeRepository")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultInstance(value: () => XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultInstance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInstanceDocument(value: String => XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstanceDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInstances(value: () => XSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstances")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubmission(value: String => XSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmission")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSubmissions(value: () => XSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmissions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRebuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecalculate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRevalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetID(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmitWithInteraction(value: (String, XInteractionHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitWithInteraction")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

