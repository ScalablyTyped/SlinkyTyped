package typingsSlinky.mendixmodelsdk.allModelClassesMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationDeleteBehavior
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.ValidationRule
import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.Microflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.TextTemplate
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidgetWithPlaceholder
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Button
import typingsSlinky.mendixmodelsdk.pagesMod.pages.CallNanoflowClientAction
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ConfirmationInfo
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBarButton
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DataView
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DropDown
import typingsSlinky.mendixmodelsdk.pagesMod.pages.DropDownButtonItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GridColumn
import typingsSlinky.mendixmodelsdk.pagesMod.pages.InputWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Label
import typingsSlinky.mendixmodelsdk.pagesMod.pages.LoginTextBox
import typingsSlinky.mendixmodelsdk.pagesMod.pages.MasterDetailDetailRegion
import typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSettings
import typingsSlinky.mendixmodelsdk.pagesMod.pages.Page
import typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ReferenceSelector
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SearchField
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage
import typingsSlinky.mendixmodelsdk.pagesMod.pages.TextArea
import typingsSlinky.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportAggregate
import typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportColumn
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportButton
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChartSeries
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeField
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts")
@js.native
object texts extends js.Object {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @js.native
  class SystemText protected ()
    extends typingsSlinky.mendixmodelsdk.textsMod.texts.SystemText {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object SystemText extends js.Object {
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.textsMod.texts.SystemText = js.native
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.textsMod.texts.SystemTextCollection): typingsSlinky.mendixmodelsdk.textsMod.texts.SystemText = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/system-texts relevant section in reference guide}
    */
  @js.native
  class SystemTextCollection protected ()
    extends typingsSlinky.mendixmodelsdk.textsMod.texts.SystemTextCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object SystemTextCollection extends js.Object {
    
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsSlinky.mendixmodelsdk.textsMod.texts.SystemTextCollection = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/translatable-texts relevant section in reference guide}
    */
  @js.native
  class Text protected ()
    extends typingsSlinky.mendixmodelsdk.textsMod.texts.Text {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object Text extends js.Object {
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInBottomBarItemUnderCaption(container: BottomBarItem): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    def createInButtonUnderTooltip(container: Button): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fallback' property
      * of the parent pages.ClientTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.3.0 and higher
      */
    def createInClientTemplateUnderFallback(container: ClientTemplate): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    def createInClientTemplateUnderTemplate(container: ClientTemplate): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderCaption(container: DataGridColumn): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    def createInDataViewUnderNoEntityMessage(container: DataView): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    def createInEnumerationValueUnderCaption(container: EnumerationValue): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderAggregateCaption(container: GridColumn): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderCaption(container: GridColumn): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    def createInInputWidgetUnderLabel(container: InputWidget): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    def createInLabelUnderCaption(container: Label): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'alternativeText' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    def createInMenuItemUnderAlternativeText(container: MenuItem): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    def createInMenuItemUnderCaption(container: MenuItem): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'appTitle' property
      * of the parent navigation.NavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    def createInNavigationProfileUnderAppTitle(container: NavigationProfile): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    def createInPageSettingsUnderFormTitle(container: PageSettings): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    def createInPageUnderTitle(container: Page): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    def createInReportButtonUnderCaption(container: ReportButton): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderXAxisCaption(container: ReportChart): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderYAxisCaption(container: ReportChart): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    def createInSearchFieldUnderCaption(container: SearchField): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInSearchFieldUnderPlaceholder(container: SearchField): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderCaption(container: StaticLabel): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    def createInSystemTextUnderText(container: typingsSlinky.mendixmodelsdk.textsMod.texts.SystemText): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    def createInTabPageUnderCaption(container: TabPage): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderCounterMessage(container: TextArea): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    def createInTextTemplateUnderText(container: TextTemplate): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    def createInTitleUnderCaption(container: Title): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInWidgetValidationUnderMessage(container: WidgetValidation): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typingsSlinky.mendixmodelsdk.textsMod.texts.Text = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class Translation protected ()
    extends typingsSlinky.mendixmodelsdk.textsMod.texts.Translation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object Translation extends js.Object {
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsSlinky.mendixmodelsdk.textsMod.texts.Translation = js.native
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    def createIn(container: typingsSlinky.mendixmodelsdk.textsMod.texts.Text): typingsSlinky.mendixmodelsdk.textsMod.texts.Translation = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typingsSlinky.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
  }
}
