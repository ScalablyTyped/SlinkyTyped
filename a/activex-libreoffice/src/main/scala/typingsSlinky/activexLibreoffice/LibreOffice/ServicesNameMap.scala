package typingsSlinky.activexLibreoffice.LibreOffice

import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.Accessible
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.AccessibleContext
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.MSAAService
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.AnimateColor
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.AnimateMotion
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.AnimateSet
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.Audio
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.Command
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.IterateContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.ParallelTimeContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.SequenceTimeContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.auth.SSOManagerFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.auth.SSOPasswordCache
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleButton
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleCheckBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleComboBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleDropDownComboBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleDropDownListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleEdit
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleFixedText
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleIconChoiceControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleIconChoiceControlEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleList
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleListBoxList
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleListItem
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleMenu
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleMenuBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleMenuItem
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleMenuSeparator
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessiblePopupMenu
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleRadioButton
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleScrollBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleStatusBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleStatusBarItem
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTabBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTabBarPage
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTabBarPageList
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTabControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTabPage
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTextField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleToolBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleToolBoxItem
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTreeListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleTreeListBoxEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AccessibleWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AnimatedImagesControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AnimatedImagesControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AsyncCallback
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.ContainerWindowProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.DialogProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.DialogProvider2
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.MenuBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Pointer
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.PopupMenu
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.PrinterServer
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.RoadmapItem
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.SpinningProgressControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.TabController
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.TabControllerModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Toolkit
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlButton
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlButtonModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBoxModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlComboBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlComboBoxModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlContainerModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyFieldModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDateField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDateFieldModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialogModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialogModelProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlEditModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFileControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFileControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFixedHyperlink
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFixedHyperlinkModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFixedLine
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFixedLineModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFixedText
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFixedTextModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedFieldModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBoxModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlImageControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlImageControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlListBoxModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlNumericField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlNumericFieldModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlPatternField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlPatternFieldModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlProgressBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlProgressBarModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButton
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButtonModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlRoadmap
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlRoadmapModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlScrollBar
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlScrollBarModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlSpinButton
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlSpinButtonModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlTimeField
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlTimeFieldModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.DefaultGridColumnModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.DefaultGridDataModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.GridColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.SortableGridDataModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.UnoControlGrid
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.UnoControlGridModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tab.UnoControlTabPage
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tab.UnoControlTabPageContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tab.UnoControlTabPageContainerModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tab.UnoControlTabPageModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree.MutableTreeDataModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree.MutableTreeNode
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree.TreeControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree.TreeControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Introspection
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyBag
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.Bridge
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.BridgeFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.IiopBridge
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.OleApplicationRegistration
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.OleBridgeSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.OleBridgeSupplier2
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.OleBridgeSupplierVar1
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.OleObjectFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.UnoUrlResolver
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.UrpBridge
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.ApplicationRegistration
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.BridgeSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.Factory
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.AccessibleChartDocumentView
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.AccessibleChartElement
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.AreaDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.BarDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.BubbleDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.Chart3DBarProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartArea
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartAxis
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartAxisXSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartAxisYSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartAxisZSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartData
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDataArray
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDataPointProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDataRowProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartGrid
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartLegend
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartLine
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartPieSegmentProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartStatistics
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartTableAddressSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartTitle
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartTwoAxisXSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartTwoAxisYSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.Dim3DDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.DonutDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.FilledNetDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.LineDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.NetDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.PieDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.StackableDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.StockDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.XYDiagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.Axis
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.CandleStickChartType
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.CartesianCoordinateSystem2d
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.CartesianCoordinateSystem3d
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ChartDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ChartDocumentWrapper
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ChartType
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ChartTypeManager
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ChartTypeTemplate
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.CoordinateSystem
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.CoordinateSystemType
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.DataPoint
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.DataPointProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.DataSeries
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.Diagram
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ErrorBar
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ExponentialRegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ExponentialScaling
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.FormattedString
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.GridProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.Legend
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.LinearRegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.LinearScaling
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.LogarithmicRegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.LogarithmicScaling
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.LogicTargetModel
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.MovingAverageRegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.PolarCoordinateSystem2d
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.PolarCoordinateSystem3d
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.PolynomialRegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.PotentialRegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.PowerScaling
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.PropertyPool
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.RegressionCurve
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.RegressionCurveEquation
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.RegressionEquation
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.Scaling
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.StandardDiagramCreationParameters
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.Title
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.DataFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.DataProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.DataSequence
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.DataSink
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.DataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.DatabaseDataProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.LabeledDataSequence
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.RangeHighlightListener
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.RangeHighlighter
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.TabularDataProviderArguments
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.AccessRootElement
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.AdministrationProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.ConfigurationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.ConfigurationProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.ConfigurationRegistry
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.ConfigurationUpdateAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.DefaultProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.GroupAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.GroupElement
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.GroupUpdate
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.HierarchyAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.HierarchyElement
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.PropertyHierarchy
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.ReadOnlyAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.ReadWriteAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.SetAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.SetElement
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.SetUpdate
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.SimpleSetAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.SimpleSetUpdate
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.UpdateRootElement
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.Backend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.BackendAdapter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.CopyImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.DataImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.DefaultBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.HierarchyBrowser
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.Importer
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.InteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.Layer
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LayerDescriber
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LayerFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LayerUpdateMerger
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LdapMultiLayerStratum
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LdapSingleBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LdapSingleStratum
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LocalDataImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LocalHierarchyBrowser
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LocalSchemaSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LocalSingleBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.LocalSingleStratum
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.MergeImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.MultiLayerStratum
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.MultiStratumBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.OfflineBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.OnlineBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.PlatformBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.Schema
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.SchemaSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.SingleBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.SingleBackendAdapter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.SingleLayerStratum
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.SystemIntegration
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.UpdatableLayer
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.xml.LayerParser
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.xml.LayerWriter
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.xml.SchemaParser
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.bootstrap.BootstrapContext
import typingsSlinky.activexLibreoffice.com_.sun.star.connection.Acceptor
import typingsSlinky.activexLibreoffice.com_.sun.star.connection.Connector
import typingsSlinky.activexLibreoffice.com_.sun.star.container.EnumerableMap
import typingsSlinky.activexLibreoffice.com_.sun.star.cui.ColorPicker
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.DataFormatTranslator
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.MimeContentTypeFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard.ClipboardManager
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard.GenericClipboard
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard.SystemClipboard
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.OleDragSource
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.OleDropTarget
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.X11DragSource
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.X11DropTarget
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.PackageRegistryBackend
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.UpdateInformationProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.test.SmoketestCommandEnvironment
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.ui.LicenseDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.ui.PackageManagerDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.ui.UpdateRequiredDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.document.DocumentProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.document.DocumentRevisionListPersistence
import typingsSlinky.activexLibreoffice.com_.sun.star.document.EventDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.document.Events
import typingsSlinky.activexLibreoffice.com_.sun.star.document.ExportFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.ExtendedTypeDetection
import typingsSlinky.activexLibreoffice.com_.sun.star.document.ExtendedTypeDetectionFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.document.FilterAdapter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.FilterConfigRefresh
import typingsSlinky.activexLibreoffice.com_.sun.star.document.FilterFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.document.GraphicObjectResolver
import typingsSlinky.activexLibreoffice.com_.sun.star.document.HeaderFooterSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.document.ImportFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.IndexedPropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.document.LinkTarget
import typingsSlinky.activexLibreoffice.com_.sun.star.document.LinkTargets
import typingsSlinky.activexLibreoffice.com_.sun.star.document.MediaDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.document.NamedPropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.document.OOXMLDocumentPropertiesImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.OfficeDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.document.OleEmbeddedServerRegistration
import typingsSlinky.activexLibreoffice.com_.sun.star.document.PDFDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.document.Settings
import typingsSlinky.activexLibreoffice.com_.sun.star.document.TypeDetection
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XMLBasicExporter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XMLBasicImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XMLOasisBasicExporter
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XMLOasisBasicImporter
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleDrawDocumentView
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleGraphControl
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleGraphicShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleImageBullet
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleOLEShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleSlideView
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AccessibleSlideViewObject
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.AppletShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Background
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.BitmapTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.CaptionShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ClosedBezierShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ColorTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ConnectorProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ConnectorShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ControlShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.CustomShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.CustomShapeEngine
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DashTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Defaults
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DocumentSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DrawPage
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DrawPages
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DrawingDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DrawingDocumentDrawView
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.DrawingDocumentFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EllipseShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeExtrusion
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeGeometry
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeHandle
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapePath
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeTextPath
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.FillProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GenericDrawPage
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GenericDrawingDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GradientTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GraphicExportFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GraphicObjectShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GroupShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HatchTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LayerManager
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.MarkerTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.MasterPage
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.MasterPages
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.MeasureProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.MeasureShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ModuleDispatcher
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.OLE2Shape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.OpenBezierShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PageShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PluginShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyLineShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.RectangleShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.RotationDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ShadowProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Shape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.ShapeCollection
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Shapes
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.SlideRenderer
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.SlideSorter
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Text
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.TextProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.TextShape
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.TransparencyGradientTable
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.BasicPaneFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.BasicToolBarFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.BasicViewFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.Configuration
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.ConfigurationController
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.ModuleController
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.ResourceId
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.BaseStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.DocumentCloser
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.EmbeddedObjectCreator
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.EmbeddedObjectDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.FileSystemStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.FileSystemStorageFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.HatchWindowFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.InstanceLocker
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.MSOLEObjectSystemCreator
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.OLEEmbeddedObjectFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.OLESimpleStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.OOoEmbeddedObjectFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.Storage
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.StorageFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.StorageStream
import typingsSlinky.activexLibreoffice.com_.sun.star.form.ControlFontDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.form.DataAwareControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormComponents
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormController
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormControllerDispatcher
import typingsSlinky.activexLibreoffice.com_.sun.star.form.Forms
import typingsSlinky.activexLibreoffice.com_.sun.star.form.PropertyBrowserController
import typingsSlinky.activexLibreoffice.com_.sun.star.form.TabOrderDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseCheckBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseComboBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseDateField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseFormattedField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseNumericField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseRadioButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseTextField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableDatabaseTimeField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableIntegerValueRange
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.ListEntrySource
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.ValueBinding
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.CheckBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.ComboBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.CommandButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.CurrencyField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DataForm
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseCheckBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseComboBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseCurrencyField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseDateField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseFormattedField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseImageControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseNumericField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabasePatternField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseRadioButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseTextField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DatabaseTimeField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.DateField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.FileControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.FixedText
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.Form
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.FormattedField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.GridControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.GroupBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.HTMLForm
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.HiddenControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.ImageButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.ListBox
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.NavigationToolBar
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.NumericField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.PatternField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.RadioButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.RichTextControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.ScrollBar
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.SpinButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.SubmitButton
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.TextField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.component.TimeField
import typingsSlinky.activexLibreoffice.com_.sun.star.form.control.FilterControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.control.ImageControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.control.InteractionGridControl
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.ButtonNavigationHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.CellBindingPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.DefaultFormComponentInspectorModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.EditPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.EventHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.FormComponentPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.SubmissionPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.XMLFormsPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.inspection.XSDValidationPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.form.runtime.FormOperations
import typingsSlinky.activexLibreoffice.com_.sun.star.form.validation.ValidatableBindableControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.validation.ValidatableControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.formula.AccessibleFormulaText
import typingsSlinky.activexLibreoffice.com_.sun.star.formula.AccessibleFormulaView
import typingsSlinky.activexLibreoffice.com_.sun.star.formula.FormulaProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.AppDispatchProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.AutoRecovery
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Bibliography
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Components
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ContentHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ContentHandlerFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Controller
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Desktop
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DesktopTask
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DesktopTasks
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchHelper
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchRecorder
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchRecorderSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DocumentTemplates
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Frame
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.FrameControl
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.FrameLoader
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.FrameLoaderFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.FramesContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.GlobalEventBroadcaster
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.LayoutManager
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.MediaTypeDetectionHelper
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ModuleManager
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.OfficeFrameLoader
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.PopupMenuController
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.PopupMenuControllerFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ProtocolHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.SessionListener
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.SessionManager
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.StartModule
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.StatusbarController
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.StatusbarControllerFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.SynchronousFrameLoader
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Task
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.TaskCreator
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.TemplateAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ToolbarController
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ToolbarControllerFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.TransientDocumentsDocumentContentFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.UICommandDescription
import typingsSlinky.activexLibreoffice.com_.sun.star.gallery.GalleryItem
import typingsSlinky.activexLibreoffice.com_.sun.star.gallery.GalleryTheme
import typingsSlinky.activexLibreoffice.com_.sun.star.gallery.GalleryThemeProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.Graphic
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.GraphicDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.GraphicObject
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.GraphicProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.GraphicRasterizer
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.GraphicRendererVCL
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.MediaProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.Primitive2DTools
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.PrimitiveFactory2D
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.SvgTools
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.BreakIterator
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.ChapterCollator
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.CharacterClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Collator
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.IndexEntrySupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.InputSequenceChecker
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LocaleCalendar
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LocaleCalendar2
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LocaleData
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.NativeNumberSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.NumberFormatMapper
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.OrdinalSuffix
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.TextConversion
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Transliteration
import typingsSlinky.activexLibreoffice.com_.sun.star.image.ImageMap
import typingsSlinky.activexLibreoffice.com_.sun.star.image.ImageMapCircleObject
import typingsSlinky.activexLibreoffice.com_.sun.star.image.ImageMapObject
import typingsSlinky.activexLibreoffice.com_.sun.star.image.ImageMapPolygonObject
import typingsSlinky.activexLibreoffice.com_.sun.star.image.ImageMapRectangleObject
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.DefaultHelpProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.GenericPropertyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.ObjectInspector
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.ObjectInspectorModel
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.StringRepresentation
import typingsSlinky.activexLibreoffice.com_.sun.star.io.DataInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.DataOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.MarkableInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.MarkableOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.ObjectInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.ObjectOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.Pipe
import typingsSlinky.activexLibreoffice.com_.sun.star.io.Pump
import typingsSlinky.activexLibreoffice.com_.sun.star.io.SequenceInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.SequenceOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.TempFile
import typingsSlinky.activexLibreoffice.com_.sun.star.io.TextInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.TextOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.java_.JavaVirtualMachine
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.MultiServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.RegistryServiceManager
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.ServiceManager
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.ConversionDictionary
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.ConversionDictionaryList
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.Dictionary
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.DictionaryList
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.HangulHanjaConversionDictionary
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.Hyphenator
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.LanguageGuessing
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.LinguProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.LinguServiceManager
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.Proofreader
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.ProofreadingIterator
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.SpellChecker
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.Thesaurus
import typingsSlinky.activexLibreoffice.com_.sun.star.loader.Dynamic
import typingsSlinky.activexLibreoffice.com_.sun.star.loader.Java
import typingsSlinky.activexLibreoffice.com_.sun.star.loader.Java2
import typingsSlinky.activexLibreoffice.com_.sun.star.loader.SharedLibrary
import typingsSlinky.activexLibreoffice.com_.sun.star.logging.ConsoleHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.logging.CsvLogFormatter
import typingsSlinky.activexLibreoffice.com_.sun.star.logging.FileHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.logging.PlainTextFormatter
import typingsSlinky.activexLibreoffice.com_.sun.star.logging.SimpleLogRing
import typingsSlinky.activexLibreoffice.com_.sun.star.mail.MailMessage
import typingsSlinky.activexLibreoffice.com_.sun.star.mail.MailServiceProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.media.Manager
import typingsSlinky.activexLibreoffice.com_.sun.star.mozilla.MenuProxy
import typingsSlinky.activexLibreoffice.com_.sun.star.mozilla.MenuProxyListener
import typingsSlinky.activexLibreoffice.com_.sun.star.mozilla.MozillaBootstrap
import typingsSlinky.activexLibreoffice.com_.sun.star.office.Quickstart
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.Package
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.PackageFolder
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.PackageFolderEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.PackageStream
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.manifest.ManifestReader
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.manifest.ManifestWriter
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.zip.ZipFileAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.ChartShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.CustomPresentation
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.CustomPresentationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.DateTimeShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.FooterShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.HandoutShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.HandoutView
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.HeaderShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.NotesShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.NotesView
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.OutlineView
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.OutlinerShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.Presentation
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.Presentation2
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.PresentationDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.PresentationView
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.PreviewView
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.SlideNumberShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.SlideShow
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.SlidesView
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.SubtitleShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.TitleTextShape
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.TransitionFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.textfield.DateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.textfield.Footer
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.textfield.Header
import typingsSlinky.activexLibreoffice.com_.sun.star.rdf.BlankNode
import typingsSlinky.activexLibreoffice.com_.sun.star.rdf.Literal
import typingsSlinky.activexLibreoffice.com_.sun.star.rdf.Repository
import typingsSlinky.activexLibreoffice.com_.sun.star.rdf.URI
import typingsSlinky.activexLibreoffice.com_.sun.star.reflection.CoreReflection
import typingsSlinky.activexLibreoffice.com_.sun.star.reflection.ProxyFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.reflection.TypeDescriptionManager
import typingsSlinky.activexLibreoffice.com_.sun.star.reflection.TypeDescriptionProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.registry.DefaultRegistry
import typingsSlinky.activexLibreoffice.com_.sun.star.registry.ImplementationRegistration
import typingsSlinky.activexLibreoffice.com_.sun.star.registry.NestedRegistry
import typingsSlinky.activexLibreoffice.com_.sun.star.registry.SimpleRegistry
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.BitmapCanvas
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.Canvas
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.CanvasFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.MtfRenderer
import typingsSlinky.activexLibreoffice.com_.sun.star.report.FixedLine
import typingsSlinky.activexLibreoffice.com_.sun.star.report.FormatCondition
import typingsSlinky.activexLibreoffice.com_.sun.star.report.Function
import typingsSlinky.activexLibreoffice.com_.sun.star.report.Group
import typingsSlinky.activexLibreoffice.com_.sun.star.report.Groups
import typingsSlinky.activexLibreoffice.com_.sun.star.report.ReportControlFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.report.ReportControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.report.ReportDefinition
import typingsSlinky.activexLibreoffice.com_.sun.star.report.ReportEngine
import typingsSlinky.activexLibreoffice.com_.sun.star.report.Section
import typingsSlinky.activexLibreoffice.com_.sun.star.report.inspection.DataProviderHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.report.inspection.DefaultComponentInspectorModel
import typingsSlinky.activexLibreoffice.com_.sun.star.report.inspection.ReportComponentHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.resource.StringResource
import typingsSlinky.activexLibreoffice.com_.sun.star.resource.StringResourceWithLocation
import typingsSlinky.activexLibreoffice.com_.sun.star.resource.StringResourceWithStorage
import typingsSlinky.activexLibreoffice.com_.sun.star.scanner.ScannerManager
import typingsSlinky.activexLibreoffice.com_.sun.star.script.AllListenerAdapter
import typingsSlinky.activexLibreoffice.com_.sun.star.script.Converter
import typingsSlinky.activexLibreoffice.com_.sun.star.script.DocumentDialogLibraryContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.script.DocumentScriptLibraryContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.script.Engine
import typingsSlinky.activexLibreoffice.com_.sun.star.script.Invocation
import typingsSlinky.activexLibreoffice.com_.sun.star.script.InvocationAdapterFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.script.JavaScript
import typingsSlinky.activexLibreoffice.com_.sun.star.script.browse.BrowseNode
import typingsSlinky.activexLibreoffice.com_.sun.star.script.browse.BrowseNodeFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.LanguageScriptProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.MasterScriptProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.MasterScriptProviderFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProviderForBasic
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProviderForBeanShell
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProviderForJava
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptProviderForJavaScript
import typingsSlinky.activexLibreoffice.com_.sun.star.script.provider.ScriptURIHelper
import typingsSlinky.activexLibreoffice.com_.sun.star.script.vba.VBAEventProcessor
import typingsSlinky.activexLibreoffice.com_.sun.star.script.vba.VBAMacroResolver
import typingsSlinky.activexLibreoffice.com_.sun.star.script.vba.VBASpreadsheetEventProcessor
import typingsSlinky.activexLibreoffice.com_.sun.star.script.vba.VBATextEventProcessor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.CallableStatement
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Column
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ColumnDescriptorControl
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ColumnDescriptorControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ColumnSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.CommandDefinition
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Connection
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ContentLoader
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DataAccessDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DataColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DataSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DataSourceBrowser
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseAccessConnection
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseAccessContext
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseAccessDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseContext
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseEnvironment
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatasourceAdministrationDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DefinitionContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DefinitionContent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Document
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DocumentContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DocumentDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DocumentDefinition
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ErrorMessageDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.FilterDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.OfficeDatabaseDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.OrderColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.OrderDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.PreparedStatement
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Query
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.QueryDefinition
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.QueryDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.QueryDesign
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.RelationDesign
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ReportDesign
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Reports
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ResultColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.ResultSet
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.RowSet
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.SQLQueryComposer
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.SingleSelectQueryAnalyzer
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.SingleSelectQueryComposer
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Table
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.TableDefinition
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.TableDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.TableDesign
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.TextConnectionSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.application.CopyTableWizard
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.application.DefaultViewController
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.application.MacroMigrationWizard
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.tools.ConnectionTools
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.ConnectionPool
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.ConnectionProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.DBASEConnectionProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.Driver
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.DriverManager
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.FILEConnectionProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.FLATConnectionProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.JDBCConnectionProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.ODBCConnectionProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.Statement
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.ColumnDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Container
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.DatabaseDefinition
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Descriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.GroupDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Index
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.IndexColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.IndexColumnDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.IndexDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Key
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.KeyColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.KeyColumnDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.KeyDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.ReferenceColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.User
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.UserDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.View
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.ViewDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.security.AccessController
import typingsSlinky.activexLibreoffice.com_.sun.star.security.CertificateContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.security.DocumentDigitalSignatures
import typingsSlinky.activexLibreoffice.com_.sun.star.security.Policy
import typingsSlinky.activexLibreoffice.com_.sun.star.security.SerialNumberAdapter
import typingsSlinky.activexLibreoffice.com_.sun.star.setup.UpdateCheck
import typingsSlinky.activexLibreoffice.com_.sun.star.setup.UpdateCheckConfig
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleCell
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleCsvCell
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleCsvRuler
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleCsvTable
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessiblePageHeaderFooterAreasView
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleSpreadsheet
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleSpreadsheetDocumentView
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AccessibleSpreadsheetPageView
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.AddIn
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAnnotation
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAnnotationShape
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAnnotations
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAnnotationsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAreaLink
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAreaLinks
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellAreaLinksEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellFormatRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellFormatRangesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Cells
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.CellsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ColorScale
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ConditionFormatEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ConditionalFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ConsolidationDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DDELink
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DDELinks
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DDELinksEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataBar
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotField
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroup
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroupEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroupItem
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroups
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroupsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFields
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotItem
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotItems
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotItemsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSource
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceDimension
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceDimensions
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceHierarchies
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceHierarchy
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceLevel
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceLevels
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceMember
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotSourceMembers
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotTable
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotTables
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotTablesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DatabaseImportDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DatabaseRange
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DatabaseRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DatabaseRangesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DateCondition
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ExternalDocLink
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ExternalDocLinks
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ExternalSheetCache
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FilterFormulaParser
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaOpCodeMapper
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaParser
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FunctionAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FunctionDescription
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FunctionDescriptionEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FunctionDescriptions
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.GlobalSheetSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.HeaderFooterContent
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.IconSet
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.LabelRange
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.LabelRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.LabelRangesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.NamedRange
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.NamedRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.NamedRangesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.RangeSelectionArguments
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.RecentFunctions
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Scenario
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Scenarios
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ScenariosEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetCell
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetCellCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetCellRange
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetCellRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetCellRangesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetFilterDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetLink
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetLinks
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetLinksEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetRangesQuery
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetSortDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SheetSortDescriptor2
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Solver
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Spreadsheet
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetDocumentSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetDrawPage
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetView
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetViewPane
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetViewPanesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetViewSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Spreadsheets
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SpreadsheetsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SubTotalDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SubTotalField
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SubTotalFieldsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableAutoFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableAutoFormatEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableAutoFormatField
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableAutoFormats
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableAutoFormatsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableCellStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableConditionalEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableConditionalEntryEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableConditionalFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TablePageStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableValidation
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.UniqueCellFormatRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.UniqueCellFormatRangesEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.VolatileResult
import typingsSlinky.activexLibreoffice.com_.sun.star.smarttags.SmartTagAction
import typingsSlinky.activexLibreoffice.com_.sun.star.smarttags.SmartTagRecognizer
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CellStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typingsSlinky.activexLibreoffice.com_.sun.star.style.CharacterStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.style.NumberingAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.style.NumberingLevel
import typingsSlinky.activexLibreoffice.com_.sun.star.style.NumberingRule
import typingsSlinky.activexLibreoffice.com_.sun.star.style.PageProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.style.PageStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex
import typingsSlinky.activexLibreoffice.com_.sun.star.style.ParagraphStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.style.Style
import typingsSlinky.activexLibreoffice.com_.sun.star.style.StyleFamilies
import typingsSlinky.activexLibreoffice.com_.sun.star.style.StyleFamily
import typingsSlinky.activexLibreoffice.com_.sun.star.system.SimpleCommandMail
import typingsSlinky.activexLibreoffice.com_.sun.star.system.SimpleSystemMail
import typingsSlinky.activexLibreoffice.com_.sun.star.system.SystemShellExecute
import typingsSlinky.activexLibreoffice.com_.sun.star.table.AccessibleCellView
import typingsSlinky.activexLibreoffice.com_.sun.star.table.AccessibleTableView
import typingsSlinky.activexLibreoffice.com_.sun.star.table.Cell
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRange
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeListSource
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellValueBinding
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ListPositionCellBinding
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableChart
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableCharts
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableChartsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableColumns
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableColumnsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableRow
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableRows
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableRowsEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableSortDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableSortDescriptor2
import typingsSlinky.activexLibreoffice.com_.sun.star.task.AsyncJob
import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionRequestStringResolver
import typingsSlinky.activexLibreoffice.com_.sun.star.task.Job
import typingsSlinky.activexLibreoffice.com_.sun.star.task.JobExecutor
import typingsSlinky.activexLibreoffice.com_.sun.star.task.PasswordContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.task.PasswordContainerInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.task.StatusIndicatorFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleEndnoteView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleFootnoteView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleHeaderFooterView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessiblePageView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleParagraphView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleTextDocumentPageView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleTextDocumentView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleTextEmbeddedObject
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleTextFrameView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AccessibleTextGraphicObject
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AutoTextContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AutoTextEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.text.AutoTextGroup
import typingsSlinky.activexLibreoffice.com_.sun.star.text.BaseFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.text.BaseFrameProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.text.BaseIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.BaseIndexMark
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Bookmark
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Bookmarks
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ChainedTextFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ChapterNumberingRule
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ContentIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ContentIndexMark
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DefaultNumberingProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DependentTextField
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentIndexLevelFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentIndexMark
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentIndexMarkAsian
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentIndexParagraphStyles
import typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentIndexes
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Endnote
import typingsSlinky.activexLibreoffice.com_.sun.star.text.EndnoteSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Footnote
import typingsSlinky.activexLibreoffice.com_.sun.star.text.FootnoteSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Footnotes
import typingsSlinky.activexLibreoffice.com_.sun.star.text.GenericTextDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.text.GlobalDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.text.GlobalSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.text.IllustrationsIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.InContentMetadata
import typingsSlinky.activexLibreoffice.com_.sun.star.text.LineNumberingProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.text.MailMerge
import typingsSlinky.activexLibreoffice.com_.sun.star.text.NumberingRules
import typingsSlinky.activexLibreoffice.com_.sun.star.text.NumberingStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ObjectIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.PageFootnoteInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.text.PagePrintSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.text.Paragraph
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ParagraphEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.text.PrintSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.text.RedlinePortion
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ReferenceMark
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ReferenceMarks
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TableIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextColumns
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextContent
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextContentCollection
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextDocumentView
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextEmbeddedObject
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextEmbeddedObjects
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFieldEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFieldMaster
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFieldMasters
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextField_
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFields
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextFrames
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextGraphicObject
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextGraphicObjects
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextLayoutCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextPageStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextPortion
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextPortionEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextRange
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextRangeContentProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextRanges
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextSection
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextSections
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextSortDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextSortDescriptor2
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextSortable
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextTable
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextTableCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextTableRow
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextTables
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextViewCursor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.UserDefinedIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.UserIndex
import typingsSlinky.activexLibreoffice.com_.sun.star.text.UserIndexMark
import typingsSlinky.activexLibreoffice.com_.sun.star.text.ViewSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.text.WebDocument
import typingsSlinky.activexLibreoffice.com_.sun.star.text.fieldmaster.DDE
import typingsSlinky.activexLibreoffice.com_.sun.star.text.fieldmaster.Database
import typingsSlinky.activexLibreoffice.com_.sun.star.text.fieldmaster.SetExpression
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Annotation
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Author
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Chapter
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.CharacterCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.CombinedCharacters
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.ConditionalText
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DatabaseName
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DatabaseNextSet
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DatabaseNumberOfSet
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DatabaseSetNumber
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DropDown
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.EmbeddedObjectCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.ExtendedUser
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.FileName
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.GetExpression
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.GetReference
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.GraphicObjectCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.HiddenParagraph
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.HiddenText
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Input
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.InputUser
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.JumpEdit
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Macro
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.MetadataField
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.PageCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.PageNumber
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.ParagraphCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.ReferencePageGet
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.ReferencePageSet
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Script
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.TableCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.TableFormula
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.TemplateName
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.URL
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.WordCount
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.ChangeAuthor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.ChangeDateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.CreateAuthor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.CreateDateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.Custom
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.Description
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.EditTime
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.Keywords
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.PrintAuthor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.PrintDateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.Revision
import typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.Subject
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.AnyCompareFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedContentResultSet
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedContentResultSetFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedContentResultSetStub
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedContentResultSetStubFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedDynamicResultSet
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedDynamicResultSetFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedDynamicResultSetStub
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CachedDynamicResultSetStubFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CmisContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CommandEnvironment
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Content
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentProviderProxy
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentProviderProxyFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentResultSet
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentTransmitter
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.DefaultHierarchyDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.DynamicResultSet
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ExpandContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FTPContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FTPContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FileContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FileContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.GIOContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.GnomeVFSContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.GnomeVFSDocumentContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.GnomeVFSFolderContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HelpContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HelpContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyDataReadAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyDataReadWriteAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyFolderContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyLinkContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.HierarchyRootFolderContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ODMAContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ODMAContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PackageContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PackageFolderContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PackageStreamContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PersistentPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PropertiesManager
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PropertySetRegistry
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RemoteAccessContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RemoteContentProviderAcceptor
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RemoteProxyContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SimpleFileAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SortedDynamicResultSetFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Store
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransientDocumentsContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransientDocumentsDocumentContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransientDocumentsFolderContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransientDocumentsRootContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransientDocumentsStreamContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.UniversalContentBroker
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.WebDAVContentProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.WebDAVDocumentContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.WebDAVFolderContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ActionTrigger
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ActionTriggerContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ActionTriggerSeparator
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.AddressBookSourceDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ConfigurableUIElement
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.DocumentAcceleratorConfiguration
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.GlobalAcceleratorConfiguration
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ImageManager
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ItemDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ModuleAcceleratorConfiguration
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ModuleUICategoryDescription
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ModuleUICommandDescription
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ModuleUIConfigurationManager
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ModuleWindowStateConfiguration
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.UICategoryDescription
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.UIConfigurationManager
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.UIElement
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.UIElementFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.UIElementFactoryManager
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.UIElementSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.WindowContentFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.WindowContentFactoryManager
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.WindowStateConfiguration
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.AddressBookSourcePilot
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.FilePicker
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.FilterOptionsDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.FolderPicker
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.Wizard
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.XSLTFilterDialog
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.test.UITest
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.NamingService
import typingsSlinky.activexLibreoffice.com_.sun.star.uri.ExternalUriReferenceTranslator
import typingsSlinky.activexLibreoffice.com_.sun.star.uri.UriReferenceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.uri.UriSchemeParserVndDOTsunDOTstarDOTexpand
import typingsSlinky.activexLibreoffice.com_.sun.star.uri.UriSchemeParserVndDOTsunDOTstarDOTscript
import typingsSlinky.activexLibreoffice.com_.sun.star.uri.VndSunStarPkgUrlReferenceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.util.BootstrapMacroExpander
import typingsSlinky.activexLibreoffice.com_.sun.star.util.JobManager
import typingsSlinky.activexLibreoffice.com_.sun.star.util.MacroExpander
import typingsSlinky.activexLibreoffice.com_.sun.star.util.NumberFormatProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.util.NumberFormatSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.util.NumberFormats
import typingsSlinky.activexLibreoffice.com_.sun.star.util.NumberFormatsSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.util.NumberFormatter
import typingsSlinky.activexLibreoffice.com_.sun.star.util.OfficeInstallationDirectories
import typingsSlinky.activexLibreoffice.com_.sun.star.util.PathSettings
import typingsSlinky.activexLibreoffice.com_.sun.star.util.PathSubstitution
import typingsSlinky.activexLibreoffice.com_.sun.star.util.ReplaceDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SearchDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SortDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SortDescriptor2
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Sortable
import typingsSlinky.activexLibreoffice.com_.sun.star.util.TextSearch
import typingsSlinky.activexLibreoffice.com_.sun.star.util.TextSearch2
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URLTransformer
import typingsSlinky.activexLibreoffice.com_.sun.star.util.UriAbbreviation
import typingsSlinky.activexLibreoffice.com_.sun.star.view.OfficeDocumentView
import typingsSlinky.activexLibreoffice.com_.sun.star.view.PrintOptions
import typingsSlinky.activexLibreoffice.com_.sun.star.view.PrinterDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.view.RenderDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.view.RenderOptions
import typingsSlinky.activexLibreoffice.com_.sun.star.xforms.Binding
import typingsSlinky.activexLibreoffice.com_.sun.star.xforms.Model
import typingsSlinky.activexLibreoffice.com_.sun.star.xforms.XForms
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.AttributeContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.NamespaceContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.ParaUserDefinedAttributesSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.TextUserDefinedAttributesSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.XMLExportFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.XMLImportFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.NSSInitializer
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.SEInitializer
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.SecurityEnvironment
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.XMLEncryption
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.XMLEncryptionTemplate
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.XMLSecurityContext
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.XMLSignature
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.XMLSignatureTemplate
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax.Decryptor
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax.Encryptor
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax.SAXEventKeeper
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax.SignatureCreator
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax.SignatureVerifier
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.DocumentBuilder
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.SAXDocumentBuilder
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.input.SaxDocumentHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.FastParser
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.FastShapeContextHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.FastTokenHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.Parser
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.Writer
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.wrapper.XMLDocumentWrapper
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.wrapper.XMLElementWrapper
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.xpath.XPathAPI
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.xpath.XPathExtension
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.xslt.XSLT2Transformer
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.xslt.XSLTTransformer
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Boolean
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Date
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Day
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Decimal
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Month
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.String
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Time
import typingsSlinky.activexLibreoffice.com_.sun.star.xsd.Year
import typingsSlinky.activexLibreoffice.org_.freedesktop.PackageKit.SyncDbusSessionHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesNameMap extends js.Object {
  @JSName("com.sun.star.accessibility.Accessible")
  var comDotsunDotstarDotaccessibilityDotAccessible: Accessible
  @JSName("com.sun.star.accessibility.AccessibleContext")
  var comDotsunDotstarDotaccessibilityDotAccessibleContext: AccessibleContext
  @JSName("com.sun.star.accessibility.MSAAService")
  var comDotsunDotstarDotaccessibilityDotMSAAService: MSAAService
  @JSName("com.sun.star.animations.AnimateColor")
  var comDotsunDotstarDotanimationsDotAnimateColor: AnimateColor
  @JSName("com.sun.star.animations.AnimateMotion")
  var comDotsunDotstarDotanimationsDotAnimateMotion: AnimateMotion
  @JSName("com.sun.star.animations.AnimateSet")
  var comDotsunDotstarDotanimationsDotAnimateSet: AnimateSet
  @JSName("com.sun.star.animations.Audio")
  var comDotsunDotstarDotanimationsDotAudio: Audio
  @JSName("com.sun.star.animations.Command")
  var comDotsunDotstarDotanimationsDotCommand: Command
  @JSName("com.sun.star.animations.IterateContainer")
  var comDotsunDotstarDotanimationsDotIterateContainer: IterateContainer
  @JSName("com.sun.star.animations.ParallelTimeContainer")
  var comDotsunDotstarDotanimationsDotParallelTimeContainer: ParallelTimeContainer
  @JSName("com.sun.star.animations.SequenceTimeContainer")
  var comDotsunDotstarDotanimationsDotSequenceTimeContainer: SequenceTimeContainer
  @JSName("com.sun.star.auth.SSOManagerFactory")
  var comDotsunDotstarDotauthDotSSOManagerFactory: SSOManagerFactory
  @JSName("com.sun.star.auth.SSOPasswordCache")
  var comDotsunDotstarDotauthDotSSOPasswordCache: SSOPasswordCache
  @JSName("com.sun.star.awt.AccessibleButton")
  var comDotsunDotstarDotawtDotAccessibleButton: AccessibleButton
  @JSName("com.sun.star.awt.AccessibleCheckBox")
  var comDotsunDotstarDotawtDotAccessibleCheckBox: AccessibleCheckBox
  @JSName("com.sun.star.awt.AccessibleComboBox")
  var comDotsunDotstarDotawtDotAccessibleComboBox: AccessibleComboBox
  @JSName("com.sun.star.awt.AccessibleDropDownComboBox")
  var comDotsunDotstarDotawtDotAccessibleDropDownComboBox: AccessibleDropDownComboBox
  @JSName("com.sun.star.awt.AccessibleDropDownListBox")
  var comDotsunDotstarDotawtDotAccessibleDropDownListBox: AccessibleDropDownListBox
  @JSName("com.sun.star.awt.AccessibleEdit")
  var comDotsunDotstarDotawtDotAccessibleEdit: AccessibleEdit
  @JSName("com.sun.star.awt.AccessibleFixedText")
  var comDotsunDotstarDotawtDotAccessibleFixedText: AccessibleFixedText
  @JSName("com.sun.star.awt.AccessibleIconChoiceControl")
  var comDotsunDotstarDotawtDotAccessibleIconChoiceControl: AccessibleIconChoiceControl
  @JSName("com.sun.star.awt.AccessibleIconChoiceControlEntry")
  var comDotsunDotstarDotawtDotAccessibleIconChoiceControlEntry: AccessibleIconChoiceControlEntry
  @JSName("com.sun.star.awt.AccessibleList")
  var comDotsunDotstarDotawtDotAccessibleList: AccessibleList
  @JSName("com.sun.star.awt.AccessibleListBox")
  var comDotsunDotstarDotawtDotAccessibleListBox: AccessibleListBox
  @JSName("com.sun.star.awt.AccessibleListBoxList")
  var comDotsunDotstarDotawtDotAccessibleListBoxList: AccessibleListBoxList
  @JSName("com.sun.star.awt.AccessibleListItem")
  var comDotsunDotstarDotawtDotAccessibleListItem: AccessibleListItem
  @JSName("com.sun.star.awt.AccessibleMenu")
  var comDotsunDotstarDotawtDotAccessibleMenu: AccessibleMenu
  @JSName("com.sun.star.awt.AccessibleMenuBar")
  var comDotsunDotstarDotawtDotAccessibleMenuBar: AccessibleMenuBar
  @JSName("com.sun.star.awt.AccessibleMenuItem")
  var comDotsunDotstarDotawtDotAccessibleMenuItem: AccessibleMenuItem
  @JSName("com.sun.star.awt.AccessibleMenuSeparator")
  var comDotsunDotstarDotawtDotAccessibleMenuSeparator: AccessibleMenuSeparator
  @JSName("com.sun.star.awt.AccessiblePopupMenu")
  var comDotsunDotstarDotawtDotAccessiblePopupMenu: AccessiblePopupMenu
  @JSName("com.sun.star.awt.AccessibleRadioButton")
  var comDotsunDotstarDotawtDotAccessibleRadioButton: AccessibleRadioButton
  @JSName("com.sun.star.awt.AccessibleScrollBar")
  var comDotsunDotstarDotawtDotAccessibleScrollBar: AccessibleScrollBar
  @JSName("com.sun.star.awt.AccessibleStatusBar")
  var comDotsunDotstarDotawtDotAccessibleStatusBar: AccessibleStatusBar
  @JSName("com.sun.star.awt.AccessibleStatusBarItem")
  var comDotsunDotstarDotawtDotAccessibleStatusBarItem: AccessibleStatusBarItem
  @JSName("com.sun.star.awt.AccessibleTabBar")
  var comDotsunDotstarDotawtDotAccessibleTabBar: AccessibleTabBar
  @JSName("com.sun.star.awt.AccessibleTabBarPage")
  var comDotsunDotstarDotawtDotAccessibleTabBarPage: AccessibleTabBarPage
  @JSName("com.sun.star.awt.AccessibleTabBarPageList")
  var comDotsunDotstarDotawtDotAccessibleTabBarPageList: AccessibleTabBarPageList
  @JSName("com.sun.star.awt.AccessibleTabControl")
  var comDotsunDotstarDotawtDotAccessibleTabControl: AccessibleTabControl
  @JSName("com.sun.star.awt.AccessibleTabPage")
  var comDotsunDotstarDotawtDotAccessibleTabPage: AccessibleTabPage
  @JSName("com.sun.star.awt.AccessibleTextField")
  var comDotsunDotstarDotawtDotAccessibleTextField: AccessibleTextField
  @JSName("com.sun.star.awt.AccessibleToolBox")
  var comDotsunDotstarDotawtDotAccessibleToolBox: AccessibleToolBox
  @JSName("com.sun.star.awt.AccessibleToolBoxItem")
  var comDotsunDotstarDotawtDotAccessibleToolBoxItem: AccessibleToolBoxItem
  @JSName("com.sun.star.awt.AccessibleTreeListBox")
  var comDotsunDotstarDotawtDotAccessibleTreeListBox: AccessibleTreeListBox
  @JSName("com.sun.star.awt.AccessibleTreeListBoxEntry")
  var comDotsunDotstarDotawtDotAccessibleTreeListBoxEntry: AccessibleTreeListBoxEntry
  @JSName("com.sun.star.awt.AccessibleWindow")
  var comDotsunDotstarDotawtDotAccessibleWindow: AccessibleWindow
  @JSName("com.sun.star.awt.AnimatedImagesControl")
  var comDotsunDotstarDotawtDotAnimatedImagesControl: AnimatedImagesControl
  @JSName("com.sun.star.awt.AnimatedImagesControlModel")
  var comDotsunDotstarDotawtDotAnimatedImagesControlModel: AnimatedImagesControlModel
  @JSName("com.sun.star.awt.AsyncCallback")
  var comDotsunDotstarDotawtDotAsyncCallback: AsyncCallback
  @JSName("com.sun.star.awt.ContainerWindowProvider")
  var comDotsunDotstarDotawtDotContainerWindowProvider: ContainerWindowProvider
  @JSName("com.sun.star.awt.DialogProvider")
  var comDotsunDotstarDotawtDotDialogProvider: DialogProvider
  @JSName("com.sun.star.awt.DialogProvider2")
  var comDotsunDotstarDotawtDotDialogProvider2: DialogProvider2
  @JSName("com.sun.star.awt.MenuBar")
  var comDotsunDotstarDotawtDotMenuBar: MenuBar
  @JSName("com.sun.star.awt.Pointer")
  var comDotsunDotstarDotawtDotPointer: Pointer
  @JSName("com.sun.star.awt.PopupMenu")
  var comDotsunDotstarDotawtDotPopupMenu: PopupMenu
  @JSName("com.sun.star.awt.PrinterServer")
  var comDotsunDotstarDotawtDotPrinterServer: PrinterServer
  @JSName("com.sun.star.awt.RoadmapItem")
  var comDotsunDotstarDotawtDotRoadmapItem: RoadmapItem
  @JSName("com.sun.star.awt.SpinningProgressControlModel")
  var comDotsunDotstarDotawtDotSpinningProgressControlModel: SpinningProgressControlModel
  @JSName("com.sun.star.awt.TabController")
  var comDotsunDotstarDotawtDotTabController: TabController
  @JSName("com.sun.star.awt.TabControllerModel")
  var comDotsunDotstarDotawtDotTabControllerModel: TabControllerModel
  @JSName("com.sun.star.awt.Toolkit")
  var comDotsunDotstarDotawtDotToolkit: Toolkit
  @JSName("com.sun.star.awt.UnoControl")
  var comDotsunDotstarDotawtDotUnoControl: UnoControl
  @JSName("com.sun.star.awt.UnoControlButton")
  var comDotsunDotstarDotawtDotUnoControlButton: UnoControlButton
  @JSName("com.sun.star.awt.UnoControlButtonModel")
  var comDotsunDotstarDotawtDotUnoControlButtonModel: UnoControlButtonModel
  @JSName("com.sun.star.awt.UnoControlCheckBox")
  var comDotsunDotstarDotawtDotUnoControlCheckBox: UnoControlCheckBox
  @JSName("com.sun.star.awt.UnoControlCheckBoxModel")
  var comDotsunDotstarDotawtDotUnoControlCheckBoxModel: UnoControlCheckBoxModel
  @JSName("com.sun.star.awt.UnoControlComboBox")
  var comDotsunDotstarDotawtDotUnoControlComboBox: UnoControlComboBox
  @JSName("com.sun.star.awt.UnoControlComboBoxModel")
  var comDotsunDotstarDotawtDotUnoControlComboBoxModel: UnoControlComboBoxModel
  @JSName("com.sun.star.awt.UnoControlContainer")
  var comDotsunDotstarDotawtDotUnoControlContainer: UnoControlContainer
  @JSName("com.sun.star.awt.UnoControlContainerModel")
  var comDotsunDotstarDotawtDotUnoControlContainerModel: UnoControlContainerModel
  @JSName("com.sun.star.awt.UnoControlCurrencyField")
  var comDotsunDotstarDotawtDotUnoControlCurrencyField: UnoControlCurrencyField
  @JSName("com.sun.star.awt.UnoControlCurrencyFieldModel")
  var comDotsunDotstarDotawtDotUnoControlCurrencyFieldModel: UnoControlCurrencyFieldModel
  @JSName("com.sun.star.awt.UnoControlDateField")
  var comDotsunDotstarDotawtDotUnoControlDateField: UnoControlDateField
  @JSName("com.sun.star.awt.UnoControlDateFieldModel")
  var comDotsunDotstarDotawtDotUnoControlDateFieldModel: UnoControlDateFieldModel
  @JSName("com.sun.star.awt.UnoControlDialog")
  var comDotsunDotstarDotawtDotUnoControlDialog: UnoControlDialog
  @JSName("com.sun.star.awt.UnoControlDialogElement")
  var comDotsunDotstarDotawtDotUnoControlDialogElement: UnoControlDialogElement
  @JSName("com.sun.star.awt.UnoControlDialogModel")
  var comDotsunDotstarDotawtDotUnoControlDialogModel: UnoControlDialogModel
  @JSName("com.sun.star.awt.UnoControlDialogModelProvider")
  var comDotsunDotstarDotawtDotUnoControlDialogModelProvider: UnoControlDialogModelProvider
  @JSName("com.sun.star.awt.UnoControlEdit")
  var comDotsunDotstarDotawtDotUnoControlEdit: UnoControlEdit
  @JSName("com.sun.star.awt.UnoControlEditModel")
  var comDotsunDotstarDotawtDotUnoControlEditModel: UnoControlEditModel
  @JSName("com.sun.star.awt.UnoControlFileControl")
  var comDotsunDotstarDotawtDotUnoControlFileControl: UnoControlFileControl
  @JSName("com.sun.star.awt.UnoControlFileControlModel")
  var comDotsunDotstarDotawtDotUnoControlFileControlModel: UnoControlFileControlModel
  @JSName("com.sun.star.awt.UnoControlFixedHyperlink")
  var comDotsunDotstarDotawtDotUnoControlFixedHyperlink: UnoControlFixedHyperlink
  @JSName("com.sun.star.awt.UnoControlFixedHyperlinkModel")
  var comDotsunDotstarDotawtDotUnoControlFixedHyperlinkModel: UnoControlFixedHyperlinkModel
  @JSName("com.sun.star.awt.UnoControlFixedLine")
  var comDotsunDotstarDotawtDotUnoControlFixedLine: UnoControlFixedLine
  @JSName("com.sun.star.awt.UnoControlFixedLineModel")
  var comDotsunDotstarDotawtDotUnoControlFixedLineModel: UnoControlFixedLineModel
  @JSName("com.sun.star.awt.UnoControlFixedText")
  var comDotsunDotstarDotawtDotUnoControlFixedText: UnoControlFixedText
  @JSName("com.sun.star.awt.UnoControlFixedTextModel")
  var comDotsunDotstarDotawtDotUnoControlFixedTextModel: UnoControlFixedTextModel
  @JSName("com.sun.star.awt.UnoControlFormattedField")
  var comDotsunDotstarDotawtDotUnoControlFormattedField: UnoControlFormattedField
  @JSName("com.sun.star.awt.UnoControlFormattedFieldModel")
  var comDotsunDotstarDotawtDotUnoControlFormattedFieldModel: UnoControlFormattedFieldModel
  @JSName("com.sun.star.awt.UnoControlGroupBox")
  var comDotsunDotstarDotawtDotUnoControlGroupBox: UnoControlGroupBox
  @JSName("com.sun.star.awt.UnoControlGroupBoxModel")
  var comDotsunDotstarDotawtDotUnoControlGroupBoxModel: UnoControlGroupBoxModel
  @JSName("com.sun.star.awt.UnoControlImageControl")
  var comDotsunDotstarDotawtDotUnoControlImageControl: UnoControlImageControl
  @JSName("com.sun.star.awt.UnoControlImageControlModel")
  var comDotsunDotstarDotawtDotUnoControlImageControlModel: UnoControlImageControlModel
  @JSName("com.sun.star.awt.UnoControlListBox")
  var comDotsunDotstarDotawtDotUnoControlListBox: UnoControlListBox
  @JSName("com.sun.star.awt.UnoControlListBoxModel")
  var comDotsunDotstarDotawtDotUnoControlListBoxModel: UnoControlListBoxModel
  @JSName("com.sun.star.awt.UnoControlModel")
  var comDotsunDotstarDotawtDotUnoControlModel: UnoControlModel
  @JSName("com.sun.star.awt.UnoControlNumericField")
  var comDotsunDotstarDotawtDotUnoControlNumericField: UnoControlNumericField
  @JSName("com.sun.star.awt.UnoControlNumericFieldModel")
  var comDotsunDotstarDotawtDotUnoControlNumericFieldModel: UnoControlNumericFieldModel
  @JSName("com.sun.star.awt.UnoControlPatternField")
  var comDotsunDotstarDotawtDotUnoControlPatternField: UnoControlPatternField
  @JSName("com.sun.star.awt.UnoControlPatternFieldModel")
  var comDotsunDotstarDotawtDotUnoControlPatternFieldModel: UnoControlPatternFieldModel
  @JSName("com.sun.star.awt.UnoControlProgressBar")
  var comDotsunDotstarDotawtDotUnoControlProgressBar: UnoControlProgressBar
  @JSName("com.sun.star.awt.UnoControlProgressBarModel")
  var comDotsunDotstarDotawtDotUnoControlProgressBarModel: UnoControlProgressBarModel
  @JSName("com.sun.star.awt.UnoControlRadioButton")
  var comDotsunDotstarDotawtDotUnoControlRadioButton: UnoControlRadioButton
  @JSName("com.sun.star.awt.UnoControlRadioButtonModel")
  var comDotsunDotstarDotawtDotUnoControlRadioButtonModel: UnoControlRadioButtonModel
  @JSName("com.sun.star.awt.UnoControlRoadmap")
  var comDotsunDotstarDotawtDotUnoControlRoadmap: UnoControlRoadmap
  @JSName("com.sun.star.awt.UnoControlRoadmapModel")
  var comDotsunDotstarDotawtDotUnoControlRoadmapModel: UnoControlRoadmapModel
  @JSName("com.sun.star.awt.UnoControlScrollBar")
  var comDotsunDotstarDotawtDotUnoControlScrollBar: UnoControlScrollBar
  @JSName("com.sun.star.awt.UnoControlScrollBarModel")
  var comDotsunDotstarDotawtDotUnoControlScrollBarModel: UnoControlScrollBarModel
  @JSName("com.sun.star.awt.UnoControlSpinButton")
  var comDotsunDotstarDotawtDotUnoControlSpinButton: UnoControlSpinButton
  @JSName("com.sun.star.awt.UnoControlSpinButtonModel")
  var comDotsunDotstarDotawtDotUnoControlSpinButtonModel: UnoControlSpinButtonModel
  @JSName("com.sun.star.awt.UnoControlTimeField")
  var comDotsunDotstarDotawtDotUnoControlTimeField: UnoControlTimeField
  @JSName("com.sun.star.awt.UnoControlTimeFieldModel")
  var comDotsunDotstarDotawtDotUnoControlTimeFieldModel: UnoControlTimeFieldModel
  @JSName("com.sun.star.awt.grid.DefaultGridColumnModel")
  var comDotsunDotstarDotawtDotgridDotDefaultGridColumnModel: DefaultGridColumnModel
  @JSName("com.sun.star.awt.grid.DefaultGridDataModel")
  var comDotsunDotstarDotawtDotgridDotDefaultGridDataModel: DefaultGridDataModel
  @JSName("com.sun.star.awt.grid.GridColumn")
  var comDotsunDotstarDotawtDotgridDotGridColumn: GridColumn
  @JSName("com.sun.star.awt.grid.SortableGridDataModel")
  var comDotsunDotstarDotawtDotgridDotSortableGridDataModel: SortableGridDataModel
  @JSName("com.sun.star.awt.grid.UnoControlGrid")
  var comDotsunDotstarDotawtDotgridDotUnoControlGrid: UnoControlGrid
  @JSName("com.sun.star.awt.grid.UnoControlGridModel")
  var comDotsunDotstarDotawtDotgridDotUnoControlGridModel: UnoControlGridModel
  @JSName("com.sun.star.awt.tab.UnoControlTabPage")
  var comDotsunDotstarDotawtDottabDotUnoControlTabPage: UnoControlTabPage
  @JSName("com.sun.star.awt.tab.UnoControlTabPageContainer")
  var comDotsunDotstarDotawtDottabDotUnoControlTabPageContainer: UnoControlTabPageContainer
  @JSName("com.sun.star.awt.tab.UnoControlTabPageContainerModel")
  var comDotsunDotstarDotawtDottabDotUnoControlTabPageContainerModel: UnoControlTabPageContainerModel
  @JSName("com.sun.star.awt.tab.UnoControlTabPageModel")
  var comDotsunDotstarDotawtDottabDotUnoControlTabPageModel: UnoControlTabPageModel
  @JSName("com.sun.star.awt.tree.MutableTreeDataModel")
  var comDotsunDotstarDotawtDottreeDotMutableTreeDataModel: MutableTreeDataModel
  @JSName("com.sun.star.awt.tree.MutableTreeNode")
  var comDotsunDotstarDotawtDottreeDotMutableTreeNode: MutableTreeNode
  @JSName("com.sun.star.awt.tree.TreeControl")
  var comDotsunDotstarDotawtDottreeDotTreeControl: TreeControl
  @JSName("com.sun.star.awt.tree.TreeControlModel")
  var comDotsunDotstarDotawtDottreeDotTreeControlModel: TreeControlModel
  @JSName("com.sun.star.beans.Introspection")
  var comDotsunDotstarDotbeansDotIntrospection: Introspection
  @JSName("com.sun.star.beans.PropertyBag")
  var comDotsunDotstarDotbeansDotPropertyBag: PropertyBag
  @JSName("com.sun.star.beans.PropertySet")
  var comDotsunDotstarDotbeansDotPropertySet: PropertySet
  @JSName("com.sun.star.bridge.Bridge")
  var comDotsunDotstarDotbridgeDotBridge: Bridge
  @JSName("com.sun.star.bridge.BridgeFactory")
  var comDotsunDotstarDotbridgeDotBridgeFactory: BridgeFactory
  @JSName("com.sun.star.bridge.IiopBridge")
  var comDotsunDotstarDotbridgeDotIiopBridge: IiopBridge
  @JSName("com.sun.star.bridge.OleApplicationRegistration")
  var comDotsunDotstarDotbridgeDotOleApplicationRegistration: OleApplicationRegistration
  @JSName("com.sun.star.bridge.OleBridgeSupplier")
  var comDotsunDotstarDotbridgeDotOleBridgeSupplier: OleBridgeSupplier
  @JSName("com.sun.star.bridge.OleBridgeSupplier2")
  var comDotsunDotstarDotbridgeDotOleBridgeSupplier2: OleBridgeSupplier2
  @JSName("com.sun.star.bridge.OleBridgeSupplierVar1")
  var comDotsunDotstarDotbridgeDotOleBridgeSupplierVar1: OleBridgeSupplierVar1
  @JSName("com.sun.star.bridge.OleObjectFactory")
  var comDotsunDotstarDotbridgeDotOleObjectFactory: OleObjectFactory
  @JSName("com.sun.star.bridge.UnoUrlResolver")
  var comDotsunDotstarDotbridgeDotUnoUrlResolver: UnoUrlResolver
  @JSName("com.sun.star.bridge.UrpBridge")
  var comDotsunDotstarDotbridgeDotUrpBridge: UrpBridge
  @JSName("com.sun.star.bridge.oleautomation.ApplicationRegistration")
  var comDotsunDotstarDotbridgeDotoleautomationDotApplicationRegistration: ApplicationRegistration
  @JSName("com.sun.star.bridge.oleautomation.BridgeSupplier")
  var comDotsunDotstarDotbridgeDotoleautomationDotBridgeSupplier: BridgeSupplier
  @JSName("com.sun.star.bridge.oleautomation.Factory")
  var comDotsunDotstarDotbridgeDotoleautomationDotFactory: Factory
  @JSName("com.sun.star.chart2.Axis")
  var comDotsunDotstarDotchart2DotAxis: Axis
  @JSName("com.sun.star.chart2.CandleStickChartType")
  var comDotsunDotstarDotchart2DotCandleStickChartType: CandleStickChartType
  @JSName("com.sun.star.chart2.CartesianCoordinateSystem2d")
  var comDotsunDotstarDotchart2DotCartesianCoordinateSystem2d: CartesianCoordinateSystem2d
  @JSName("com.sun.star.chart2.CartesianCoordinateSystem3d")
  var comDotsunDotstarDotchart2DotCartesianCoordinateSystem3d: CartesianCoordinateSystem3d
  @JSName("com.sun.star.chart2.ChartDocument")
  var comDotsunDotstarDotchart2DotChartDocument: ChartDocument
  @JSName("com.sun.star.chart2.ChartDocumentWrapper")
  var comDotsunDotstarDotchart2DotChartDocumentWrapper: ChartDocumentWrapper
  @JSName("com.sun.star.chart2.ChartType")
  var comDotsunDotstarDotchart2DotChartType: ChartType
  @JSName("com.sun.star.chart2.ChartTypeManager")
  var comDotsunDotstarDotchart2DotChartTypeManager: ChartTypeManager
  @JSName("com.sun.star.chart2.ChartTypeTemplate")
  var comDotsunDotstarDotchart2DotChartTypeTemplate: ChartTypeTemplate
  @JSName("com.sun.star.chart2.CoordinateSystem")
  var comDotsunDotstarDotchart2DotCoordinateSystem: CoordinateSystem
  @JSName("com.sun.star.chart2.CoordinateSystemType")
  var comDotsunDotstarDotchart2DotCoordinateSystemType: CoordinateSystemType
  @JSName("com.sun.star.chart2.DataPoint")
  var comDotsunDotstarDotchart2DotDataPoint: DataPoint
  @JSName("com.sun.star.chart2.DataPointProperties")
  var comDotsunDotstarDotchart2DotDataPointProperties: DataPointProperties
  @JSName("com.sun.star.chart2.DataSeries")
  var comDotsunDotstarDotchart2DotDataSeries: DataSeries
  @JSName("com.sun.star.chart2.Diagram")
  var comDotsunDotstarDotchart2DotDiagram: Diagram
  @JSName("com.sun.star.chart2.ErrorBar")
  var comDotsunDotstarDotchart2DotErrorBar: ErrorBar
  @JSName("com.sun.star.chart2.ExponentialRegressionCurve")
  var comDotsunDotstarDotchart2DotExponentialRegressionCurve: ExponentialRegressionCurve
  @JSName("com.sun.star.chart2.ExponentialScaling")
  var comDotsunDotstarDotchart2DotExponentialScaling: ExponentialScaling
  @JSName("com.sun.star.chart2.FormattedString")
  var comDotsunDotstarDotchart2DotFormattedString: FormattedString
  @JSName("com.sun.star.chart2.GridProperties")
  var comDotsunDotstarDotchart2DotGridProperties: GridProperties
  @JSName("com.sun.star.chart2.Legend")
  var comDotsunDotstarDotchart2DotLegend: Legend
  @JSName("com.sun.star.chart2.LinearRegressionCurve")
  var comDotsunDotstarDotchart2DotLinearRegressionCurve: LinearRegressionCurve
  @JSName("com.sun.star.chart2.LinearScaling")
  var comDotsunDotstarDotchart2DotLinearScaling: LinearScaling
  @JSName("com.sun.star.chart2.LogarithmicRegressionCurve")
  var comDotsunDotstarDotchart2DotLogarithmicRegressionCurve: LogarithmicRegressionCurve
  @JSName("com.sun.star.chart2.LogarithmicScaling")
  var comDotsunDotstarDotchart2DotLogarithmicScaling: LogarithmicScaling
  @JSName("com.sun.star.chart2.LogicTargetModel")
  var comDotsunDotstarDotchart2DotLogicTargetModel: LogicTargetModel
  @JSName("com.sun.star.chart2.MovingAverageRegressionCurve")
  var comDotsunDotstarDotchart2DotMovingAverageRegressionCurve: MovingAverageRegressionCurve
  @JSName("com.sun.star.chart2.PolarCoordinateSystem2d")
  var comDotsunDotstarDotchart2DotPolarCoordinateSystem2d: PolarCoordinateSystem2d
  @JSName("com.sun.star.chart2.PolarCoordinateSystem3d")
  var comDotsunDotstarDotchart2DotPolarCoordinateSystem3d: PolarCoordinateSystem3d
  @JSName("com.sun.star.chart2.PolynomialRegressionCurve")
  var comDotsunDotstarDotchart2DotPolynomialRegressionCurve: PolynomialRegressionCurve
  @JSName("com.sun.star.chart2.PotentialRegressionCurve")
  var comDotsunDotstarDotchart2DotPotentialRegressionCurve: PotentialRegressionCurve
  @JSName("com.sun.star.chart2.PowerScaling")
  var comDotsunDotstarDotchart2DotPowerScaling: PowerScaling
  @JSName("com.sun.star.chart2.PropertyPool")
  var comDotsunDotstarDotchart2DotPropertyPool: PropertyPool
  @JSName("com.sun.star.chart2.RegressionCurve")
  var comDotsunDotstarDotchart2DotRegressionCurve: RegressionCurve
  @JSName("com.sun.star.chart2.RegressionCurveEquation")
  var comDotsunDotstarDotchart2DotRegressionCurveEquation: RegressionCurveEquation
  @JSName("com.sun.star.chart2.RegressionEquation")
  var comDotsunDotstarDotchart2DotRegressionEquation: RegressionEquation
  @JSName("com.sun.star.chart2.Scaling")
  var comDotsunDotstarDotchart2DotScaling: Scaling
  @JSName("com.sun.star.chart2.StandardDiagramCreationParameters")
  var comDotsunDotstarDotchart2DotStandardDiagramCreationParameters: StandardDiagramCreationParameters
  @JSName("com.sun.star.chart2.Title")
  var comDotsunDotstarDotchart2DotTitle: Title
  @JSName("com.sun.star.chart2.data.DataFilter")
  var comDotsunDotstarDotchart2DotdataDotDataFilter: DataFilter
  @JSName("com.sun.star.chart2.data.DataProvider")
  var comDotsunDotstarDotchart2DotdataDotDataProvider: DataProvider
  @JSName("com.sun.star.chart2.data.DataSequence")
  var comDotsunDotstarDotchart2DotdataDotDataSequence: DataSequence
  @JSName("com.sun.star.chart2.data.DataSink")
  var comDotsunDotstarDotchart2DotdataDotDataSink: DataSink
  @JSName("com.sun.star.chart2.data.DataSource")
  var comDotsunDotstarDotchart2DotdataDotDataSource: DataSource
  @JSName("com.sun.star.chart2.data.DatabaseDataProvider")
  var comDotsunDotstarDotchart2DotdataDotDatabaseDataProvider: DatabaseDataProvider
  @JSName("com.sun.star.chart2.data.LabeledDataSequence")
  var comDotsunDotstarDotchart2DotdataDotLabeledDataSequence: LabeledDataSequence
  @JSName("com.sun.star.chart2.data.RangeHighlightListener")
  var comDotsunDotstarDotchart2DotdataDotRangeHighlightListener: RangeHighlightListener
  @JSName("com.sun.star.chart2.data.RangeHighlighter")
  var comDotsunDotstarDotchart2DotdataDotRangeHighlighter: RangeHighlighter
  @JSName("com.sun.star.chart2.data.TabularDataProviderArguments")
  var comDotsunDotstarDotchart2DotdataDotTabularDataProviderArguments: TabularDataProviderArguments
  @JSName("com.sun.star.chart.AccessibleChartDocumentView")
  var comDotsunDotstarDotchartDotAccessibleChartDocumentView: AccessibleChartDocumentView
  @JSName("com.sun.star.chart.AccessibleChartElement")
  var comDotsunDotstarDotchartDotAccessibleChartElement: AccessibleChartElement
  @JSName("com.sun.star.chart.AreaDiagram")
  var comDotsunDotstarDotchartDotAreaDiagram: AreaDiagram
  @JSName("com.sun.star.chart.BarDiagram")
  var comDotsunDotstarDotchartDotBarDiagram: BarDiagram
  @JSName("com.sun.star.chart.BubbleDiagram")
  var comDotsunDotstarDotchartDotBubbleDiagram: BubbleDiagram
  @JSName("com.sun.star.chart.Chart3DBarProperties")
  var comDotsunDotstarDotchartDotChart3DBarProperties: Chart3DBarProperties
  @JSName("com.sun.star.chart.ChartArea")
  var comDotsunDotstarDotchartDotChartArea: ChartArea
  @JSName("com.sun.star.chart.ChartAxis")
  var comDotsunDotstarDotchartDotChartAxis: ChartAxis
  @JSName("com.sun.star.chart.ChartAxisXSupplier")
  var comDotsunDotstarDotchartDotChartAxisXSupplier: ChartAxisXSupplier
  @JSName("com.sun.star.chart.ChartAxisYSupplier")
  var comDotsunDotstarDotchartDotChartAxisYSupplier: ChartAxisYSupplier
  @JSName("com.sun.star.chart.ChartAxisZSupplier")
  var comDotsunDotstarDotchartDotChartAxisZSupplier: ChartAxisZSupplier
  @JSName("com.sun.star.chart.ChartData")
  var comDotsunDotstarDotchartDotChartData: ChartData
  @JSName("com.sun.star.chart.ChartDataArray")
  var comDotsunDotstarDotchartDotChartDataArray: ChartDataArray
  @JSName("com.sun.star.chart.ChartDataPointProperties")
  var comDotsunDotstarDotchartDotChartDataPointProperties: ChartDataPointProperties
  @JSName("com.sun.star.chart.ChartDataRowProperties")
  var comDotsunDotstarDotchartDotChartDataRowProperties: ChartDataRowProperties
  @JSName("com.sun.star.chart.ChartDocument")
  var comDotsunDotstarDotchartDotChartDocument: typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDocument
  @JSName("com.sun.star.chart.ChartGrid")
  var comDotsunDotstarDotchartDotChartGrid: ChartGrid
  @JSName("com.sun.star.chart.ChartLegend")
  var comDotsunDotstarDotchartDotChartLegend: ChartLegend
  @JSName("com.sun.star.chart.ChartLine")
  var comDotsunDotstarDotchartDotChartLine: ChartLine
  @JSName("com.sun.star.chart.ChartPieSegmentProperties")
  var comDotsunDotstarDotchartDotChartPieSegmentProperties: ChartPieSegmentProperties
  @JSName("com.sun.star.chart.ChartStatistics")
  var comDotsunDotstarDotchartDotChartStatistics: ChartStatistics
  @JSName("com.sun.star.chart.ChartTableAddressSupplier")
  var comDotsunDotstarDotchartDotChartTableAddressSupplier: ChartTableAddressSupplier
  @JSName("com.sun.star.chart.ChartTitle")
  var comDotsunDotstarDotchartDotChartTitle: ChartTitle
  @JSName("com.sun.star.chart.ChartTwoAxisXSupplier")
  var comDotsunDotstarDotchartDotChartTwoAxisXSupplier: ChartTwoAxisXSupplier
  @JSName("com.sun.star.chart.ChartTwoAxisYSupplier")
  var comDotsunDotstarDotchartDotChartTwoAxisYSupplier: ChartTwoAxisYSupplier
  @JSName("com.sun.star.chart.Diagram")
  var comDotsunDotstarDotchartDotDiagram: typingsSlinky.activexLibreoffice.com_.sun.star.chart.Diagram
  @JSName("com.sun.star.chart.Dim3DDiagram")
  var comDotsunDotstarDotchartDotDim3DDiagram: Dim3DDiagram
  @JSName("com.sun.star.chart.DonutDiagram")
  var comDotsunDotstarDotchartDotDonutDiagram: DonutDiagram
  @JSName("com.sun.star.chart.FilledNetDiagram")
  var comDotsunDotstarDotchartDotFilledNetDiagram: FilledNetDiagram
  @JSName("com.sun.star.chart.LineDiagram")
  var comDotsunDotstarDotchartDotLineDiagram: LineDiagram
  @JSName("com.sun.star.chart.NetDiagram")
  var comDotsunDotstarDotchartDotNetDiagram: NetDiagram
  @JSName("com.sun.star.chart.PieDiagram")
  var comDotsunDotstarDotchartDotPieDiagram: PieDiagram
  @JSName("com.sun.star.chart.StackableDiagram")
  var comDotsunDotstarDotchartDotStackableDiagram: StackableDiagram
  @JSName("com.sun.star.chart.StockDiagram")
  var comDotsunDotstarDotchartDotStockDiagram: StockDiagram
  @JSName("com.sun.star.chart.XYDiagram")
  var comDotsunDotstarDotchartDotXYDiagram: XYDiagram
  @JSName("com.sun.star.configuration.AccessRootElement")
  var comDotsunDotstarDotconfigurationDotAccessRootElement: AccessRootElement
  @JSName("com.sun.star.configuration.AdministrationProvider")
  var comDotsunDotstarDotconfigurationDotAdministrationProvider: AdministrationProvider
  @JSName("com.sun.star.configuration.ConfigurationAccess")
  var comDotsunDotstarDotconfigurationDotConfigurationAccess: ConfigurationAccess
  @JSName("com.sun.star.configuration.ConfigurationProvider")
  var comDotsunDotstarDotconfigurationDotConfigurationProvider: ConfigurationProvider
  @JSName("com.sun.star.configuration.ConfigurationRegistry")
  var comDotsunDotstarDotconfigurationDotConfigurationRegistry: ConfigurationRegistry
  @JSName("com.sun.star.configuration.ConfigurationUpdateAccess")
  var comDotsunDotstarDotconfigurationDotConfigurationUpdateAccess: ConfigurationUpdateAccess
  @JSName("com.sun.star.configuration.DefaultProvider")
  var comDotsunDotstarDotconfigurationDotDefaultProvider: DefaultProvider
  @JSName("com.sun.star.configuration.GroupAccess")
  var comDotsunDotstarDotconfigurationDotGroupAccess: GroupAccess
  @JSName("com.sun.star.configuration.GroupElement")
  var comDotsunDotstarDotconfigurationDotGroupElement: GroupElement
  @JSName("com.sun.star.configuration.GroupUpdate")
  var comDotsunDotstarDotconfigurationDotGroupUpdate: GroupUpdate
  @JSName("com.sun.star.configuration.HierarchyAccess")
  var comDotsunDotstarDotconfigurationDotHierarchyAccess: HierarchyAccess
  @JSName("com.sun.star.configuration.HierarchyElement")
  var comDotsunDotstarDotconfigurationDotHierarchyElement: HierarchyElement
  @JSName("com.sun.star.configuration.PropertyHierarchy")
  var comDotsunDotstarDotconfigurationDotPropertyHierarchy: PropertyHierarchy
  @JSName("com.sun.star.configuration.ReadOnlyAccess")
  var comDotsunDotstarDotconfigurationDotReadOnlyAccess: ReadOnlyAccess
  @JSName("com.sun.star.configuration.ReadWriteAccess")
  var comDotsunDotstarDotconfigurationDotReadWriteAccess: ReadWriteAccess
  @JSName("com.sun.star.configuration.SetAccess")
  var comDotsunDotstarDotconfigurationDotSetAccess: SetAccess
  @JSName("com.sun.star.configuration.SetElement")
  var comDotsunDotstarDotconfigurationDotSetElement: SetElement
  @JSName("com.sun.star.configuration.SetUpdate")
  var comDotsunDotstarDotconfigurationDotSetUpdate: SetUpdate
  @JSName("com.sun.star.configuration.SimpleSetAccess")
  var comDotsunDotstarDotconfigurationDotSimpleSetAccess: SimpleSetAccess
  @JSName("com.sun.star.configuration.SimpleSetUpdate")
  var comDotsunDotstarDotconfigurationDotSimpleSetUpdate: SimpleSetUpdate
  @JSName("com.sun.star.configuration.UpdateRootElement")
  var comDotsunDotstarDotconfigurationDotUpdateRootElement: UpdateRootElement
  @JSName("com.sun.star.configuration.backend.Backend")
  var comDotsunDotstarDotconfigurationDotbackendDotBackend: Backend
  @JSName("com.sun.star.configuration.backend.BackendAdapter")
  var comDotsunDotstarDotconfigurationDotbackendDotBackendAdapter: BackendAdapter
  @JSName("com.sun.star.configuration.backend.CopyImporter")
  var comDotsunDotstarDotconfigurationDotbackendDotCopyImporter: CopyImporter
  @JSName("com.sun.star.configuration.backend.DataImporter")
  var comDotsunDotstarDotconfigurationDotbackendDotDataImporter: DataImporter
  @JSName("com.sun.star.configuration.backend.DefaultBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotDefaultBackend: DefaultBackend
  @JSName("com.sun.star.configuration.backend.HierarchyBrowser")
  var comDotsunDotstarDotconfigurationDotbackendDotHierarchyBrowser: HierarchyBrowser
  @JSName("com.sun.star.configuration.backend.Importer")
  var comDotsunDotstarDotconfigurationDotbackendDotImporter: Importer
  @JSName("com.sun.star.configuration.backend.InteractionHandler")
  var comDotsunDotstarDotconfigurationDotbackendDotInteractionHandler: InteractionHandler
  @JSName("com.sun.star.configuration.backend.Layer")
  var comDotsunDotstarDotconfigurationDotbackendDotLayer: Layer
  @JSName("com.sun.star.configuration.backend.LayerDescriber")
  var comDotsunDotstarDotconfigurationDotbackendDotLayerDescriber: LayerDescriber
  @JSName("com.sun.star.configuration.backend.LayerFilter")
  var comDotsunDotstarDotconfigurationDotbackendDotLayerFilter: LayerFilter
  @JSName("com.sun.star.configuration.backend.LayerUpdateMerger")
  var comDotsunDotstarDotconfigurationDotbackendDotLayerUpdateMerger: LayerUpdateMerger
  @JSName("com.sun.star.configuration.backend.LdapMultiLayerStratum")
  var comDotsunDotstarDotconfigurationDotbackendDotLdapMultiLayerStratum: LdapMultiLayerStratum
  @JSName("com.sun.star.configuration.backend.LdapSingleBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotLdapSingleBackend: LdapSingleBackend
  @JSName("com.sun.star.configuration.backend.LdapSingleStratum")
  var comDotsunDotstarDotconfigurationDotbackendDotLdapSingleStratum: LdapSingleStratum
  @JSName("com.sun.star.configuration.backend.LocalDataImporter")
  var comDotsunDotstarDotconfigurationDotbackendDotLocalDataImporter: LocalDataImporter
  @JSName("com.sun.star.configuration.backend.LocalHierarchyBrowser")
  var comDotsunDotstarDotconfigurationDotbackendDotLocalHierarchyBrowser: LocalHierarchyBrowser
  @JSName("com.sun.star.configuration.backend.LocalSchemaSupplier")
  var comDotsunDotstarDotconfigurationDotbackendDotLocalSchemaSupplier: LocalSchemaSupplier
  @JSName("com.sun.star.configuration.backend.LocalSingleBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotLocalSingleBackend: LocalSingleBackend
  @JSName("com.sun.star.configuration.backend.LocalSingleStratum")
  var comDotsunDotstarDotconfigurationDotbackendDotLocalSingleStratum: LocalSingleStratum
  @JSName("com.sun.star.configuration.backend.MergeImporter")
  var comDotsunDotstarDotconfigurationDotbackendDotMergeImporter: MergeImporter
  @JSName("com.sun.star.configuration.backend.MultiLayerStratum")
  var comDotsunDotstarDotconfigurationDotbackendDotMultiLayerStratum: MultiLayerStratum
  @JSName("com.sun.star.configuration.backend.MultiStratumBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotMultiStratumBackend: MultiStratumBackend
  @JSName("com.sun.star.configuration.backend.OfflineBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotOfflineBackend: OfflineBackend
  @JSName("com.sun.star.configuration.backend.OnlineBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotOnlineBackend: OnlineBackend
  @JSName("com.sun.star.configuration.backend.PlatformBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotPlatformBackend: PlatformBackend
  @JSName("com.sun.star.configuration.backend.Schema")
  var comDotsunDotstarDotconfigurationDotbackendDotSchema: Schema
  @JSName("com.sun.star.configuration.backend.SchemaSupplier")
  var comDotsunDotstarDotconfigurationDotbackendDotSchemaSupplier: SchemaSupplier
  @JSName("com.sun.star.configuration.backend.SingleBackend")
  var comDotsunDotstarDotconfigurationDotbackendDotSingleBackend: SingleBackend
  @JSName("com.sun.star.configuration.backend.SingleBackendAdapter")
  var comDotsunDotstarDotconfigurationDotbackendDotSingleBackendAdapter: SingleBackendAdapter
  @JSName("com.sun.star.configuration.backend.SingleLayerStratum")
  var comDotsunDotstarDotconfigurationDotbackendDotSingleLayerStratum: SingleLayerStratum
  @JSName("com.sun.star.configuration.backend.SystemIntegration")
  var comDotsunDotstarDotconfigurationDotbackendDotSystemIntegration: SystemIntegration
  @JSName("com.sun.star.configuration.backend.UpdatableLayer")
  var comDotsunDotstarDotconfigurationDotbackendDotUpdatableLayer: UpdatableLayer
  @JSName("com.sun.star.configuration.backend.xml.LayerParser")
  var comDotsunDotstarDotconfigurationDotbackendDotxmlDotLayerParser: LayerParser
  @JSName("com.sun.star.configuration.backend.xml.LayerWriter")
  var comDotsunDotstarDotconfigurationDotbackendDotxmlDotLayerWriter: LayerWriter
  @JSName("com.sun.star.configuration.backend.xml.SchemaParser")
  var comDotsunDotstarDotconfigurationDotbackendDotxmlDotSchemaParser: SchemaParser
  @JSName("com.sun.star.configuration.bootstrap.BootstrapContext")
  var comDotsunDotstarDotconfigurationDotbootstrapDotBootstrapContext: BootstrapContext
  @JSName("com.sun.star.connection.Acceptor")
  var comDotsunDotstarDotconnectionDotAcceptor: Acceptor
  @JSName("com.sun.star.connection.Connector")
  var comDotsunDotstarDotconnectionDotConnector: Connector
  @JSName("com.sun.star.container.EnumerableMap")
  var comDotsunDotstarDotcontainerDotEnumerableMap: EnumerableMap
  @JSName("com.sun.star.cui.ColorPicker")
  var comDotsunDotstarDotcuiDotColorPicker: ColorPicker
  @JSName("com.sun.star.datatransfer.DataFormatTranslator")
  var comDotsunDotstarDotdatatransferDotDataFormatTranslator: DataFormatTranslator
  @JSName("com.sun.star.datatransfer.MimeContentTypeFactory")
  var comDotsunDotstarDotdatatransferDotMimeContentTypeFactory: MimeContentTypeFactory
  @JSName("com.sun.star.datatransfer.clipboard.ClipboardManager")
  var comDotsunDotstarDotdatatransferDotclipboardDotClipboardManager: ClipboardManager
  @JSName("com.sun.star.datatransfer.clipboard.GenericClipboard")
  var comDotsunDotstarDotdatatransferDotclipboardDotGenericClipboard: GenericClipboard
  @JSName("com.sun.star.datatransfer.clipboard.SystemClipboard")
  var comDotsunDotstarDotdatatransferDotclipboardDotSystemClipboard: SystemClipboard
  @JSName("com.sun.star.datatransfer.dnd.OleDragSource")
  var comDotsunDotstarDotdatatransferDotdndDotOleDragSource: OleDragSource
  @JSName("com.sun.star.datatransfer.dnd.OleDropTarget")
  var comDotsunDotstarDotdatatransferDotdndDotOleDropTarget: OleDropTarget
  @JSName("com.sun.star.datatransfer.dnd.X11DragSource")
  var comDotsunDotstarDotdatatransferDotdndDotX11DragSource: X11DragSource
  @JSName("com.sun.star.datatransfer.dnd.X11DropTarget")
  var comDotsunDotstarDotdatatransferDotdndDotX11DropTarget: X11DropTarget
  @JSName("com.sun.star.deployment.PackageRegistryBackend")
  var comDotsunDotstarDotdeploymentDotPackageRegistryBackend: PackageRegistryBackend
  @JSName("com.sun.star.deployment.UpdateInformationProvider")
  var comDotsunDotstarDotdeploymentDotUpdateInformationProvider: UpdateInformationProvider
  @JSName("com.sun.star.deployment.test.SmoketestCommandEnvironment")
  var comDotsunDotstarDotdeploymentDottestDotSmoketestCommandEnvironment: SmoketestCommandEnvironment
  @JSName("com.sun.star.deployment.ui.LicenseDialog")
  var comDotsunDotstarDotdeploymentDotuiDotLicenseDialog: LicenseDialog
  @JSName("com.sun.star.deployment.ui.PackageManagerDialog")
  var comDotsunDotstarDotdeploymentDotuiDotPackageManagerDialog: PackageManagerDialog
  @JSName("com.sun.star.deployment.ui.UpdateRequiredDialog")
  var comDotsunDotstarDotdeploymentDotuiDotUpdateRequiredDialog: UpdateRequiredDialog
  @JSName("com.sun.star.document.DocumentProperties")
  var comDotsunDotstarDotdocumentDotDocumentProperties: DocumentProperties
  @JSName("com.sun.star.document.DocumentRevisionListPersistence")
  var comDotsunDotstarDotdocumentDotDocumentRevisionListPersistence: DocumentRevisionListPersistence
  @JSName("com.sun.star.document.EventDescriptor")
  var comDotsunDotstarDotdocumentDotEventDescriptor: EventDescriptor
  @JSName("com.sun.star.document.Events")
  var comDotsunDotstarDotdocumentDotEvents: Events
  @JSName("com.sun.star.document.ExportFilter")
  var comDotsunDotstarDotdocumentDotExportFilter: ExportFilter
  @JSName("com.sun.star.document.ExtendedTypeDetection")
  var comDotsunDotstarDotdocumentDotExtendedTypeDetection: ExtendedTypeDetection
  @JSName("com.sun.star.document.ExtendedTypeDetectionFactory")
  var comDotsunDotstarDotdocumentDotExtendedTypeDetectionFactory: ExtendedTypeDetectionFactory
  @JSName("com.sun.star.document.FilterAdapter")
  var comDotsunDotstarDotdocumentDotFilterAdapter: FilterAdapter
  @JSName("com.sun.star.document.FilterConfigRefresh")
  var comDotsunDotstarDotdocumentDotFilterConfigRefresh: FilterConfigRefresh
  @JSName("com.sun.star.document.FilterFactory")
  var comDotsunDotstarDotdocumentDotFilterFactory: FilterFactory
  @JSName("com.sun.star.document.GraphicObjectResolver")
  var comDotsunDotstarDotdocumentDotGraphicObjectResolver: GraphicObjectResolver
  @JSName("com.sun.star.document.HeaderFooterSettings")
  var comDotsunDotstarDotdocumentDotHeaderFooterSettings: HeaderFooterSettings
  @JSName("com.sun.star.document.ImportFilter")
  var comDotsunDotstarDotdocumentDotImportFilter: ImportFilter
  @JSName("com.sun.star.document.IndexedPropertyValues")
  var comDotsunDotstarDotdocumentDotIndexedPropertyValues: IndexedPropertyValues
  @JSName("com.sun.star.document.LinkTarget")
  var comDotsunDotstarDotdocumentDotLinkTarget: LinkTarget
  @JSName("com.sun.star.document.LinkTargets")
  var comDotsunDotstarDotdocumentDotLinkTargets: LinkTargets
  @JSName("com.sun.star.document.MediaDescriptor")
  var comDotsunDotstarDotdocumentDotMediaDescriptor: MediaDescriptor
  @JSName("com.sun.star.document.NamedPropertyValues")
  var comDotsunDotstarDotdocumentDotNamedPropertyValues: NamedPropertyValues
  @JSName("com.sun.star.document.OOXMLDocumentPropertiesImporter")
  var comDotsunDotstarDotdocumentDotOOXMLDocumentPropertiesImporter: OOXMLDocumentPropertiesImporter
  @JSName("com.sun.star.document.OfficeDocument")
  var comDotsunDotstarDotdocumentDotOfficeDocument: OfficeDocument
  @JSName("com.sun.star.document.OleEmbeddedServerRegistration")
  var comDotsunDotstarDotdocumentDotOleEmbeddedServerRegistration: OleEmbeddedServerRegistration
  @JSName("com.sun.star.document.PDFDialog")
  var comDotsunDotstarDotdocumentDotPDFDialog: PDFDialog
  @JSName("com.sun.star.document.Settings")
  var comDotsunDotstarDotdocumentDotSettings: Settings
  @JSName("com.sun.star.document.TypeDetection")
  var comDotsunDotstarDotdocumentDotTypeDetection: TypeDetection
  @JSName("com.sun.star.document.XMLBasicExporter")
  var comDotsunDotstarDotdocumentDotXMLBasicExporter: XMLBasicExporter
  @JSName("com.sun.star.document.XMLBasicImporter")
  var comDotsunDotstarDotdocumentDotXMLBasicImporter: XMLBasicImporter
  @JSName("com.sun.star.document.XMLOasisBasicExporter")
  var comDotsunDotstarDotdocumentDotXMLOasisBasicExporter: XMLOasisBasicExporter
  @JSName("com.sun.star.document.XMLOasisBasicImporter")
  var comDotsunDotstarDotdocumentDotXMLOasisBasicImporter: XMLOasisBasicImporter
  @JSName("com.sun.star.drawing.AccessibleDrawDocumentView")
  var comDotsunDotstarDotdrawingDotAccessibleDrawDocumentView: AccessibleDrawDocumentView
  @JSName("com.sun.star.drawing.AccessibleGraphControl")
  var comDotsunDotstarDotdrawingDotAccessibleGraphControl: AccessibleGraphControl
  @JSName("com.sun.star.drawing.AccessibleGraphicShape")
  var comDotsunDotstarDotdrawingDotAccessibleGraphicShape: AccessibleGraphicShape
  @JSName("com.sun.star.drawing.AccessibleImageBullet")
  var comDotsunDotstarDotdrawingDotAccessibleImageBullet: AccessibleImageBullet
  @JSName("com.sun.star.drawing.AccessibleOLEShape")
  var comDotsunDotstarDotdrawingDotAccessibleOLEShape: AccessibleOLEShape
  @JSName("com.sun.star.drawing.AccessibleShape")
  var comDotsunDotstarDotdrawingDotAccessibleShape: AccessibleShape
  @JSName("com.sun.star.drawing.AccessibleSlideView")
  var comDotsunDotstarDotdrawingDotAccessibleSlideView: AccessibleSlideView
  @JSName("com.sun.star.drawing.AccessibleSlideViewObject")
  var comDotsunDotstarDotdrawingDotAccessibleSlideViewObject: AccessibleSlideViewObject
  @JSName("com.sun.star.drawing.AppletShape")
  var comDotsunDotstarDotdrawingDotAppletShape: AppletShape
  @JSName("com.sun.star.drawing.Background")
  var comDotsunDotstarDotdrawingDotBackground: Background
  @JSName("com.sun.star.drawing.BitmapTable")
  var comDotsunDotstarDotdrawingDotBitmapTable: BitmapTable
  @JSName("com.sun.star.drawing.CaptionShape")
  var comDotsunDotstarDotdrawingDotCaptionShape: CaptionShape
  @JSName("com.sun.star.drawing.ClosedBezierShape")
  var comDotsunDotstarDotdrawingDotClosedBezierShape: ClosedBezierShape
  @JSName("com.sun.star.drawing.ColorTable")
  var comDotsunDotstarDotdrawingDotColorTable: ColorTable
  @JSName("com.sun.star.drawing.ConnectorProperties")
  var comDotsunDotstarDotdrawingDotConnectorProperties: ConnectorProperties
  @JSName("com.sun.star.drawing.ConnectorShape")
  var comDotsunDotstarDotdrawingDotConnectorShape: ConnectorShape
  @JSName("com.sun.star.drawing.ControlShape")
  var comDotsunDotstarDotdrawingDotControlShape: ControlShape
  @JSName("com.sun.star.drawing.CustomShape")
  var comDotsunDotstarDotdrawingDotCustomShape: CustomShape
  @JSName("com.sun.star.drawing.CustomShapeEngine")
  var comDotsunDotstarDotdrawingDotCustomShapeEngine: CustomShapeEngine
  @JSName("com.sun.star.drawing.DashTable")
  var comDotsunDotstarDotdrawingDotDashTable: DashTable
  @JSName("com.sun.star.drawing.Defaults")
  var comDotsunDotstarDotdrawingDotDefaults: Defaults
  @JSName("com.sun.star.drawing.DocumentSettings")
  var comDotsunDotstarDotdrawingDotDocumentSettings: DocumentSettings
  @JSName("com.sun.star.drawing.DrawPage")
  var comDotsunDotstarDotdrawingDotDrawPage: DrawPage
  @JSName("com.sun.star.drawing.DrawPages")
  var comDotsunDotstarDotdrawingDotDrawPages: DrawPages
  @JSName("com.sun.star.drawing.DrawingDocument")
  var comDotsunDotstarDotdrawingDotDrawingDocument: DrawingDocument
  @JSName("com.sun.star.drawing.DrawingDocumentDrawView")
  var comDotsunDotstarDotdrawingDotDrawingDocumentDrawView: DrawingDocumentDrawView
  @JSName("com.sun.star.drawing.DrawingDocumentFactory")
  var comDotsunDotstarDotdrawingDotDrawingDocumentFactory: DrawingDocumentFactory
  @JSName("com.sun.star.drawing.EllipseShape")
  var comDotsunDotstarDotdrawingDotEllipseShape: EllipseShape
  @JSName("com.sun.star.drawing.EnhancedCustomShapeExtrusion")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeExtrusion: EnhancedCustomShapeExtrusion
  @JSName("com.sun.star.drawing.EnhancedCustomShapeGeometry")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeGeometry: EnhancedCustomShapeGeometry
  @JSName("com.sun.star.drawing.EnhancedCustomShapeHandle")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeHandle: EnhancedCustomShapeHandle
  @JSName("com.sun.star.drawing.EnhancedCustomShapePath")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapePath: EnhancedCustomShapePath
  @JSName("com.sun.star.drawing.EnhancedCustomShapeTextPath")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextPath: EnhancedCustomShapeTextPath
  @JSName("com.sun.star.drawing.FillProperties")
  var comDotsunDotstarDotdrawingDotFillProperties: FillProperties
  @JSName("com.sun.star.drawing.GenericDrawPage")
  var comDotsunDotstarDotdrawingDotGenericDrawPage: GenericDrawPage
  @JSName("com.sun.star.drawing.GenericDrawingDocument")
  var comDotsunDotstarDotdrawingDotGenericDrawingDocument: GenericDrawingDocument
  @JSName("com.sun.star.drawing.GradientTable")
  var comDotsunDotstarDotdrawingDotGradientTable: GradientTable
  @JSName("com.sun.star.drawing.GraphicExportFilter")
  var comDotsunDotstarDotdrawingDotGraphicExportFilter: GraphicExportFilter
  @JSName("com.sun.star.drawing.GraphicObjectShape")
  var comDotsunDotstarDotdrawingDotGraphicObjectShape: GraphicObjectShape
  @JSName("com.sun.star.drawing.GroupShape")
  var comDotsunDotstarDotdrawingDotGroupShape: GroupShape
  @JSName("com.sun.star.drawing.HatchTable")
  var comDotsunDotstarDotdrawingDotHatchTable: HatchTable
  @JSName("com.sun.star.drawing.Layer")
  var comDotsunDotstarDotdrawingDotLayer: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Layer
  @JSName("com.sun.star.drawing.LayerManager")
  var comDotsunDotstarDotdrawingDotLayerManager: LayerManager
  @JSName("com.sun.star.drawing.LineProperties")
  var comDotsunDotstarDotdrawingDotLineProperties: LineProperties
  @JSName("com.sun.star.drawing.LineShape")
  var comDotsunDotstarDotdrawingDotLineShape: LineShape
  @JSName("com.sun.star.drawing.MarkerTable")
  var comDotsunDotstarDotdrawingDotMarkerTable: MarkerTable
  @JSName("com.sun.star.drawing.MasterPage")
  var comDotsunDotstarDotdrawingDotMasterPage: MasterPage
  @JSName("com.sun.star.drawing.MasterPages")
  var comDotsunDotstarDotdrawingDotMasterPages: MasterPages
  @JSName("com.sun.star.drawing.MeasureProperties")
  var comDotsunDotstarDotdrawingDotMeasureProperties: MeasureProperties
  @JSName("com.sun.star.drawing.MeasureShape")
  var comDotsunDotstarDotdrawingDotMeasureShape: MeasureShape
  @JSName("com.sun.star.drawing.ModuleDispatcher")
  var comDotsunDotstarDotdrawingDotModuleDispatcher: ModuleDispatcher
  @JSName("com.sun.star.drawing.OLE2Shape")
  var comDotsunDotstarDotdrawingDotOLE2Shape: OLE2Shape
  @JSName("com.sun.star.drawing.OpenBezierShape")
  var comDotsunDotstarDotdrawingDotOpenBezierShape: OpenBezierShape
  @JSName("com.sun.star.drawing.PageShape")
  var comDotsunDotstarDotdrawingDotPageShape: PageShape
  @JSName("com.sun.star.drawing.PluginShape")
  var comDotsunDotstarDotdrawingDotPluginShape: PluginShape
  @JSName("com.sun.star.drawing.PolyLineShape")
  var comDotsunDotstarDotdrawingDotPolyLineShape: PolyLineShape
  @JSName("com.sun.star.drawing.PolyPolygonBezierDescriptor")
  var comDotsunDotstarDotdrawingDotPolyPolygonBezierDescriptor: PolyPolygonBezierDescriptor
  @JSName("com.sun.star.drawing.PolyPolygonBezierShape")
  var comDotsunDotstarDotdrawingDotPolyPolygonBezierShape: PolyPolygonBezierShape
  @JSName("com.sun.star.drawing.PolyPolygonDescriptor")
  var comDotsunDotstarDotdrawingDotPolyPolygonDescriptor: PolyPolygonDescriptor
  @JSName("com.sun.star.drawing.PolyPolygonShape")
  var comDotsunDotstarDotdrawingDotPolyPolygonShape: PolyPolygonShape
  @JSName("com.sun.star.drawing.RectangleShape")
  var comDotsunDotstarDotdrawingDotRectangleShape: RectangleShape
  @JSName("com.sun.star.drawing.RotationDescriptor")
  var comDotsunDotstarDotdrawingDotRotationDescriptor: RotationDescriptor
  @JSName("com.sun.star.drawing.ShadowProperties")
  var comDotsunDotstarDotdrawingDotShadowProperties: ShadowProperties
  @JSName("com.sun.star.drawing.Shape")
  var comDotsunDotstarDotdrawingDotShape: Shape
  @JSName("com.sun.star.drawing.ShapeCollection")
  var comDotsunDotstarDotdrawingDotShapeCollection: ShapeCollection
  @JSName("com.sun.star.drawing.Shapes")
  var comDotsunDotstarDotdrawingDotShapes: Shapes
  @JSName("com.sun.star.drawing.SlideRenderer")
  var comDotsunDotstarDotdrawingDotSlideRenderer: SlideRenderer
  @JSName("com.sun.star.drawing.SlideSorter")
  var comDotsunDotstarDotdrawingDotSlideSorter: SlideSorter
  @JSName("com.sun.star.drawing.Text")
  var comDotsunDotstarDotdrawingDotText: Text
  @JSName("com.sun.star.drawing.TextProperties")
  var comDotsunDotstarDotdrawingDotTextProperties: TextProperties
  @JSName("com.sun.star.drawing.TextShape")
  var comDotsunDotstarDotdrawingDotTextShape: TextShape
  @JSName("com.sun.star.drawing.TransparencyGradientTable")
  var comDotsunDotstarDotdrawingDotTransparencyGradientTable: TransparencyGradientTable
  @JSName("com.sun.star.drawing.framework.BasicPaneFactory")
  var comDotsunDotstarDotdrawingDotframeworkDotBasicPaneFactory: BasicPaneFactory
  @JSName("com.sun.star.drawing.framework.BasicToolBarFactory")
  var comDotsunDotstarDotdrawingDotframeworkDotBasicToolBarFactory: BasicToolBarFactory
  @JSName("com.sun.star.drawing.framework.BasicViewFactory")
  var comDotsunDotstarDotdrawingDotframeworkDotBasicViewFactory: BasicViewFactory
  @JSName("com.sun.star.drawing.framework.Configuration")
  var comDotsunDotstarDotdrawingDotframeworkDotConfiguration: Configuration
  @JSName("com.sun.star.drawing.framework.ConfigurationController")
  var comDotsunDotstarDotdrawingDotframeworkDotConfigurationController: ConfigurationController
  @JSName("com.sun.star.drawing.framework.ModuleController")
  var comDotsunDotstarDotdrawingDotframeworkDotModuleController: ModuleController
  @JSName("com.sun.star.drawing.framework.ResourceId")
  var comDotsunDotstarDotdrawingDotframeworkDotResourceId: ResourceId
  @JSName("com.sun.star.embed.BaseStorage")
  var comDotsunDotstarDotembedDotBaseStorage: BaseStorage
  @JSName("com.sun.star.embed.DocumentCloser")
  var comDotsunDotstarDotembedDotDocumentCloser: DocumentCloser
  @JSName("com.sun.star.embed.EmbeddedObjectCreator")
  var comDotsunDotstarDotembedDotEmbeddedObjectCreator: EmbeddedObjectCreator
  @JSName("com.sun.star.embed.EmbeddedObjectDescriptor")
  var comDotsunDotstarDotembedDotEmbeddedObjectDescriptor: EmbeddedObjectDescriptor
  @JSName("com.sun.star.embed.FileSystemStorage")
  var comDotsunDotstarDotembedDotFileSystemStorage: FileSystemStorage
  @JSName("com.sun.star.embed.FileSystemStorageFactory")
  var comDotsunDotstarDotembedDotFileSystemStorageFactory: FileSystemStorageFactory
  @JSName("com.sun.star.embed.HatchWindowFactory")
  var comDotsunDotstarDotembedDotHatchWindowFactory: HatchWindowFactory
  @JSName("com.sun.star.embed.InstanceLocker")
  var comDotsunDotstarDotembedDotInstanceLocker: InstanceLocker
  @JSName("com.sun.star.embed.MSOLEObjectSystemCreator")
  var comDotsunDotstarDotembedDotMSOLEObjectSystemCreator: MSOLEObjectSystemCreator
  @JSName("com.sun.star.embed.OLEEmbeddedObjectFactory")
  var comDotsunDotstarDotembedDotOLEEmbeddedObjectFactory: OLEEmbeddedObjectFactory
  @JSName("com.sun.star.embed.OLESimpleStorage")
  var comDotsunDotstarDotembedDotOLESimpleStorage: OLESimpleStorage
  @JSName("com.sun.star.embed.OOoEmbeddedObjectFactory")
  var comDotsunDotstarDotembedDotOOoEmbeddedObjectFactory: OOoEmbeddedObjectFactory
  @JSName("com.sun.star.embed.Storage")
  var comDotsunDotstarDotembedDotStorage: Storage
  @JSName("com.sun.star.embed.StorageFactory")
  var comDotsunDotstarDotembedDotStorageFactory: StorageFactory
  @JSName("com.sun.star.embed.StorageStream")
  var comDotsunDotstarDotembedDotStorageStream: StorageStream
  @JSName("com.sun.star.form.ControlFontDialog")
  var comDotsunDotstarDotformDotControlFontDialog: ControlFontDialog
  @JSName("com.sun.star.form.DataAwareControlModel")
  var comDotsunDotstarDotformDotDataAwareControlModel: DataAwareControlModel
  @JSName("com.sun.star.form.FormComponent")
  var comDotsunDotstarDotformDotFormComponent: FormComponent
  @JSName("com.sun.star.form.FormComponents")
  var comDotsunDotstarDotformDotFormComponents: FormComponents
  @JSName("com.sun.star.form.FormControlModel")
  var comDotsunDotstarDotformDotFormControlModel: FormControlModel
  @JSName("com.sun.star.form.FormController")
  var comDotsunDotstarDotformDotFormController: FormController
  @JSName("com.sun.star.form.FormControllerDispatcher")
  var comDotsunDotstarDotformDotFormControllerDispatcher: FormControllerDispatcher
  @JSName("com.sun.star.form.Forms")
  var comDotsunDotstarDotformDotForms: Forms
  @JSName("com.sun.star.form.PropertyBrowserController")
  var comDotsunDotstarDotformDotPropertyBrowserController: PropertyBrowserController
  @JSName("com.sun.star.form.TabOrderDialog")
  var comDotsunDotstarDotformDotTabOrderDialog: TabOrderDialog
  @JSName("com.sun.star.form.binding.BindableControlModel")
  var comDotsunDotstarDotformDotbindingDotBindableControlModel: BindableControlModel
  @JSName("com.sun.star.form.binding.BindableDataAwareControlModel")
  var comDotsunDotstarDotformDotbindingDotBindableDataAwareControlModel: BindableDataAwareControlModel
  @JSName("com.sun.star.form.binding.BindableDatabaseCheckBox")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseCheckBox: BindableDatabaseCheckBox
  @JSName("com.sun.star.form.binding.BindableDatabaseComboBox")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseComboBox: BindableDatabaseComboBox
  @JSName("com.sun.star.form.binding.BindableDatabaseDateField")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseDateField: BindableDatabaseDateField
  @JSName("com.sun.star.form.binding.BindableDatabaseFormattedField")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseFormattedField: BindableDatabaseFormattedField
  @JSName("com.sun.star.form.binding.BindableDatabaseListBox")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseListBox: BindableDatabaseListBox
  @JSName("com.sun.star.form.binding.BindableDatabaseNumericField")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseNumericField: BindableDatabaseNumericField
  @JSName("com.sun.star.form.binding.BindableDatabaseRadioButton")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseRadioButton: BindableDatabaseRadioButton
  @JSName("com.sun.star.form.binding.BindableDatabaseTextField")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseTextField: BindableDatabaseTextField
  @JSName("com.sun.star.form.binding.BindableDatabaseTimeField")
  var comDotsunDotstarDotformDotbindingDotBindableDatabaseTimeField: BindableDatabaseTimeField
  @JSName("com.sun.star.form.binding.BindableIntegerValueRange")
  var comDotsunDotstarDotformDotbindingDotBindableIntegerValueRange: BindableIntegerValueRange
  @JSName("com.sun.star.form.binding.ListEntrySource")
  var comDotsunDotstarDotformDotbindingDotListEntrySource: ListEntrySource
  @JSName("com.sun.star.form.binding.ValueBinding")
  var comDotsunDotstarDotformDotbindingDotValueBinding: ValueBinding
  @JSName("com.sun.star.form.component.CheckBox")
  var comDotsunDotstarDotformDotcomponentDotCheckBox: CheckBox
  @JSName("com.sun.star.form.component.ComboBox")
  var comDotsunDotstarDotformDotcomponentDotComboBox: ComboBox
  @JSName("com.sun.star.form.component.CommandButton")
  var comDotsunDotstarDotformDotcomponentDotCommandButton: CommandButton
  @JSName("com.sun.star.form.component.CurrencyField")
  var comDotsunDotstarDotformDotcomponentDotCurrencyField: CurrencyField
  @JSName("com.sun.star.form.component.DataForm")
  var comDotsunDotstarDotformDotcomponentDotDataForm: DataForm
  @JSName("com.sun.star.form.component.DatabaseCheckBox")
  var comDotsunDotstarDotformDotcomponentDotDatabaseCheckBox: DatabaseCheckBox
  @JSName("com.sun.star.form.component.DatabaseComboBox")
  var comDotsunDotstarDotformDotcomponentDotDatabaseComboBox: DatabaseComboBox
  @JSName("com.sun.star.form.component.DatabaseCurrencyField")
  var comDotsunDotstarDotformDotcomponentDotDatabaseCurrencyField: DatabaseCurrencyField
  @JSName("com.sun.star.form.component.DatabaseDateField")
  var comDotsunDotstarDotformDotcomponentDotDatabaseDateField: DatabaseDateField
  @JSName("com.sun.star.form.component.DatabaseFormattedField")
  var comDotsunDotstarDotformDotcomponentDotDatabaseFormattedField: DatabaseFormattedField
  @JSName("com.sun.star.form.component.DatabaseImageControl")
  var comDotsunDotstarDotformDotcomponentDotDatabaseImageControl: DatabaseImageControl
  @JSName("com.sun.star.form.component.DatabaseListBox")
  var comDotsunDotstarDotformDotcomponentDotDatabaseListBox: DatabaseListBox
  @JSName("com.sun.star.form.component.DatabaseNumericField")
  var comDotsunDotstarDotformDotcomponentDotDatabaseNumericField: DatabaseNumericField
  @JSName("com.sun.star.form.component.DatabasePatternField")
  var comDotsunDotstarDotformDotcomponentDotDatabasePatternField: DatabasePatternField
  @JSName("com.sun.star.form.component.DatabaseRadioButton")
  var comDotsunDotstarDotformDotcomponentDotDatabaseRadioButton: DatabaseRadioButton
  @JSName("com.sun.star.form.component.DatabaseTextField")
  var comDotsunDotstarDotformDotcomponentDotDatabaseTextField: DatabaseTextField
  @JSName("com.sun.star.form.component.DatabaseTimeField")
  var comDotsunDotstarDotformDotcomponentDotDatabaseTimeField: DatabaseTimeField
  @JSName("com.sun.star.form.component.DateField")
  var comDotsunDotstarDotformDotcomponentDotDateField: DateField
  @JSName("com.sun.star.form.component.FileControl")
  var comDotsunDotstarDotformDotcomponentDotFileControl: FileControl
  @JSName("com.sun.star.form.component.FixedText")
  var comDotsunDotstarDotformDotcomponentDotFixedText: FixedText
  @JSName("com.sun.star.form.component.Form")
  var comDotsunDotstarDotformDotcomponentDotForm: Form
  @JSName("com.sun.star.form.component.FormattedField")
  var comDotsunDotstarDotformDotcomponentDotFormattedField: FormattedField
  @JSName("com.sun.star.form.component.GridControl")
  var comDotsunDotstarDotformDotcomponentDotGridControl: GridControl
  @JSName("com.sun.star.form.component.GroupBox")
  var comDotsunDotstarDotformDotcomponentDotGroupBox: GroupBox
  @JSName("com.sun.star.form.component.HTMLForm")
  var comDotsunDotstarDotformDotcomponentDotHTMLForm: HTMLForm
  @JSName("com.sun.star.form.component.HiddenControl")
  var comDotsunDotstarDotformDotcomponentDotHiddenControl: HiddenControl
  @JSName("com.sun.star.form.component.ImageButton")
  var comDotsunDotstarDotformDotcomponentDotImageButton: ImageButton
  @JSName("com.sun.star.form.component.ListBox")
  var comDotsunDotstarDotformDotcomponentDotListBox: ListBox
  @JSName("com.sun.star.form.component.NavigationToolBar")
  var comDotsunDotstarDotformDotcomponentDotNavigationToolBar: NavigationToolBar
  @JSName("com.sun.star.form.component.NumericField")
  var comDotsunDotstarDotformDotcomponentDotNumericField: NumericField
  @JSName("com.sun.star.form.component.PatternField")
  var comDotsunDotstarDotformDotcomponentDotPatternField: PatternField
  @JSName("com.sun.star.form.component.RadioButton")
  var comDotsunDotstarDotformDotcomponentDotRadioButton: RadioButton
  @JSName("com.sun.star.form.component.RichTextControl")
  var comDotsunDotstarDotformDotcomponentDotRichTextControl: RichTextControl
  @JSName("com.sun.star.form.component.ScrollBar")
  var comDotsunDotstarDotformDotcomponentDotScrollBar: ScrollBar
  @JSName("com.sun.star.form.component.SpinButton")
  var comDotsunDotstarDotformDotcomponentDotSpinButton: SpinButton
  @JSName("com.sun.star.form.component.SubmitButton")
  var comDotsunDotstarDotformDotcomponentDotSubmitButton: SubmitButton
  @JSName("com.sun.star.form.component.TextField")
  var comDotsunDotstarDotformDotcomponentDotTextField: TextField
  @JSName("com.sun.star.form.component.TimeField")
  var comDotsunDotstarDotformDotcomponentDotTimeField: TimeField
  @JSName("com.sun.star.form.control.CheckBox")
  var comDotsunDotstarDotformDotcontrolDotCheckBox: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.CheckBox
  @JSName("com.sun.star.form.control.ComboBox")
  var comDotsunDotstarDotformDotcontrolDotComboBox: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.ComboBox
  @JSName("com.sun.star.form.control.CommandButton")
  var comDotsunDotstarDotformDotcontrolDotCommandButton: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.CommandButton
  @JSName("com.sun.star.form.control.CurrencyField")
  var comDotsunDotstarDotformDotcontrolDotCurrencyField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.CurrencyField
  @JSName("com.sun.star.form.control.DateField")
  var comDotsunDotstarDotformDotcontrolDotDateField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.DateField
  @JSName("com.sun.star.form.control.FilterControl")
  var comDotsunDotstarDotformDotcontrolDotFilterControl: FilterControl
  @JSName("com.sun.star.form.control.FormattedField")
  var comDotsunDotstarDotformDotcontrolDotFormattedField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.FormattedField
  @JSName("com.sun.star.form.control.GridControl")
  var comDotsunDotstarDotformDotcontrolDotGridControl: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.GridControl
  @JSName("com.sun.star.form.control.GroupBox")
  var comDotsunDotstarDotformDotcontrolDotGroupBox: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.GroupBox
  @JSName("com.sun.star.form.control.ImageButton")
  var comDotsunDotstarDotformDotcontrolDotImageButton: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.ImageButton
  @JSName("com.sun.star.form.control.ImageControl")
  var comDotsunDotstarDotformDotcontrolDotImageControl: ImageControl
  @JSName("com.sun.star.form.control.InteractionGridControl")
  var comDotsunDotstarDotformDotcontrolDotInteractionGridControl: InteractionGridControl
  @JSName("com.sun.star.form.control.ListBox")
  var comDotsunDotstarDotformDotcontrolDotListBox: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.ListBox
  @JSName("com.sun.star.form.control.NavigationToolBar")
  var comDotsunDotstarDotformDotcontrolDotNavigationToolBar: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.NavigationToolBar
  @JSName("com.sun.star.form.control.NumericField")
  var comDotsunDotstarDotformDotcontrolDotNumericField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.NumericField
  @JSName("com.sun.star.form.control.PatternField")
  var comDotsunDotstarDotformDotcontrolDotPatternField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.PatternField
  @JSName("com.sun.star.form.control.RadioButton")
  var comDotsunDotstarDotformDotcontrolDotRadioButton: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.RadioButton
  @JSName("com.sun.star.form.control.SubmitButton")
  var comDotsunDotstarDotformDotcontrolDotSubmitButton: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.SubmitButton
  @JSName("com.sun.star.form.control.TextField")
  var comDotsunDotstarDotformDotcontrolDotTextField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.TextField
  @JSName("com.sun.star.form.control.TimeField")
  var comDotsunDotstarDotformDotcontrolDotTimeField: typingsSlinky.activexLibreoffice.com_.sun.star.form.control.TimeField
  @JSName("com.sun.star.form.inspection.ButtonNavigationHandler")
  var comDotsunDotstarDotformDotinspectionDotButtonNavigationHandler: ButtonNavigationHandler
  @JSName("com.sun.star.form.inspection.CellBindingPropertyHandler")
  var comDotsunDotstarDotformDotinspectionDotCellBindingPropertyHandler: CellBindingPropertyHandler
  @JSName("com.sun.star.form.inspection.DefaultFormComponentInspectorModel")
  var comDotsunDotstarDotformDotinspectionDotDefaultFormComponentInspectorModel: DefaultFormComponentInspectorModel
  @JSName("com.sun.star.form.inspection.EditPropertyHandler")
  var comDotsunDotstarDotformDotinspectionDotEditPropertyHandler: EditPropertyHandler
  @JSName("com.sun.star.form.inspection.EventHandler")
  var comDotsunDotstarDotformDotinspectionDotEventHandler: EventHandler
  @JSName("com.sun.star.form.inspection.FormComponentPropertyHandler")
  var comDotsunDotstarDotformDotinspectionDotFormComponentPropertyHandler: FormComponentPropertyHandler
  @JSName("com.sun.star.form.inspection.SubmissionPropertyHandler")
  var comDotsunDotstarDotformDotinspectionDotSubmissionPropertyHandler: SubmissionPropertyHandler
  @JSName("com.sun.star.form.inspection.XMLFormsPropertyHandler")
  var comDotsunDotstarDotformDotinspectionDotXMLFormsPropertyHandler: XMLFormsPropertyHandler
  @JSName("com.sun.star.form.inspection.XSDValidationPropertyHandler")
  var comDotsunDotstarDotformDotinspectionDotXSDValidationPropertyHandler: XSDValidationPropertyHandler
  @JSName("com.sun.star.form.runtime.FormController")
  var comDotsunDotstarDotformDotruntimeDotFormController: typingsSlinky.activexLibreoffice.com_.sun.star.form.runtime.FormController
  @JSName("com.sun.star.form.runtime.FormOperations")
  var comDotsunDotstarDotformDotruntimeDotFormOperations: FormOperations
  @JSName("com.sun.star.form.validation.ValidatableBindableControlModel")
  var comDotsunDotstarDotformDotvalidationDotValidatableBindableControlModel: ValidatableBindableControlModel
  @JSName("com.sun.star.form.validation.ValidatableControlModel")
  var comDotsunDotstarDotformDotvalidationDotValidatableControlModel: ValidatableControlModel
  @JSName("com.sun.star.formula.AccessibleFormulaText")
  var comDotsunDotstarDotformulaDotAccessibleFormulaText: AccessibleFormulaText
  @JSName("com.sun.star.formula.AccessibleFormulaView")
  var comDotsunDotstarDotformulaDotAccessibleFormulaView: AccessibleFormulaView
  @JSName("com.sun.star.formula.FormulaProperties")
  var comDotsunDotstarDotformulaDotFormulaProperties: FormulaProperties
  @JSName("com.sun.star.frame.AppDispatchProvider")
  var comDotsunDotstarDotframeDotAppDispatchProvider: AppDispatchProvider
  @JSName("com.sun.star.frame.AutoRecovery")
  var comDotsunDotstarDotframeDotAutoRecovery: AutoRecovery
  @JSName("com.sun.star.frame.Bibliography")
  var comDotsunDotstarDotframeDotBibliography: Bibliography
  @JSName("com.sun.star.frame.Components")
  var comDotsunDotstarDotframeDotComponents: Components
  @JSName("com.sun.star.frame.ContentHandler")
  var comDotsunDotstarDotframeDotContentHandler: ContentHandler
  @JSName("com.sun.star.frame.ContentHandlerFactory")
  var comDotsunDotstarDotframeDotContentHandlerFactory: ContentHandlerFactory
  @JSName("com.sun.star.frame.Controller")
  var comDotsunDotstarDotframeDotController: Controller
  @JSName("com.sun.star.frame.Desktop")
  var comDotsunDotstarDotframeDotDesktop: Desktop
  @JSName("com.sun.star.frame.DesktopTask")
  var comDotsunDotstarDotframeDotDesktopTask: DesktopTask
  @JSName("com.sun.star.frame.DesktopTasks")
  var comDotsunDotstarDotframeDotDesktopTasks: DesktopTasks
  @JSName("com.sun.star.frame.DispatchHelper")
  var comDotsunDotstarDotframeDotDispatchHelper: DispatchHelper
  @JSName("com.sun.star.frame.DispatchProvider")
  var comDotsunDotstarDotframeDotDispatchProvider: DispatchProvider
  @JSName("com.sun.star.frame.DispatchRecorder")
  var comDotsunDotstarDotframeDotDispatchRecorder: DispatchRecorder
  @JSName("com.sun.star.frame.DispatchRecorderSupplier")
  var comDotsunDotstarDotframeDotDispatchRecorderSupplier: DispatchRecorderSupplier
  @JSName("com.sun.star.frame.DocumentTemplates")
  var comDotsunDotstarDotframeDotDocumentTemplates: DocumentTemplates
  @JSName("com.sun.star.frame.Frame")
  var comDotsunDotstarDotframeDotFrame: Frame
  @JSName("com.sun.star.frame.FrameControl")
  var comDotsunDotstarDotframeDotFrameControl: FrameControl
  @JSName("com.sun.star.frame.FrameLoader")
  var comDotsunDotstarDotframeDotFrameLoader: FrameLoader
  @JSName("com.sun.star.frame.FrameLoaderFactory")
  var comDotsunDotstarDotframeDotFrameLoaderFactory: FrameLoaderFactory
  @JSName("com.sun.star.frame.FramesContainer")
  var comDotsunDotstarDotframeDotFramesContainer: FramesContainer
  @JSName("com.sun.star.frame.GlobalEventBroadcaster")
  var comDotsunDotstarDotframeDotGlobalEventBroadcaster: GlobalEventBroadcaster
  @JSName("com.sun.star.frame.LayoutManager")
  var comDotsunDotstarDotframeDotLayoutManager: LayoutManager
  @JSName("com.sun.star.frame.MediaTypeDetectionHelper")
  var comDotsunDotstarDotframeDotMediaTypeDetectionHelper: MediaTypeDetectionHelper
  @JSName("com.sun.star.frame.ModuleManager")
  var comDotsunDotstarDotframeDotModuleManager: ModuleManager
  @JSName("com.sun.star.frame.OfficeFrameLoader")
  var comDotsunDotstarDotframeDotOfficeFrameLoader: OfficeFrameLoader
  @JSName("com.sun.star.frame.PopupMenuController")
  var comDotsunDotstarDotframeDotPopupMenuController: PopupMenuController
  @JSName("com.sun.star.frame.PopupMenuControllerFactory")
  var comDotsunDotstarDotframeDotPopupMenuControllerFactory: PopupMenuControllerFactory
  @JSName("com.sun.star.frame.ProtocolHandler")
  var comDotsunDotstarDotframeDotProtocolHandler: ProtocolHandler
  @JSName("com.sun.star.frame.SessionListener")
  var comDotsunDotstarDotframeDotSessionListener: SessionListener
  @JSName("com.sun.star.frame.SessionManager")
  var comDotsunDotstarDotframeDotSessionManager: SessionManager
  @JSName("com.sun.star.frame.Settings")
  var comDotsunDotstarDotframeDotSettings: typingsSlinky.activexLibreoffice.com_.sun.star.frame.Settings
  @JSName("com.sun.star.frame.StartModule")
  var comDotsunDotstarDotframeDotStartModule: StartModule
  @JSName("com.sun.star.frame.StatusbarController")
  var comDotsunDotstarDotframeDotStatusbarController: StatusbarController
  @JSName("com.sun.star.frame.StatusbarControllerFactory")
  var comDotsunDotstarDotframeDotStatusbarControllerFactory: StatusbarControllerFactory
  @JSName("com.sun.star.frame.SynchronousFrameLoader")
  var comDotsunDotstarDotframeDotSynchronousFrameLoader: SynchronousFrameLoader
  @JSName("com.sun.star.frame.Task")
  var comDotsunDotstarDotframeDotTask: Task
  @JSName("com.sun.star.frame.TaskCreator")
  var comDotsunDotstarDotframeDotTaskCreator: TaskCreator
  @JSName("com.sun.star.frame.TemplateAccess")
  var comDotsunDotstarDotframeDotTemplateAccess: TemplateAccess
  @JSName("com.sun.star.frame.ToolbarController")
  var comDotsunDotstarDotframeDotToolbarController: ToolbarController
  @JSName("com.sun.star.frame.ToolbarControllerFactory")
  var comDotsunDotstarDotframeDotToolbarControllerFactory: ToolbarControllerFactory
  @JSName("com.sun.star.frame.TransientDocumentsDocumentContentFactory")
  var comDotsunDotstarDotframeDotTransientDocumentsDocumentContentFactory: TransientDocumentsDocumentContentFactory
  @JSName("com.sun.star.frame.UICommandDescription")
  var comDotsunDotstarDotframeDotUICommandDescription: UICommandDescription
  @JSName("com.sun.star.gallery.GalleryItem")
  var comDotsunDotstarDotgalleryDotGalleryItem: GalleryItem
  @JSName("com.sun.star.gallery.GalleryTheme")
  var comDotsunDotstarDotgalleryDotGalleryTheme: GalleryTheme
  @JSName("com.sun.star.gallery.GalleryThemeProvider")
  var comDotsunDotstarDotgalleryDotGalleryThemeProvider: GalleryThemeProvider
  @JSName("com.sun.star.graphic.Graphic")
  var comDotsunDotstarDotgraphicDotGraphic: Graphic
  @JSName("com.sun.star.graphic.GraphicDescriptor")
  var comDotsunDotstarDotgraphicDotGraphicDescriptor: GraphicDescriptor
  @JSName("com.sun.star.graphic.GraphicObject")
  var comDotsunDotstarDotgraphicDotGraphicObject: GraphicObject
  @JSName("com.sun.star.graphic.GraphicProvider")
  var comDotsunDotstarDotgraphicDotGraphicProvider: GraphicProvider
  @JSName("com.sun.star.graphic.GraphicRasterizer")
  var comDotsunDotstarDotgraphicDotGraphicRasterizer: GraphicRasterizer
  @JSName("com.sun.star.graphic.GraphicRendererVCL")
  var comDotsunDotstarDotgraphicDotGraphicRendererVCL: GraphicRendererVCL
  @JSName("com.sun.star.graphic.MediaProperties")
  var comDotsunDotstarDotgraphicDotMediaProperties: MediaProperties
  @JSName("com.sun.star.graphic.Primitive2DTools")
  var comDotsunDotstarDotgraphicDotPrimitive2DTools: Primitive2DTools
  @JSName("com.sun.star.graphic.PrimitiveFactory2D")
  var comDotsunDotstarDotgraphicDotPrimitiveFactory2D: PrimitiveFactory2D
  @JSName("com.sun.star.graphic.SvgTools")
  var comDotsunDotstarDotgraphicDotSvgTools: SvgTools
  @JSName("com.sun.star.i18n.BreakIterator")
  var comDotsunDotstarDoti18nDotBreakIterator: BreakIterator
  @JSName("com.sun.star.i18n.ChapterCollator")
  var comDotsunDotstarDoti18nDotChapterCollator: ChapterCollator
  @JSName("com.sun.star.i18n.CharacterClassification")
  var comDotsunDotstarDoti18nDotCharacterClassification: CharacterClassification
  @JSName("com.sun.star.i18n.Collator")
  var comDotsunDotstarDoti18nDotCollator: Collator
  @JSName("com.sun.star.i18n.IndexEntrySupplier")
  var comDotsunDotstarDoti18nDotIndexEntrySupplier: IndexEntrySupplier
  @JSName("com.sun.star.i18n.InputSequenceChecker")
  var comDotsunDotstarDoti18nDotInputSequenceChecker: InputSequenceChecker
  @JSName("com.sun.star.i18n.LocaleCalendar")
  var comDotsunDotstarDoti18nDotLocaleCalendar: LocaleCalendar
  @JSName("com.sun.star.i18n.LocaleCalendar2")
  var comDotsunDotstarDoti18nDotLocaleCalendar2: LocaleCalendar2
  @JSName("com.sun.star.i18n.LocaleData")
  var comDotsunDotstarDoti18nDotLocaleData: LocaleData
  @JSName("com.sun.star.i18n.NativeNumberSupplier")
  var comDotsunDotstarDoti18nDotNativeNumberSupplier: NativeNumberSupplier
  @JSName("com.sun.star.i18n.NumberFormatMapper")
  var comDotsunDotstarDoti18nDotNumberFormatMapper: NumberFormatMapper
  @JSName("com.sun.star.i18n.OrdinalSuffix")
  var comDotsunDotstarDoti18nDotOrdinalSuffix: OrdinalSuffix
  @JSName("com.sun.star.i18n.TextConversion")
  var comDotsunDotstarDoti18nDotTextConversion: TextConversion
  @JSName("com.sun.star.i18n.Transliteration")
  var comDotsunDotstarDoti18nDotTransliteration: Transliteration
  @JSName("com.sun.star.image.ImageMap")
  var comDotsunDotstarDotimageDotImageMap: ImageMap
  @JSName("com.sun.star.image.ImageMapCircleObject")
  var comDotsunDotstarDotimageDotImageMapCircleObject: ImageMapCircleObject
  @JSName("com.sun.star.image.ImageMapObject")
  var comDotsunDotstarDotimageDotImageMapObject: ImageMapObject
  @JSName("com.sun.star.image.ImageMapPolygonObject")
  var comDotsunDotstarDotimageDotImageMapPolygonObject: ImageMapPolygonObject
  @JSName("com.sun.star.image.ImageMapRectangleObject")
  var comDotsunDotstarDotimageDotImageMapRectangleObject: ImageMapRectangleObject
  @JSName("com.sun.star.inspection.DefaultHelpProvider")
  var comDotsunDotstarDotinspectionDotDefaultHelpProvider: DefaultHelpProvider
  @JSName("com.sun.star.inspection.GenericPropertyHandler")
  var comDotsunDotstarDotinspectionDotGenericPropertyHandler: GenericPropertyHandler
  @JSName("com.sun.star.inspection.ObjectInspector")
  var comDotsunDotstarDotinspectionDotObjectInspector: ObjectInspector
  @JSName("com.sun.star.inspection.ObjectInspectorModel")
  var comDotsunDotstarDotinspectionDotObjectInspectorModel: ObjectInspectorModel
  @JSName("com.sun.star.inspection.StringRepresentation")
  var comDotsunDotstarDotinspectionDotStringRepresentation: StringRepresentation
  @JSName("com.sun.star.io.DataInputStream")
  var comDotsunDotstarDotioDotDataInputStream: DataInputStream
  @JSName("com.sun.star.io.DataOutputStream")
  var comDotsunDotstarDotioDotDataOutputStream: DataOutputStream
  @JSName("com.sun.star.io.MarkableInputStream")
  var comDotsunDotstarDotioDotMarkableInputStream: MarkableInputStream
  @JSName("com.sun.star.io.MarkableOutputStream")
  var comDotsunDotstarDotioDotMarkableOutputStream: MarkableOutputStream
  @JSName("com.sun.star.io.ObjectInputStream")
  var comDotsunDotstarDotioDotObjectInputStream: ObjectInputStream
  @JSName("com.sun.star.io.ObjectOutputStream")
  var comDotsunDotstarDotioDotObjectOutputStream: ObjectOutputStream
  @JSName("com.sun.star.io.Pipe")
  var comDotsunDotstarDotioDotPipe: Pipe
  @JSName("com.sun.star.io.Pump")
  var comDotsunDotstarDotioDotPump: Pump
  @JSName("com.sun.star.io.SequenceInputStream")
  var comDotsunDotstarDotioDotSequenceInputStream: SequenceInputStream
  @JSName("com.sun.star.io.SequenceOutputStream")
  var comDotsunDotstarDotioDotSequenceOutputStream: SequenceOutputStream
  @JSName("com.sun.star.io.TempFile")
  var comDotsunDotstarDotioDotTempFile: TempFile
  @JSName("com.sun.star.io.TextInputStream")
  var comDotsunDotstarDotioDotTextInputStream: TextInputStream
  @JSName("com.sun.star.io.TextOutputStream")
  var comDotsunDotstarDotioDotTextOutputStream: TextOutputStream
  @JSName("com.sun.star.java.JavaVirtualMachine")
  var comDotsunDotstarDotjavaDotJavaVirtualMachine: JavaVirtualMachine
  @JSName("com.sun.star.lang.MultiServiceFactory")
  var comDotsunDotstarDotlangDotMultiServiceFactory: MultiServiceFactory
  @JSName("com.sun.star.lang.RegistryServiceManager")
  var comDotsunDotstarDotlangDotRegistryServiceManager: RegistryServiceManager
  @JSName("com.sun.star.lang.ServiceManager")
  var comDotsunDotstarDotlangDotServiceManager: ServiceManager
  @JSName("com.sun.star.linguistic2.ConversionDictionary")
  var comDotsunDotstarDotlinguistic2DotConversionDictionary: ConversionDictionary
  @JSName("com.sun.star.linguistic2.ConversionDictionaryList")
  var comDotsunDotstarDotlinguistic2DotConversionDictionaryList: ConversionDictionaryList
  @JSName("com.sun.star.linguistic2.Dictionary")
  var comDotsunDotstarDotlinguistic2DotDictionary: Dictionary
  @JSName("com.sun.star.linguistic2.DictionaryList")
  var comDotsunDotstarDotlinguistic2DotDictionaryList: DictionaryList
  @JSName("com.sun.star.linguistic2.HangulHanjaConversionDictionary")
  var comDotsunDotstarDotlinguistic2DotHangulHanjaConversionDictionary: HangulHanjaConversionDictionary
  @JSName("com.sun.star.linguistic2.Hyphenator")
  var comDotsunDotstarDotlinguistic2DotHyphenator: Hyphenator
  @JSName("com.sun.star.linguistic2.LanguageGuessing")
  var comDotsunDotstarDotlinguistic2DotLanguageGuessing: LanguageGuessing
  @JSName("com.sun.star.linguistic2.LinguProperties")
  var comDotsunDotstarDotlinguistic2DotLinguProperties: LinguProperties
  @JSName("com.sun.star.linguistic2.LinguServiceManager")
  var comDotsunDotstarDotlinguistic2DotLinguServiceManager: LinguServiceManager
  @JSName("com.sun.star.linguistic2.Proofreader")
  var comDotsunDotstarDotlinguistic2DotProofreader: Proofreader
  @JSName("com.sun.star.linguistic2.ProofreadingIterator")
  var comDotsunDotstarDotlinguistic2DotProofreadingIterator: ProofreadingIterator
  @JSName("com.sun.star.linguistic2.SpellChecker")
  var comDotsunDotstarDotlinguistic2DotSpellChecker: SpellChecker
  @JSName("com.sun.star.linguistic2.Thesaurus")
  var comDotsunDotstarDotlinguistic2DotThesaurus: Thesaurus
  @JSName("com.sun.star.loader.Dynamic")
  var comDotsunDotstarDotloaderDotDynamic: Dynamic
  @JSName("com.sun.star.loader.Java")
  var comDotsunDotstarDotloaderDotJava: Java
  @JSName("com.sun.star.loader.Java2")
  var comDotsunDotstarDotloaderDotJava2: Java2
  @JSName("com.sun.star.loader.SharedLibrary")
  var comDotsunDotstarDotloaderDotSharedLibrary: SharedLibrary
  @JSName("com.sun.star.logging.ConsoleHandler")
  var comDotsunDotstarDotloggingDotConsoleHandler: ConsoleHandler
  @JSName("com.sun.star.logging.CsvLogFormatter")
  var comDotsunDotstarDotloggingDotCsvLogFormatter: CsvLogFormatter
  @JSName("com.sun.star.logging.FileHandler")
  var comDotsunDotstarDotloggingDotFileHandler: FileHandler
  @JSName("com.sun.star.logging.PlainTextFormatter")
  var comDotsunDotstarDotloggingDotPlainTextFormatter: PlainTextFormatter
  @JSName("com.sun.star.logging.SimpleLogRing")
  var comDotsunDotstarDotloggingDotSimpleLogRing: SimpleLogRing
  @JSName("com.sun.star.mail.MailMessage")
  var comDotsunDotstarDotmailDotMailMessage: MailMessage
  @JSName("com.sun.star.mail.MailServiceProvider")
  var comDotsunDotstarDotmailDotMailServiceProvider: MailServiceProvider
  @JSName("com.sun.star.media.Manager")
  var comDotsunDotstarDotmediaDotManager: Manager
  @JSName("com.sun.star.mozilla.MenuProxy")
  var comDotsunDotstarDotmozillaDotMenuProxy: MenuProxy
  @JSName("com.sun.star.mozilla.MenuProxyListener")
  var comDotsunDotstarDotmozillaDotMenuProxyListener: MenuProxyListener
  @JSName("com.sun.star.mozilla.MozillaBootstrap")
  var comDotsunDotstarDotmozillaDotMozillaBootstrap: MozillaBootstrap
  @JSName("com.sun.star.office.Quickstart")
  var comDotsunDotstarDotofficeDotQuickstart: Quickstart
  @JSName("com.sun.star.packages.Package")
  var comDotsunDotstarDotpackagesDotPackage: Package
  @JSName("com.sun.star.packages.PackageFolder")
  var comDotsunDotstarDotpackagesDotPackageFolder: PackageFolder
  @JSName("com.sun.star.packages.PackageFolderEnumeration")
  var comDotsunDotstarDotpackagesDotPackageFolderEnumeration: PackageFolderEnumeration
  @JSName("com.sun.star.packages.PackageStream")
  var comDotsunDotstarDotpackagesDotPackageStream: PackageStream
  @JSName("com.sun.star.packages.manifest.ManifestReader")
  var comDotsunDotstarDotpackagesDotmanifestDotManifestReader: ManifestReader
  @JSName("com.sun.star.packages.manifest.ManifestWriter")
  var comDotsunDotstarDotpackagesDotmanifestDotManifestWriter: ManifestWriter
  @JSName("com.sun.star.packages.zip.ZipFileAccess")
  var comDotsunDotstarDotpackagesDotzipDotZipFileAccess: ZipFileAccess
  @JSName("com.sun.star.presentation.ChartShape")
  var comDotsunDotstarDotpresentationDotChartShape: ChartShape
  @JSName("com.sun.star.presentation.CustomPresentation")
  var comDotsunDotstarDotpresentationDotCustomPresentation: CustomPresentation
  @JSName("com.sun.star.presentation.CustomPresentationAccess")
  var comDotsunDotstarDotpresentationDotCustomPresentationAccess: CustomPresentationAccess
  @JSName("com.sun.star.presentation.DateTimeShape")
  var comDotsunDotstarDotpresentationDotDateTimeShape: DateTimeShape
  @JSName("com.sun.star.presentation.DocumentSettings")
  var comDotsunDotstarDotpresentationDotDocumentSettings: typingsSlinky.activexLibreoffice.com_.sun.star.presentation.DocumentSettings
  @JSName("com.sun.star.presentation.DrawPage")
  var comDotsunDotstarDotpresentationDotDrawPage: typingsSlinky.activexLibreoffice.com_.sun.star.presentation.DrawPage
  @JSName("com.sun.star.presentation.FooterShape")
  var comDotsunDotstarDotpresentationDotFooterShape: FooterShape
  @JSName("com.sun.star.presentation.GraphicObjectShape")
  var comDotsunDotstarDotpresentationDotGraphicObjectShape: typingsSlinky.activexLibreoffice.com_.sun.star.presentation.GraphicObjectShape
  @JSName("com.sun.star.presentation.HandoutShape")
  var comDotsunDotstarDotpresentationDotHandoutShape: HandoutShape
  @JSName("com.sun.star.presentation.HandoutView")
  var comDotsunDotstarDotpresentationDotHandoutView: HandoutView
  @JSName("com.sun.star.presentation.HeaderShape")
  var comDotsunDotstarDotpresentationDotHeaderShape: HeaderShape
  @JSName("com.sun.star.presentation.NotesShape")
  var comDotsunDotstarDotpresentationDotNotesShape: NotesShape
  @JSName("com.sun.star.presentation.NotesView")
  var comDotsunDotstarDotpresentationDotNotesView: NotesView
  @JSName("com.sun.star.presentation.OLE2Shape")
  var comDotsunDotstarDotpresentationDotOLE2Shape: typingsSlinky.activexLibreoffice.com_.sun.star.presentation.OLE2Shape
  @JSName("com.sun.star.presentation.OutlineView")
  var comDotsunDotstarDotpresentationDotOutlineView: OutlineView
  @JSName("com.sun.star.presentation.OutlinerShape")
  var comDotsunDotstarDotpresentationDotOutlinerShape: OutlinerShape
  @JSName("com.sun.star.presentation.PageShape")
  var comDotsunDotstarDotpresentationDotPageShape: typingsSlinky.activexLibreoffice.com_.sun.star.presentation.PageShape
  @JSName("com.sun.star.presentation.Presentation")
  var comDotsunDotstarDotpresentationDotPresentation: Presentation
  @JSName("com.sun.star.presentation.Presentation2")
  var comDotsunDotstarDotpresentationDotPresentation2: Presentation2
  @JSName("com.sun.star.presentation.PresentationDocument")
  var comDotsunDotstarDotpresentationDotPresentationDocument: PresentationDocument
  @JSName("com.sun.star.presentation.PresentationView")
  var comDotsunDotstarDotpresentationDotPresentationView: PresentationView
  @JSName("com.sun.star.presentation.PreviewView")
  var comDotsunDotstarDotpresentationDotPreviewView: PreviewView
  @JSName("com.sun.star.presentation.Shape")
  var comDotsunDotstarDotpresentationDotShape: typingsSlinky.activexLibreoffice.com_.sun.star.presentation.Shape
  @JSName("com.sun.star.presentation.SlideNumberShape")
  var comDotsunDotstarDotpresentationDotSlideNumberShape: SlideNumberShape
  @JSName("com.sun.star.presentation.SlideShow")
  var comDotsunDotstarDotpresentationDotSlideShow: SlideShow
  @JSName("com.sun.star.presentation.SlidesView")
  var comDotsunDotstarDotpresentationDotSlidesView: SlidesView
  @JSName("com.sun.star.presentation.SubtitleShape")
  var comDotsunDotstarDotpresentationDotSubtitleShape: SubtitleShape
  @JSName("com.sun.star.presentation.TitleTextShape")
  var comDotsunDotstarDotpresentationDotTitleTextShape: TitleTextShape
  @JSName("com.sun.star.presentation.TransitionFactory")
  var comDotsunDotstarDotpresentationDotTransitionFactory: TransitionFactory
  @JSName("com.sun.star.presentation.textfield.DateTime")
  var comDotsunDotstarDotpresentationDottextfieldDotDateTime: DateTime
  @JSName("com.sun.star.presentation.textfield.Footer")
  var comDotsunDotstarDotpresentationDottextfieldDotFooter: Footer
  @JSName("com.sun.star.presentation.textfield.Header")
  var comDotsunDotstarDotpresentationDottextfieldDotHeader: Header
  @JSName("com.sun.star.rdf.BlankNode")
  var comDotsunDotstarDotrdfDotBlankNode: BlankNode
  @JSName("com.sun.star.rdf.Literal")
  var comDotsunDotstarDotrdfDotLiteral: Literal
  @JSName("com.sun.star.rdf.Repository")
  var comDotsunDotstarDotrdfDotRepository: Repository
  @JSName("com.sun.star.rdf.URI")
  var comDotsunDotstarDotrdfDotURI: URI
  @JSName("com.sun.star.reflection.CoreReflection")
  var comDotsunDotstarDotreflectionDotCoreReflection: CoreReflection
  @JSName("com.sun.star.reflection.ProxyFactory")
  var comDotsunDotstarDotreflectionDotProxyFactory: ProxyFactory
  @JSName("com.sun.star.reflection.TypeDescriptionManager")
  var comDotsunDotstarDotreflectionDotTypeDescriptionManager: TypeDescriptionManager
  @JSName("com.sun.star.reflection.TypeDescriptionProvider")
  var comDotsunDotstarDotreflectionDotTypeDescriptionProvider: TypeDescriptionProvider
  @JSName("com.sun.star.registry.DefaultRegistry")
  var comDotsunDotstarDotregistryDotDefaultRegistry: DefaultRegistry
  @JSName("com.sun.star.registry.ImplementationRegistration")
  var comDotsunDotstarDotregistryDotImplementationRegistration: ImplementationRegistration
  @JSName("com.sun.star.registry.NestedRegistry")
  var comDotsunDotstarDotregistryDotNestedRegistry: NestedRegistry
  @JSName("com.sun.star.registry.SimpleRegistry")
  var comDotsunDotstarDotregistryDotSimpleRegistry: SimpleRegistry
  @JSName("com.sun.star.rendering.BitmapCanvas")
  var comDotsunDotstarDotrenderingDotBitmapCanvas: BitmapCanvas
  @JSName("com.sun.star.rendering.Canvas")
  var comDotsunDotstarDotrenderingDotCanvas: Canvas
  @JSName("com.sun.star.rendering.CanvasFactory")
  var comDotsunDotstarDotrenderingDotCanvasFactory: CanvasFactory
  @JSName("com.sun.star.rendering.MtfRenderer")
  var comDotsunDotstarDotrenderingDotMtfRenderer: MtfRenderer
  @JSName("com.sun.star.report.FixedLine")
  var comDotsunDotstarDotreportDotFixedLine: FixedLine
  @JSName("com.sun.star.report.FixedText")
  var comDotsunDotstarDotreportDotFixedText: typingsSlinky.activexLibreoffice.com_.sun.star.report.FixedText
  @JSName("com.sun.star.report.FormatCondition")
  var comDotsunDotstarDotreportDotFormatCondition: FormatCondition
  @JSName("com.sun.star.report.FormattedField")
  var comDotsunDotstarDotreportDotFormattedField: typingsSlinky.activexLibreoffice.com_.sun.star.report.FormattedField
  @JSName("com.sun.star.report.Function")
  var comDotsunDotstarDotreportDotFunction: Function
  @JSName("com.sun.star.report.Group")
  var comDotsunDotstarDotreportDotGroup: Group
  @JSName("com.sun.star.report.Groups")
  var comDotsunDotstarDotreportDotGroups: Groups
  @JSName("com.sun.star.report.ImageControl")
  var comDotsunDotstarDotreportDotImageControl: typingsSlinky.activexLibreoffice.com_.sun.star.report.ImageControl
  @JSName("com.sun.star.report.ReportControlFormat")
  var comDotsunDotstarDotreportDotReportControlFormat: ReportControlFormat
  @JSName("com.sun.star.report.ReportControlModel")
  var comDotsunDotstarDotreportDotReportControlModel: ReportControlModel
  @JSName("com.sun.star.report.ReportDefinition")
  var comDotsunDotstarDotreportDotReportDefinition: ReportDefinition
  @JSName("com.sun.star.report.ReportEngine")
  var comDotsunDotstarDotreportDotReportEngine: ReportEngine
  @JSName("com.sun.star.report.Section")
  var comDotsunDotstarDotreportDotSection: Section
  @JSName("com.sun.star.report.Shape")
  var comDotsunDotstarDotreportDotShape: typingsSlinky.activexLibreoffice.com_.sun.star.report.Shape
  @JSName("com.sun.star.report.inspection.DataProviderHandler")
  var comDotsunDotstarDotreportDotinspectionDotDataProviderHandler: DataProviderHandler
  @JSName("com.sun.star.report.inspection.DefaultComponentInspectorModel")
  var comDotsunDotstarDotreportDotinspectionDotDefaultComponentInspectorModel: DefaultComponentInspectorModel
  @JSName("com.sun.star.report.inspection.ReportComponentHandler")
  var comDotsunDotstarDotreportDotinspectionDotReportComponentHandler: ReportComponentHandler
  @JSName("com.sun.star.resource.StringResource")
  var comDotsunDotstarDotresourceDotStringResource: StringResource
  @JSName("com.sun.star.resource.StringResourceWithLocation")
  var comDotsunDotstarDotresourceDotStringResourceWithLocation: StringResourceWithLocation
  @JSName("com.sun.star.resource.StringResourceWithStorage")
  var comDotsunDotstarDotresourceDotStringResourceWithStorage: StringResourceWithStorage
  @JSName("com.sun.star.scanner.ScannerManager")
  var comDotsunDotstarDotscannerDotScannerManager: ScannerManager
  @JSName("com.sun.star.script.AllListenerAdapter")
  var comDotsunDotstarDotscriptDotAllListenerAdapter: AllListenerAdapter
  @JSName("com.sun.star.script.Converter")
  var comDotsunDotstarDotscriptDotConverter: Converter
  @JSName("com.sun.star.script.DocumentDialogLibraryContainer")
  var comDotsunDotstarDotscriptDotDocumentDialogLibraryContainer: DocumentDialogLibraryContainer
  @JSName("com.sun.star.script.DocumentScriptLibraryContainer")
  var comDotsunDotstarDotscriptDotDocumentScriptLibraryContainer: DocumentScriptLibraryContainer
  @JSName("com.sun.star.script.Engine")
  var comDotsunDotstarDotscriptDotEngine: Engine
  @JSName("com.sun.star.script.Invocation")
  var comDotsunDotstarDotscriptDotInvocation: Invocation
  @JSName("com.sun.star.script.InvocationAdapterFactory")
  var comDotsunDotstarDotscriptDotInvocationAdapterFactory: InvocationAdapterFactory
  @JSName("com.sun.star.script.JavaScript")
  var comDotsunDotstarDotscriptDotJavaScript: JavaScript
  @JSName("com.sun.star.script.browse.BrowseNode")
  var comDotsunDotstarDotscriptDotbrowseDotBrowseNode: BrowseNode
  @JSName("com.sun.star.script.browse.BrowseNodeFactory")
  var comDotsunDotstarDotscriptDotbrowseDotBrowseNodeFactory: BrowseNodeFactory
  @JSName("com.sun.star.script.provider.LanguageScriptProvider")
  var comDotsunDotstarDotscriptDotproviderDotLanguageScriptProvider: LanguageScriptProvider
  @JSName("com.sun.star.script.provider.MasterScriptProvider")
  var comDotsunDotstarDotscriptDotproviderDotMasterScriptProvider: MasterScriptProvider
  @JSName("com.sun.star.script.provider.MasterScriptProviderFactory")
  var comDotsunDotstarDotscriptDotproviderDotMasterScriptProviderFactory: MasterScriptProviderFactory
  @JSName("com.sun.star.script.provider.ScriptProvider")
  var comDotsunDotstarDotscriptDotproviderDotScriptProvider: ScriptProvider
  @JSName("com.sun.star.script.provider.ScriptProviderForBasic")
  var comDotsunDotstarDotscriptDotproviderDotScriptProviderForBasic: ScriptProviderForBasic
  @JSName("com.sun.star.script.provider.ScriptProviderForBeanShell")
  var comDotsunDotstarDotscriptDotproviderDotScriptProviderForBeanShell: ScriptProviderForBeanShell
  @JSName("com.sun.star.script.provider.ScriptProviderForJava")
  var comDotsunDotstarDotscriptDotproviderDotScriptProviderForJava: ScriptProviderForJava
  @JSName("com.sun.star.script.provider.ScriptProviderForJavaScript")
  var comDotsunDotstarDotscriptDotproviderDotScriptProviderForJavaScript: ScriptProviderForJavaScript
  @JSName("com.sun.star.script.provider.ScriptURIHelper")
  var comDotsunDotstarDotscriptDotproviderDotScriptURIHelper: ScriptURIHelper
  @JSName("com.sun.star.script.vba.VBAEventProcessor")
  var comDotsunDotstarDotscriptDotvbaDotVBAEventProcessor: VBAEventProcessor
  @JSName("com.sun.star.script.vba.VBAMacroResolver")
  var comDotsunDotstarDotscriptDotvbaDotVBAMacroResolver: VBAMacroResolver
  @JSName("com.sun.star.script.vba.VBASpreadsheetEventProcessor")
  var comDotsunDotstarDotscriptDotvbaDotVBASpreadsheetEventProcessor: VBASpreadsheetEventProcessor
  @JSName("com.sun.star.script.vba.VBATextEventProcessor")
  var comDotsunDotstarDotscriptDotvbaDotVBATextEventProcessor: VBATextEventProcessor
  @JSName("com.sun.star.sdb.CallableStatement")
  var comDotsunDotstarDotsdbDotCallableStatement: CallableStatement
  @JSName("com.sun.star.sdb.Column")
  var comDotsunDotstarDotsdbDotColumn: Column
  @JSName("com.sun.star.sdb.ColumnDescriptorControl")
  var comDotsunDotstarDotsdbDotColumnDescriptorControl: ColumnDescriptorControl
  @JSName("com.sun.star.sdb.ColumnDescriptorControlModel")
  var comDotsunDotstarDotsdbDotColumnDescriptorControlModel: ColumnDescriptorControlModel
  @JSName("com.sun.star.sdb.ColumnSettings")
  var comDotsunDotstarDotsdbDotColumnSettings: ColumnSettings
  @JSName("com.sun.star.sdb.CommandDefinition")
  var comDotsunDotstarDotsdbDotCommandDefinition: CommandDefinition
  @JSName("com.sun.star.sdb.Connection")
  var comDotsunDotstarDotsdbDotConnection: Connection
  @JSName("com.sun.star.sdb.ContentLoader")
  var comDotsunDotstarDotsdbDotContentLoader: ContentLoader
  @JSName("com.sun.star.sdb.DataAccessDescriptor")
  var comDotsunDotstarDotsdbDotDataAccessDescriptor: DataAccessDescriptor
  @JSName("com.sun.star.sdb.DataColumn")
  var comDotsunDotstarDotsdbDotDataColumn: DataColumn
  @JSName("com.sun.star.sdb.DataSettings")
  var comDotsunDotstarDotsdbDotDataSettings: DataSettings
  @JSName("com.sun.star.sdb.DataSource")
  var comDotsunDotstarDotsdbDotDataSource: typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DataSource
  @JSName("com.sun.star.sdb.DataSourceBrowser")
  var comDotsunDotstarDotsdbDotDataSourceBrowser: DataSourceBrowser
  @JSName("com.sun.star.sdb.DatabaseAccess")
  var comDotsunDotstarDotsdbDotDatabaseAccess: DatabaseAccess
  @JSName("com.sun.star.sdb.DatabaseAccessConnection")
  var comDotsunDotstarDotsdbDotDatabaseAccessConnection: DatabaseAccessConnection
  @JSName("com.sun.star.sdb.DatabaseAccessContext")
  var comDotsunDotstarDotsdbDotDatabaseAccessContext: DatabaseAccessContext
  @JSName("com.sun.star.sdb.DatabaseAccessDataSource")
  var comDotsunDotstarDotsdbDotDatabaseAccessDataSource: DatabaseAccessDataSource
  @JSName("com.sun.star.sdb.DatabaseContext")
  var comDotsunDotstarDotsdbDotDatabaseContext: DatabaseContext
  @JSName("com.sun.star.sdb.DatabaseDocument")
  var comDotsunDotstarDotsdbDotDatabaseDocument: DatabaseDocument
  @JSName("com.sun.star.sdb.DatabaseEnvironment")
  var comDotsunDotstarDotsdbDotDatabaseEnvironment: DatabaseEnvironment
  @JSName("com.sun.star.sdb.DatabaseInteractionHandler")
  var comDotsunDotstarDotsdbDotDatabaseInteractionHandler: DatabaseInteractionHandler
  @JSName("com.sun.star.sdb.DatasourceAdministrationDialog")
  var comDotsunDotstarDotsdbDotDatasourceAdministrationDialog: DatasourceAdministrationDialog
  @JSName("com.sun.star.sdb.DefinitionContainer")
  var comDotsunDotstarDotsdbDotDefinitionContainer: DefinitionContainer
  @JSName("com.sun.star.sdb.DefinitionContent")
  var comDotsunDotstarDotsdbDotDefinitionContent: DefinitionContent
  @JSName("com.sun.star.sdb.Document")
  var comDotsunDotstarDotsdbDotDocument: Document
  @JSName("com.sun.star.sdb.DocumentContainer")
  var comDotsunDotstarDotsdbDotDocumentContainer: DocumentContainer
  @JSName("com.sun.star.sdb.DocumentDataSource")
  var comDotsunDotstarDotsdbDotDocumentDataSource: DocumentDataSource
  @JSName("com.sun.star.sdb.DocumentDefinition")
  var comDotsunDotstarDotsdbDotDocumentDefinition: DocumentDefinition
  @JSName("com.sun.star.sdb.ErrorMessageDialog")
  var comDotsunDotstarDotsdbDotErrorMessageDialog: ErrorMessageDialog
  @JSName("com.sun.star.sdb.FilterDialog")
  var comDotsunDotstarDotsdbDotFilterDialog: FilterDialog
  @JSName("com.sun.star.sdb.Forms")
  var comDotsunDotstarDotsdbDotForms: typingsSlinky.activexLibreoffice.com_.sun.star.sdb.Forms
  @JSName("com.sun.star.sdb.InteractionHandler")
  var comDotsunDotstarDotsdbDotInteractionHandler: typingsSlinky.activexLibreoffice.com_.sun.star.sdb.InteractionHandler
  @JSName("com.sun.star.sdb.OfficeDatabaseDocument")
  var comDotsunDotstarDotsdbDotOfficeDatabaseDocument: OfficeDatabaseDocument
  @JSName("com.sun.star.sdb.OrderColumn")
  var comDotsunDotstarDotsdbDotOrderColumn: OrderColumn
  @JSName("com.sun.star.sdb.OrderDialog")
  var comDotsunDotstarDotsdbDotOrderDialog: OrderDialog
  @JSName("com.sun.star.sdb.PreparedStatement")
  var comDotsunDotstarDotsdbDotPreparedStatement: PreparedStatement
  @JSName("com.sun.star.sdb.Query")
  var comDotsunDotstarDotsdbDotQuery: Query
  @JSName("com.sun.star.sdb.QueryDefinition")
  var comDotsunDotstarDotsdbDotQueryDefinition: QueryDefinition
  @JSName("com.sun.star.sdb.QueryDescriptor")
  var comDotsunDotstarDotsdbDotQueryDescriptor: QueryDescriptor
  @JSName("com.sun.star.sdb.QueryDesign")
  var comDotsunDotstarDotsdbDotQueryDesign: QueryDesign
  @JSName("com.sun.star.sdb.RelationDesign")
  var comDotsunDotstarDotsdbDotRelationDesign: RelationDesign
  @JSName("com.sun.star.sdb.ReportDesign")
  var comDotsunDotstarDotsdbDotReportDesign: ReportDesign
  @JSName("com.sun.star.sdb.Reports")
  var comDotsunDotstarDotsdbDotReports: Reports
  @JSName("com.sun.star.sdb.ResultColumn")
  var comDotsunDotstarDotsdbDotResultColumn: ResultColumn
  @JSName("com.sun.star.sdb.ResultSet")
  var comDotsunDotstarDotsdbDotResultSet: ResultSet
  @JSName("com.sun.star.sdb.RowSet")
  var comDotsunDotstarDotsdbDotRowSet: RowSet
  @JSName("com.sun.star.sdb.SQLQueryComposer")
  var comDotsunDotstarDotsdbDotSQLQueryComposer: SQLQueryComposer
  @JSName("com.sun.star.sdb.SingleSelectQueryAnalyzer")
  var comDotsunDotstarDotsdbDotSingleSelectQueryAnalyzer: SingleSelectQueryAnalyzer
  @JSName("com.sun.star.sdb.SingleSelectQueryComposer")
  var comDotsunDotstarDotsdbDotSingleSelectQueryComposer: SingleSelectQueryComposer
  @JSName("com.sun.star.sdb.Table")
  var comDotsunDotstarDotsdbDotTable: Table
  @JSName("com.sun.star.sdb.TableDefinition")
  var comDotsunDotstarDotsdbDotTableDefinition: TableDefinition
  @JSName("com.sun.star.sdb.TableDescriptor")
  var comDotsunDotstarDotsdbDotTableDescriptor: TableDescriptor
  @JSName("com.sun.star.sdb.TableDesign")
  var comDotsunDotstarDotsdbDotTableDesign: TableDesign
  @JSName("com.sun.star.sdb.TextConnectionSettings")
  var comDotsunDotstarDotsdbDotTextConnectionSettings: TextConnectionSettings
  @JSName("com.sun.star.sdb.application.CopyTableWizard")
  var comDotsunDotstarDotsdbDotapplicationDotCopyTableWizard: CopyTableWizard
  @JSName("com.sun.star.sdb.application.DefaultViewController")
  var comDotsunDotstarDotsdbDotapplicationDotDefaultViewController: DefaultViewController
  @JSName("com.sun.star.sdb.application.MacroMigrationWizard")
  var comDotsunDotstarDotsdbDotapplicationDotMacroMigrationWizard: MacroMigrationWizard
  @JSName("com.sun.star.sdb.tools.ConnectionTools")
  var comDotsunDotstarDotsdbDottoolsDotConnectionTools: ConnectionTools
  @JSName("com.sun.star.sdbc.CallableStatement")
  var comDotsunDotstarDotsdbcDotCallableStatement: typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.CallableStatement
  @JSName("com.sun.star.sdbc.Connection")
  var comDotsunDotstarDotsdbcDotConnection: typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.Connection
  @JSName("com.sun.star.sdbc.ConnectionPool")
  var comDotsunDotstarDotsdbcDotConnectionPool: ConnectionPool
  @JSName("com.sun.star.sdbc.ConnectionProperties")
  var comDotsunDotstarDotsdbcDotConnectionProperties: ConnectionProperties
  @JSName("com.sun.star.sdbc.DBASEConnectionProperties")
  var comDotsunDotstarDotsdbcDotDBASEConnectionProperties: DBASEConnectionProperties
  @JSName("com.sun.star.sdbc.Driver")
  var comDotsunDotstarDotsdbcDotDriver: Driver
  @JSName("com.sun.star.sdbc.DriverManager")
  var comDotsunDotstarDotsdbcDotDriverManager: DriverManager
  @JSName("com.sun.star.sdbc.FILEConnectionProperties")
  var comDotsunDotstarDotsdbcDotFILEConnectionProperties: FILEConnectionProperties
  @JSName("com.sun.star.sdbc.FLATConnectionProperties")
  var comDotsunDotstarDotsdbcDotFLATConnectionProperties: FLATConnectionProperties
  @JSName("com.sun.star.sdbc.JDBCConnectionProperties")
  var comDotsunDotstarDotsdbcDotJDBCConnectionProperties: JDBCConnectionProperties
  @JSName("com.sun.star.sdbc.ODBCConnectionProperties")
  var comDotsunDotstarDotsdbcDotODBCConnectionProperties: ODBCConnectionProperties
  @JSName("com.sun.star.sdbc.PreparedStatement")
  var comDotsunDotstarDotsdbcDotPreparedStatement: typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.PreparedStatement
  @JSName("com.sun.star.sdbc.ResultSet")
  var comDotsunDotstarDotsdbcDotResultSet: typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.ResultSet
  @JSName("com.sun.star.sdbc.RowSet")
  var comDotsunDotstarDotsdbcDotRowSet: typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.RowSet
  @JSName("com.sun.star.sdbc.Statement")
  var comDotsunDotstarDotsdbcDotStatement: Statement
  @JSName("com.sun.star.sdbcx.Column")
  var comDotsunDotstarDotsdbcxDotColumn: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Column
  @JSName("com.sun.star.sdbcx.ColumnDescriptor")
  var comDotsunDotstarDotsdbcxDotColumnDescriptor: ColumnDescriptor
  @JSName("com.sun.star.sdbcx.Container")
  var comDotsunDotstarDotsdbcxDotContainer: Container
  @JSName("com.sun.star.sdbcx.DatabaseDefinition")
  var comDotsunDotstarDotsdbcxDotDatabaseDefinition: DatabaseDefinition
  @JSName("com.sun.star.sdbcx.Descriptor")
  var comDotsunDotstarDotsdbcxDotDescriptor: Descriptor
  @JSName("com.sun.star.sdbcx.Driver")
  var comDotsunDotstarDotsdbcxDotDriver: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Driver
  @JSName("com.sun.star.sdbcx.Group")
  var comDotsunDotstarDotsdbcxDotGroup: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Group
  @JSName("com.sun.star.sdbcx.GroupDescriptor")
  var comDotsunDotstarDotsdbcxDotGroupDescriptor: GroupDescriptor
  @JSName("com.sun.star.sdbcx.Index")
  var comDotsunDotstarDotsdbcxDotIndex: Index
  @JSName("com.sun.star.sdbcx.IndexColumn")
  var comDotsunDotstarDotsdbcxDotIndexColumn: IndexColumn
  @JSName("com.sun.star.sdbcx.IndexColumnDescriptor")
  var comDotsunDotstarDotsdbcxDotIndexColumnDescriptor: IndexColumnDescriptor
  @JSName("com.sun.star.sdbcx.IndexDescriptor")
  var comDotsunDotstarDotsdbcxDotIndexDescriptor: IndexDescriptor
  @JSName("com.sun.star.sdbcx.Key")
  var comDotsunDotstarDotsdbcxDotKey: Key
  @JSName("com.sun.star.sdbcx.KeyColumn")
  var comDotsunDotstarDotsdbcxDotKeyColumn: KeyColumn
  @JSName("com.sun.star.sdbcx.KeyColumnDescriptor")
  var comDotsunDotstarDotsdbcxDotKeyColumnDescriptor: KeyColumnDescriptor
  @JSName("com.sun.star.sdbcx.KeyDescriptor")
  var comDotsunDotstarDotsdbcxDotKeyDescriptor: KeyDescriptor
  @JSName("com.sun.star.sdbcx.PreparedStatement")
  var comDotsunDotstarDotsdbcxDotPreparedStatement: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.PreparedStatement
  @JSName("com.sun.star.sdbcx.ReferenceColumn")
  var comDotsunDotstarDotsdbcxDotReferenceColumn: ReferenceColumn
  @JSName("com.sun.star.sdbcx.ResultSet")
  var comDotsunDotstarDotsdbcxDotResultSet: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.ResultSet
  @JSName("com.sun.star.sdbcx.Statement")
  var comDotsunDotstarDotsdbcxDotStatement: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Statement
  @JSName("com.sun.star.sdbcx.Table")
  var comDotsunDotstarDotsdbcxDotTable: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.Table
  @JSName("com.sun.star.sdbcx.TableDescriptor")
  var comDotsunDotstarDotsdbcxDotTableDescriptor: typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx.TableDescriptor
  @JSName("com.sun.star.sdbcx.User")
  var comDotsunDotstarDotsdbcxDotUser: User
  @JSName("com.sun.star.sdbcx.UserDescriptor")
  var comDotsunDotstarDotsdbcxDotUserDescriptor: UserDescriptor
  @JSName("com.sun.star.sdbcx.View")
  var comDotsunDotstarDotsdbcxDotView: View
  @JSName("com.sun.star.sdbcx.ViewDescriptor")
  var comDotsunDotstarDotsdbcxDotViewDescriptor: ViewDescriptor
  @JSName("com.sun.star.security.AccessController")
  var comDotsunDotstarDotsecurityDotAccessController: AccessController
  @JSName("com.sun.star.security.CertificateContainer")
  var comDotsunDotstarDotsecurityDotCertificateContainer: CertificateContainer
  @JSName("com.sun.star.security.DocumentDigitalSignatures")
  var comDotsunDotstarDotsecurityDotDocumentDigitalSignatures: DocumentDigitalSignatures
  @JSName("com.sun.star.security.Policy")
  var comDotsunDotstarDotsecurityDotPolicy: Policy
  @JSName("com.sun.star.security.SerialNumberAdapter")
  var comDotsunDotstarDotsecurityDotSerialNumberAdapter: SerialNumberAdapter
  @JSName("com.sun.star.setup.UpdateCheck")
  var comDotsunDotstarDotsetupDotUpdateCheck: UpdateCheck
  @JSName("com.sun.star.setup.UpdateCheckConfig")
  var comDotsunDotstarDotsetupDotUpdateCheckConfig: UpdateCheckConfig
  @JSName("com.sun.star.sheet.AccessibleCell")
  var comDotsunDotstarDotsheetDotAccessibleCell: AccessibleCell
  @JSName("com.sun.star.sheet.AccessibleCsvCell")
  var comDotsunDotstarDotsheetDotAccessibleCsvCell: AccessibleCsvCell
  @JSName("com.sun.star.sheet.AccessibleCsvRuler")
  var comDotsunDotstarDotsheetDotAccessibleCsvRuler: AccessibleCsvRuler
  @JSName("com.sun.star.sheet.AccessibleCsvTable")
  var comDotsunDotstarDotsheetDotAccessibleCsvTable: AccessibleCsvTable
  @JSName("com.sun.star.sheet.AccessiblePageHeaderFooterAreasView")
  var comDotsunDotstarDotsheetDotAccessiblePageHeaderFooterAreasView: AccessiblePageHeaderFooterAreasView
  @JSName("com.sun.star.sheet.AccessibleSpreadsheet")
  var comDotsunDotstarDotsheetDotAccessibleSpreadsheet: AccessibleSpreadsheet
  @JSName("com.sun.star.sheet.AccessibleSpreadsheetDocumentView")
  var comDotsunDotstarDotsheetDotAccessibleSpreadsheetDocumentView: AccessibleSpreadsheetDocumentView
  @JSName("com.sun.star.sheet.AccessibleSpreadsheetPageView")
  var comDotsunDotstarDotsheetDotAccessibleSpreadsheetPageView: AccessibleSpreadsheetPageView
  @JSName("com.sun.star.sheet.AddIn")
  var comDotsunDotstarDotsheetDotAddIn: AddIn
  @JSName("com.sun.star.sheet.CellAnnotation")
  var comDotsunDotstarDotsheetDotCellAnnotation: CellAnnotation
  @JSName("com.sun.star.sheet.CellAnnotationShape")
  var comDotsunDotstarDotsheetDotCellAnnotationShape: CellAnnotationShape
  @JSName("com.sun.star.sheet.CellAnnotations")
  var comDotsunDotstarDotsheetDotCellAnnotations: CellAnnotations
  @JSName("com.sun.star.sheet.CellAnnotationsEnumeration")
  var comDotsunDotstarDotsheetDotCellAnnotationsEnumeration: CellAnnotationsEnumeration
  @JSName("com.sun.star.sheet.CellAreaLink")
  var comDotsunDotstarDotsheetDotCellAreaLink: CellAreaLink
  @JSName("com.sun.star.sheet.CellAreaLinks")
  var comDotsunDotstarDotsheetDotCellAreaLinks: CellAreaLinks
  @JSName("com.sun.star.sheet.CellAreaLinksEnumeration")
  var comDotsunDotstarDotsheetDotCellAreaLinksEnumeration: CellAreaLinksEnumeration
  @JSName("com.sun.star.sheet.CellFormatRanges")
  var comDotsunDotstarDotsheetDotCellFormatRanges: CellFormatRanges
  @JSName("com.sun.star.sheet.CellFormatRangesEnumeration")
  var comDotsunDotstarDotsheetDotCellFormatRangesEnumeration: CellFormatRangesEnumeration
  @JSName("com.sun.star.sheet.Cells")
  var comDotsunDotstarDotsheetDotCells: Cells
  @JSName("com.sun.star.sheet.CellsEnumeration")
  var comDotsunDotstarDotsheetDotCellsEnumeration: CellsEnumeration
  @JSName("com.sun.star.sheet.ColorScale")
  var comDotsunDotstarDotsheetDotColorScale: ColorScale
  @JSName("com.sun.star.sheet.ConditionFormatEntry")
  var comDotsunDotstarDotsheetDotConditionFormatEntry: ConditionFormatEntry
  @JSName("com.sun.star.sheet.ConditionalFormat")
  var comDotsunDotstarDotsheetDotConditionalFormat: ConditionalFormat
  @JSName("com.sun.star.sheet.ConsolidationDescriptor")
  var comDotsunDotstarDotsheetDotConsolidationDescriptor: ConsolidationDescriptor
  @JSName("com.sun.star.sheet.DDELink")
  var comDotsunDotstarDotsheetDotDDELink: DDELink
  @JSName("com.sun.star.sheet.DDELinks")
  var comDotsunDotstarDotsheetDotDDELinks: DDELinks
  @JSName("com.sun.star.sheet.DDELinksEnumeration")
  var comDotsunDotstarDotsheetDotDDELinksEnumeration: DDELinksEnumeration
  @JSName("com.sun.star.sheet.DataBar")
  var comDotsunDotstarDotsheetDotDataBar: DataBar
  @JSName("com.sun.star.sheet.DataPilotDescriptor")
  var comDotsunDotstarDotsheetDotDataPilotDescriptor: DataPilotDescriptor
  @JSName("com.sun.star.sheet.DataPilotField")
  var comDotsunDotstarDotsheetDotDataPilotField: DataPilotField
  @JSName("com.sun.star.sheet.DataPilotFieldGroup")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroup: DataPilotFieldGroup
  @JSName("com.sun.star.sheet.DataPilotFieldGroupEnumeration")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroupEnumeration: DataPilotFieldGroupEnumeration
  @JSName("com.sun.star.sheet.DataPilotFieldGroupItem")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroupItem: DataPilotFieldGroupItem
  @JSName("com.sun.star.sheet.DataPilotFieldGroups")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroups: DataPilotFieldGroups
  @JSName("com.sun.star.sheet.DataPilotFieldGroupsEnumeration")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroupsEnumeration: DataPilotFieldGroupsEnumeration
  @JSName("com.sun.star.sheet.DataPilotFields")
  var comDotsunDotstarDotsheetDotDataPilotFields: DataPilotFields
  @JSName("com.sun.star.sheet.DataPilotFieldsEnumeration")
  var comDotsunDotstarDotsheetDotDataPilotFieldsEnumeration: DataPilotFieldsEnumeration
  @JSName("com.sun.star.sheet.DataPilotItem")
  var comDotsunDotstarDotsheetDotDataPilotItem: DataPilotItem
  @JSName("com.sun.star.sheet.DataPilotItems")
  var comDotsunDotstarDotsheetDotDataPilotItems: DataPilotItems
  @JSName("com.sun.star.sheet.DataPilotItemsEnumeration")
  var comDotsunDotstarDotsheetDotDataPilotItemsEnumeration: DataPilotItemsEnumeration
  @JSName("com.sun.star.sheet.DataPilotSource")
  var comDotsunDotstarDotsheetDotDataPilotSource: DataPilotSource
  @JSName("com.sun.star.sheet.DataPilotSourceDimension")
  var comDotsunDotstarDotsheetDotDataPilotSourceDimension: DataPilotSourceDimension
  @JSName("com.sun.star.sheet.DataPilotSourceDimensions")
  var comDotsunDotstarDotsheetDotDataPilotSourceDimensions: DataPilotSourceDimensions
  @JSName("com.sun.star.sheet.DataPilotSourceHierarchies")
  var comDotsunDotstarDotsheetDotDataPilotSourceHierarchies: DataPilotSourceHierarchies
  @JSName("com.sun.star.sheet.DataPilotSourceHierarchy")
  var comDotsunDotstarDotsheetDotDataPilotSourceHierarchy: DataPilotSourceHierarchy
  @JSName("com.sun.star.sheet.DataPilotSourceLevel")
  var comDotsunDotstarDotsheetDotDataPilotSourceLevel: DataPilotSourceLevel
  @JSName("com.sun.star.sheet.DataPilotSourceLevels")
  var comDotsunDotstarDotsheetDotDataPilotSourceLevels: DataPilotSourceLevels
  @JSName("com.sun.star.sheet.DataPilotSourceMember")
  var comDotsunDotstarDotsheetDotDataPilotSourceMember: DataPilotSourceMember
  @JSName("com.sun.star.sheet.DataPilotSourceMembers")
  var comDotsunDotstarDotsheetDotDataPilotSourceMembers: DataPilotSourceMembers
  @JSName("com.sun.star.sheet.DataPilotTable")
  var comDotsunDotstarDotsheetDotDataPilotTable: DataPilotTable
  @JSName("com.sun.star.sheet.DataPilotTables")
  var comDotsunDotstarDotsheetDotDataPilotTables: DataPilotTables
  @JSName("com.sun.star.sheet.DataPilotTablesEnumeration")
  var comDotsunDotstarDotsheetDotDataPilotTablesEnumeration: DataPilotTablesEnumeration
  @JSName("com.sun.star.sheet.DatabaseImportDescriptor")
  var comDotsunDotstarDotsheetDotDatabaseImportDescriptor: DatabaseImportDescriptor
  @JSName("com.sun.star.sheet.DatabaseRange")
  var comDotsunDotstarDotsheetDotDatabaseRange: DatabaseRange
  @JSName("com.sun.star.sheet.DatabaseRanges")
  var comDotsunDotstarDotsheetDotDatabaseRanges: DatabaseRanges
  @JSName("com.sun.star.sheet.DatabaseRangesEnumeration")
  var comDotsunDotstarDotsheetDotDatabaseRangesEnumeration: DatabaseRangesEnumeration
  @JSName("com.sun.star.sheet.DateCondition")
  var comDotsunDotstarDotsheetDotDateCondition: DateCondition
  @JSName("com.sun.star.sheet.DocumentSettings")
  var comDotsunDotstarDotsheetDotDocumentSettings: typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DocumentSettings
  @JSName("com.sun.star.sheet.ExternalDocLink")
  var comDotsunDotstarDotsheetDotExternalDocLink: ExternalDocLink
  @JSName("com.sun.star.sheet.ExternalDocLinks")
  var comDotsunDotstarDotsheetDotExternalDocLinks: ExternalDocLinks
  @JSName("com.sun.star.sheet.ExternalSheetCache")
  var comDotsunDotstarDotsheetDotExternalSheetCache: ExternalSheetCache
  @JSName("com.sun.star.sheet.FilterFormulaParser")
  var comDotsunDotstarDotsheetDotFilterFormulaParser: FilterFormulaParser
  @JSName("com.sun.star.sheet.FormulaOpCodeMapper")
  var comDotsunDotstarDotsheetDotFormulaOpCodeMapper: FormulaOpCodeMapper
  @JSName("com.sun.star.sheet.FormulaParser")
  var comDotsunDotstarDotsheetDotFormulaParser: FormulaParser
  @JSName("com.sun.star.sheet.FunctionAccess")
  var comDotsunDotstarDotsheetDotFunctionAccess: FunctionAccess
  @JSName("com.sun.star.sheet.FunctionDescription")
  var comDotsunDotstarDotsheetDotFunctionDescription: FunctionDescription
  @JSName("com.sun.star.sheet.FunctionDescriptionEnumeration")
  var comDotsunDotstarDotsheetDotFunctionDescriptionEnumeration: FunctionDescriptionEnumeration
  @JSName("com.sun.star.sheet.FunctionDescriptions")
  var comDotsunDotstarDotsheetDotFunctionDescriptions: FunctionDescriptions
  @JSName("com.sun.star.sheet.GlobalSheetSettings")
  var comDotsunDotstarDotsheetDotGlobalSheetSettings: GlobalSheetSettings
  @JSName("com.sun.star.sheet.HeaderFooterContent")
  var comDotsunDotstarDotsheetDotHeaderFooterContent: HeaderFooterContent
  @JSName("com.sun.star.sheet.IconSet")
  var comDotsunDotstarDotsheetDotIconSet: IconSet
  @JSName("com.sun.star.sheet.LabelRange")
  var comDotsunDotstarDotsheetDotLabelRange: LabelRange
  @JSName("com.sun.star.sheet.LabelRanges")
  var comDotsunDotstarDotsheetDotLabelRanges: LabelRanges
  @JSName("com.sun.star.sheet.LabelRangesEnumeration")
  var comDotsunDotstarDotsheetDotLabelRangesEnumeration: LabelRangesEnumeration
  @JSName("com.sun.star.sheet.NamedRange")
  var comDotsunDotstarDotsheetDotNamedRange: NamedRange
  @JSName("com.sun.star.sheet.NamedRanges")
  var comDotsunDotstarDotsheetDotNamedRanges: NamedRanges
  @JSName("com.sun.star.sheet.NamedRangesEnumeration")
  var comDotsunDotstarDotsheetDotNamedRangesEnumeration: NamedRangesEnumeration
  @JSName("com.sun.star.sheet.RangeSelectionArguments")
  var comDotsunDotstarDotsheetDotRangeSelectionArguments: RangeSelectionArguments
  @JSName("com.sun.star.sheet.RecentFunctions")
  var comDotsunDotstarDotsheetDotRecentFunctions: RecentFunctions
  @JSName("com.sun.star.sheet.Scenario")
  var comDotsunDotstarDotsheetDotScenario: Scenario
  @JSName("com.sun.star.sheet.Scenarios")
  var comDotsunDotstarDotsheetDotScenarios: Scenarios
  @JSName("com.sun.star.sheet.ScenariosEnumeration")
  var comDotsunDotstarDotsheetDotScenariosEnumeration: ScenariosEnumeration
  @JSName("com.sun.star.sheet.Shape")
  var comDotsunDotstarDotsheetDotShape: typingsSlinky.activexLibreoffice.com_.sun.star.sheet.Shape
  @JSName("com.sun.star.sheet.SheetCell")
  var comDotsunDotstarDotsheetDotSheetCell: SheetCell
  @JSName("com.sun.star.sheet.SheetCellCursor")
  var comDotsunDotstarDotsheetDotSheetCellCursor: SheetCellCursor
  @JSName("com.sun.star.sheet.SheetCellRange")
  var comDotsunDotstarDotsheetDotSheetCellRange: SheetCellRange
  @JSName("com.sun.star.sheet.SheetCellRanges")
  var comDotsunDotstarDotsheetDotSheetCellRanges: SheetCellRanges
  @JSName("com.sun.star.sheet.SheetCellRangesEnumeration")
  var comDotsunDotstarDotsheetDotSheetCellRangesEnumeration: SheetCellRangesEnumeration
  @JSName("com.sun.star.sheet.SheetFilterDescriptor")
  var comDotsunDotstarDotsheetDotSheetFilterDescriptor: SheetFilterDescriptor
  @JSName("com.sun.star.sheet.SheetLink")
  var comDotsunDotstarDotsheetDotSheetLink: SheetLink
  @JSName("com.sun.star.sheet.SheetLinks")
  var comDotsunDotstarDotsheetDotSheetLinks: SheetLinks
  @JSName("com.sun.star.sheet.SheetLinksEnumeration")
  var comDotsunDotstarDotsheetDotSheetLinksEnumeration: SheetLinksEnumeration
  @JSName("com.sun.star.sheet.SheetRangesQuery")
  var comDotsunDotstarDotsheetDotSheetRangesQuery: SheetRangesQuery
  @JSName("com.sun.star.sheet.SheetSortDescriptor")
  var comDotsunDotstarDotsheetDotSheetSortDescriptor: SheetSortDescriptor
  @JSName("com.sun.star.sheet.SheetSortDescriptor2")
  var comDotsunDotstarDotsheetDotSheetSortDescriptor2: SheetSortDescriptor2
  @JSName("com.sun.star.sheet.Solver")
  var comDotsunDotstarDotsheetDotSolver: Solver
  @JSName("com.sun.star.sheet.Spreadsheet")
  var comDotsunDotstarDotsheetDotSpreadsheet: Spreadsheet
  @JSName("com.sun.star.sheet.SpreadsheetDocument")
  var comDotsunDotstarDotsheetDotSpreadsheetDocument: SpreadsheetDocument
  @JSName("com.sun.star.sheet.SpreadsheetDocumentSettings")
  var comDotsunDotstarDotsheetDotSpreadsheetDocumentSettings: SpreadsheetDocumentSettings
  @JSName("com.sun.star.sheet.SpreadsheetDrawPage")
  var comDotsunDotstarDotsheetDotSpreadsheetDrawPage: SpreadsheetDrawPage
  @JSName("com.sun.star.sheet.SpreadsheetView")
  var comDotsunDotstarDotsheetDotSpreadsheetView: SpreadsheetView
  @JSName("com.sun.star.sheet.SpreadsheetViewPane")
  var comDotsunDotstarDotsheetDotSpreadsheetViewPane: SpreadsheetViewPane
  @JSName("com.sun.star.sheet.SpreadsheetViewPanesEnumeration")
  var comDotsunDotstarDotsheetDotSpreadsheetViewPanesEnumeration: SpreadsheetViewPanesEnumeration
  @JSName("com.sun.star.sheet.SpreadsheetViewSettings")
  var comDotsunDotstarDotsheetDotSpreadsheetViewSettings: SpreadsheetViewSettings
  @JSName("com.sun.star.sheet.Spreadsheets")
  var comDotsunDotstarDotsheetDotSpreadsheets: Spreadsheets
  @JSName("com.sun.star.sheet.SpreadsheetsEnumeration")
  var comDotsunDotstarDotsheetDotSpreadsheetsEnumeration: SpreadsheetsEnumeration
  @JSName("com.sun.star.sheet.SubTotalDescriptor")
  var comDotsunDotstarDotsheetDotSubTotalDescriptor: SubTotalDescriptor
  @JSName("com.sun.star.sheet.SubTotalField")
  var comDotsunDotstarDotsheetDotSubTotalField: SubTotalField
  @JSName("com.sun.star.sheet.SubTotalFieldsEnumeration")
  var comDotsunDotstarDotsheetDotSubTotalFieldsEnumeration: SubTotalFieldsEnumeration
  @JSName("com.sun.star.sheet.TableAutoFormat")
  var comDotsunDotstarDotsheetDotTableAutoFormat: TableAutoFormat
  @JSName("com.sun.star.sheet.TableAutoFormatEnumeration")
  var comDotsunDotstarDotsheetDotTableAutoFormatEnumeration: TableAutoFormatEnumeration
  @JSName("com.sun.star.sheet.TableAutoFormatField")
  var comDotsunDotstarDotsheetDotTableAutoFormatField: TableAutoFormatField
  @JSName("com.sun.star.sheet.TableAutoFormats")
  var comDotsunDotstarDotsheetDotTableAutoFormats: TableAutoFormats
  @JSName("com.sun.star.sheet.TableAutoFormatsEnumeration")
  var comDotsunDotstarDotsheetDotTableAutoFormatsEnumeration: TableAutoFormatsEnumeration
  @JSName("com.sun.star.sheet.TableCellStyle")
  var comDotsunDotstarDotsheetDotTableCellStyle: TableCellStyle
  @JSName("com.sun.star.sheet.TableConditionalEntry")
  var comDotsunDotstarDotsheetDotTableConditionalEntry: TableConditionalEntry
  @JSName("com.sun.star.sheet.TableConditionalEntryEnumeration")
  var comDotsunDotstarDotsheetDotTableConditionalEntryEnumeration: TableConditionalEntryEnumeration
  @JSName("com.sun.star.sheet.TableConditionalFormat")
  var comDotsunDotstarDotsheetDotTableConditionalFormat: TableConditionalFormat
  @JSName("com.sun.star.sheet.TablePageStyle")
  var comDotsunDotstarDotsheetDotTablePageStyle: TablePageStyle
  @JSName("com.sun.star.sheet.TableValidation")
  var comDotsunDotstarDotsheetDotTableValidation: TableValidation
  @JSName("com.sun.star.sheet.UniqueCellFormatRanges")
  var comDotsunDotstarDotsheetDotUniqueCellFormatRanges: UniqueCellFormatRanges
  @JSName("com.sun.star.sheet.UniqueCellFormatRangesEnumeration")
  var comDotsunDotstarDotsheetDotUniqueCellFormatRangesEnumeration: UniqueCellFormatRangesEnumeration
  @JSName("com.sun.star.sheet.VolatileResult")
  var comDotsunDotstarDotsheetDotVolatileResult: VolatileResult
  @JSName("com.sun.star.smarttags.SmartTagAction")
  var comDotsunDotstarDotsmarttagsDotSmartTagAction: SmartTagAction
  @JSName("com.sun.star.smarttags.SmartTagRecognizer")
  var comDotsunDotstarDotsmarttagsDotSmartTagRecognizer: SmartTagRecognizer
  @JSName("com.sun.star.style.CellStyle")
  var comDotsunDotstarDotstyleDotCellStyle: CellStyle
  @JSName("com.sun.star.style.CharacterProperties")
  var comDotsunDotstarDotstyleDotCharacterProperties: CharacterProperties
  @JSName("com.sun.star.style.CharacterPropertiesAsian")
  var comDotsunDotstarDotstyleDotCharacterPropertiesAsian: CharacterPropertiesAsian
  @JSName("com.sun.star.style.CharacterPropertiesComplex")
  var comDotsunDotstarDotstyleDotCharacterPropertiesComplex: CharacterPropertiesComplex
  @JSName("com.sun.star.style.CharacterStyle")
  var comDotsunDotstarDotstyleDotCharacterStyle: CharacterStyle
  @JSName("com.sun.star.style.NumberingAlignment")
  var comDotsunDotstarDotstyleDotNumberingAlignment: NumberingAlignment
  @JSName("com.sun.star.style.NumberingLevel")
  var comDotsunDotstarDotstyleDotNumberingLevel: NumberingLevel
  @JSName("com.sun.star.style.NumberingRule")
  var comDotsunDotstarDotstyleDotNumberingRule: NumberingRule
  @JSName("com.sun.star.style.PageProperties")
  var comDotsunDotstarDotstyleDotPageProperties: PageProperties
  @JSName("com.sun.star.style.PageStyle")
  var comDotsunDotstarDotstyleDotPageStyle: PageStyle
  @JSName("com.sun.star.style.ParagraphProperties")
  var comDotsunDotstarDotstyleDotParagraphProperties: ParagraphProperties
  @JSName("com.sun.star.style.ParagraphPropertiesAsian")
  var comDotsunDotstarDotstyleDotParagraphPropertiesAsian: ParagraphPropertiesAsian
  @JSName("com.sun.star.style.ParagraphPropertiesComplex")
  var comDotsunDotstarDotstyleDotParagraphPropertiesComplex: ParagraphPropertiesComplex
  @JSName("com.sun.star.style.ParagraphStyle")
  var comDotsunDotstarDotstyleDotParagraphStyle: ParagraphStyle
  @JSName("com.sun.star.style.Style")
  var comDotsunDotstarDotstyleDotStyle: Style
  @JSName("com.sun.star.style.StyleFamilies")
  var comDotsunDotstarDotstyleDotStyleFamilies: StyleFamilies
  @JSName("com.sun.star.style.StyleFamily")
  var comDotsunDotstarDotstyleDotStyleFamily: StyleFamily
  @JSName("com.sun.star.system.SimpleCommandMail")
  var comDotsunDotstarDotsystemDotSimpleCommandMail: SimpleCommandMail
  @JSName("com.sun.star.system.SimpleSystemMail")
  var comDotsunDotstarDotsystemDotSimpleSystemMail: SimpleSystemMail
  @JSName("com.sun.star.system.SystemShellExecute")
  var comDotsunDotstarDotsystemDotSystemShellExecute: SystemShellExecute
  @JSName("com.sun.star.table.AccessibleCellView")
  var comDotsunDotstarDottableDotAccessibleCellView: AccessibleCellView
  @JSName("com.sun.star.table.AccessibleTableView")
  var comDotsunDotstarDottableDotAccessibleTableView: AccessibleTableView
  @JSName("com.sun.star.table.Cell")
  var comDotsunDotstarDottableDotCell: Cell
  @JSName("com.sun.star.table.CellCursor")
  var comDotsunDotstarDottableDotCellCursor: CellCursor
  @JSName("com.sun.star.table.CellProperties")
  var comDotsunDotstarDottableDotCellProperties: CellProperties
  @JSName("com.sun.star.table.CellRange")
  var comDotsunDotstarDottableDotCellRange: CellRange
  @JSName("com.sun.star.table.CellRangeListSource")
  var comDotsunDotstarDottableDotCellRangeListSource: CellRangeListSource
  @JSName("com.sun.star.table.CellValueBinding")
  var comDotsunDotstarDottableDotCellValueBinding: CellValueBinding
  @JSName("com.sun.star.table.ListPositionCellBinding")
  var comDotsunDotstarDottableDotListPositionCellBinding: ListPositionCellBinding
  @JSName("com.sun.star.table.TableChart")
  var comDotsunDotstarDottableDotTableChart: TableChart
  @JSName("com.sun.star.table.TableCharts")
  var comDotsunDotstarDottableDotTableCharts: TableCharts
  @JSName("com.sun.star.table.TableChartsEnumeration")
  var comDotsunDotstarDottableDotTableChartsEnumeration: TableChartsEnumeration
  @JSName("com.sun.star.table.TableColumn")
  var comDotsunDotstarDottableDotTableColumn: TableColumn
  @JSName("com.sun.star.table.TableColumns")
  var comDotsunDotstarDottableDotTableColumns: TableColumns
  @JSName("com.sun.star.table.TableColumnsEnumeration")
  var comDotsunDotstarDottableDotTableColumnsEnumeration: TableColumnsEnumeration
  @JSName("com.sun.star.table.TableRow")
  var comDotsunDotstarDottableDotTableRow: TableRow
  @JSName("com.sun.star.table.TableRows")
  var comDotsunDotstarDottableDotTableRows: TableRows
  @JSName("com.sun.star.table.TableRowsEnumeration")
  var comDotsunDotstarDottableDotTableRowsEnumeration: TableRowsEnumeration
  @JSName("com.sun.star.table.TableSortDescriptor")
  var comDotsunDotstarDottableDotTableSortDescriptor: TableSortDescriptor
  @JSName("com.sun.star.table.TableSortDescriptor2")
  var comDotsunDotstarDottableDotTableSortDescriptor2: TableSortDescriptor2
  @JSName("com.sun.star.task.AsyncJob")
  var comDotsunDotstarDottaskDotAsyncJob: AsyncJob
  @JSName("com.sun.star.task.InteractionHandler")
  var comDotsunDotstarDottaskDotInteractionHandler: typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionHandler
  @JSName("com.sun.star.task.InteractionRequestStringResolver")
  var comDotsunDotstarDottaskDotInteractionRequestStringResolver: InteractionRequestStringResolver
  @JSName("com.sun.star.task.Job")
  var comDotsunDotstarDottaskDotJob: Job
  @JSName("com.sun.star.task.JobExecutor")
  var comDotsunDotstarDottaskDotJobExecutor: JobExecutor
  @JSName("com.sun.star.task.PasswordContainer")
  var comDotsunDotstarDottaskDotPasswordContainer: PasswordContainer
  @JSName("com.sun.star.task.PasswordContainerInteractionHandler")
  var comDotsunDotstarDottaskDotPasswordContainerInteractionHandler: PasswordContainerInteractionHandler
  @JSName("com.sun.star.task.StatusIndicatorFactory")
  var comDotsunDotstarDottaskDotStatusIndicatorFactory: StatusIndicatorFactory
  @JSName("com.sun.star.text.AccessibleEndnoteView")
  var comDotsunDotstarDottextDotAccessibleEndnoteView: AccessibleEndnoteView
  @JSName("com.sun.star.text.AccessibleFootnoteView")
  var comDotsunDotstarDottextDotAccessibleFootnoteView: AccessibleFootnoteView
  @JSName("com.sun.star.text.AccessibleHeaderFooterView")
  var comDotsunDotstarDottextDotAccessibleHeaderFooterView: AccessibleHeaderFooterView
  @JSName("com.sun.star.text.AccessiblePageView")
  var comDotsunDotstarDottextDotAccessiblePageView: AccessiblePageView
  @JSName("com.sun.star.text.AccessibleParagraphView")
  var comDotsunDotstarDottextDotAccessibleParagraphView: AccessibleParagraphView
  @JSName("com.sun.star.text.AccessibleTextDocumentPageView")
  var comDotsunDotstarDottextDotAccessibleTextDocumentPageView: AccessibleTextDocumentPageView
  @JSName("com.sun.star.text.AccessibleTextDocumentView")
  var comDotsunDotstarDottextDotAccessibleTextDocumentView: AccessibleTextDocumentView
  @JSName("com.sun.star.text.AccessibleTextEmbeddedObject")
  var comDotsunDotstarDottextDotAccessibleTextEmbeddedObject: AccessibleTextEmbeddedObject
  @JSName("com.sun.star.text.AccessibleTextFrameView")
  var comDotsunDotstarDottextDotAccessibleTextFrameView: AccessibleTextFrameView
  @JSName("com.sun.star.text.AccessibleTextGraphicObject")
  var comDotsunDotstarDottextDotAccessibleTextGraphicObject: AccessibleTextGraphicObject
  @JSName("com.sun.star.text.AutoTextContainer")
  var comDotsunDotstarDottextDotAutoTextContainer: AutoTextContainer
  @JSName("com.sun.star.text.AutoTextEntry")
  var comDotsunDotstarDottextDotAutoTextEntry: AutoTextEntry
  @JSName("com.sun.star.text.AutoTextGroup")
  var comDotsunDotstarDottextDotAutoTextGroup: AutoTextGroup
  @JSName("com.sun.star.text.BaseFrame")
  var comDotsunDotstarDottextDotBaseFrame: BaseFrame
  @JSName("com.sun.star.text.BaseFrameProperties")
  var comDotsunDotstarDottextDotBaseFrameProperties: BaseFrameProperties
  @JSName("com.sun.star.text.BaseIndex")
  var comDotsunDotstarDottextDotBaseIndex: BaseIndex
  @JSName("com.sun.star.text.BaseIndexMark")
  var comDotsunDotstarDottextDotBaseIndexMark: BaseIndexMark
  @JSName("com.sun.star.text.Bibliography")
  var comDotsunDotstarDottextDotBibliography: typingsSlinky.activexLibreoffice.com_.sun.star.text.Bibliography
  @JSName("com.sun.star.text.Bookmark")
  var comDotsunDotstarDottextDotBookmark: Bookmark
  @JSName("com.sun.star.text.Bookmarks")
  var comDotsunDotstarDottextDotBookmarks: Bookmarks
  @JSName("com.sun.star.text.Cell")
  var comDotsunDotstarDottextDotCell: typingsSlinky.activexLibreoffice.com_.sun.star.text.Cell
  @JSName("com.sun.star.text.CellProperties")
  var comDotsunDotstarDottextDotCellProperties: typingsSlinky.activexLibreoffice.com_.sun.star.text.CellProperties
  @JSName("com.sun.star.text.CellRange")
  var comDotsunDotstarDottextDotCellRange: typingsSlinky.activexLibreoffice.com_.sun.star.text.CellRange
  @JSName("com.sun.star.text.ChainedTextFrame")
  var comDotsunDotstarDottextDotChainedTextFrame: ChainedTextFrame
  @JSName("com.sun.star.text.ChapterNumberingRule")
  var comDotsunDotstarDottextDotChapterNumberingRule: ChapterNumberingRule
  @JSName("com.sun.star.text.ContentIndex")
  var comDotsunDotstarDottextDotContentIndex: ContentIndex
  @JSName("com.sun.star.text.ContentIndexMark")
  var comDotsunDotstarDottextDotContentIndexMark: ContentIndexMark
  @JSName("com.sun.star.text.DefaultNumberingProvider")
  var comDotsunDotstarDottextDotDefaultNumberingProvider: DefaultNumberingProvider
  @JSName("com.sun.star.text.Defaults")
  var comDotsunDotstarDottextDotDefaults: typingsSlinky.activexLibreoffice.com_.sun.star.text.Defaults
  @JSName("com.sun.star.text.DependentTextField")
  var comDotsunDotstarDottextDotDependentTextField: DependentTextField
  @JSName("com.sun.star.text.DocumentIndex")
  var comDotsunDotstarDottextDotDocumentIndex: DocumentIndex
  @JSName("com.sun.star.text.DocumentIndexLevelFormat")
  var comDotsunDotstarDottextDotDocumentIndexLevelFormat: DocumentIndexLevelFormat
  @JSName("com.sun.star.text.DocumentIndexMark")
  var comDotsunDotstarDottextDotDocumentIndexMark: DocumentIndexMark
  @JSName("com.sun.star.text.DocumentIndexMarkAsian")
  var comDotsunDotstarDottextDotDocumentIndexMarkAsian: DocumentIndexMarkAsian
  @JSName("com.sun.star.text.DocumentIndexParagraphStyles")
  var comDotsunDotstarDottextDotDocumentIndexParagraphStyles: DocumentIndexParagraphStyles
  @JSName("com.sun.star.text.DocumentIndexes")
  var comDotsunDotstarDottextDotDocumentIndexes: DocumentIndexes
  @JSName("com.sun.star.text.DocumentSettings")
  var comDotsunDotstarDottextDotDocumentSettings: typingsSlinky.activexLibreoffice.com_.sun.star.text.DocumentSettings
  @JSName("com.sun.star.text.Endnote")
  var comDotsunDotstarDottextDotEndnote: Endnote
  @JSName("com.sun.star.text.EndnoteSettings")
  var comDotsunDotstarDottextDotEndnoteSettings: EndnoteSettings
  @JSName("com.sun.star.text.Footnote")
  var comDotsunDotstarDottextDotFootnote: Footnote
  @JSName("com.sun.star.text.FootnoteSettings")
  var comDotsunDotstarDottextDotFootnoteSettings: FootnoteSettings
  @JSName("com.sun.star.text.Footnotes")
  var comDotsunDotstarDottextDotFootnotes: Footnotes
  @JSName("com.sun.star.text.GenericTextDocument")
  var comDotsunDotstarDottextDotGenericTextDocument: GenericTextDocument
  @JSName("com.sun.star.text.GlobalDocument")
  var comDotsunDotstarDottextDotGlobalDocument: GlobalDocument
  @JSName("com.sun.star.text.GlobalSettings")
  var comDotsunDotstarDottextDotGlobalSettings: GlobalSettings
  @JSName("com.sun.star.text.IllustrationsIndex")
  var comDotsunDotstarDottextDotIllustrationsIndex: IllustrationsIndex
  @JSName("com.sun.star.text.InContentMetadata")
  var comDotsunDotstarDottextDotInContentMetadata: InContentMetadata
  @JSName("com.sun.star.text.LineNumberingProperties")
  var comDotsunDotstarDottextDotLineNumberingProperties: LineNumberingProperties
  @JSName("com.sun.star.text.MailMerge")
  var comDotsunDotstarDottextDotMailMerge: MailMerge
  @JSName("com.sun.star.text.ModuleDispatcher")
  var comDotsunDotstarDottextDotModuleDispatcher: typingsSlinky.activexLibreoffice.com_.sun.star.text.ModuleDispatcher
  @JSName("com.sun.star.text.NumberingLevel")
  var comDotsunDotstarDottextDotNumberingLevel: typingsSlinky.activexLibreoffice.com_.sun.star.text.NumberingLevel
  @JSName("com.sun.star.text.NumberingRules")
  var comDotsunDotstarDottextDotNumberingRules: NumberingRules
  @JSName("com.sun.star.text.NumberingStyle")
  var comDotsunDotstarDottextDotNumberingStyle: NumberingStyle
  @JSName("com.sun.star.text.ObjectIndex")
  var comDotsunDotstarDottextDotObjectIndex: ObjectIndex
  @JSName("com.sun.star.text.PageFootnoteInfo")
  var comDotsunDotstarDottextDotPageFootnoteInfo: PageFootnoteInfo
  @JSName("com.sun.star.text.PagePrintSettings")
  var comDotsunDotstarDottextDotPagePrintSettings: PagePrintSettings
  @JSName("com.sun.star.text.Paragraph")
  var comDotsunDotstarDottextDotParagraph: Paragraph
  @JSName("com.sun.star.text.ParagraphEnumeration")
  var comDotsunDotstarDottextDotParagraphEnumeration: ParagraphEnumeration
  @JSName("com.sun.star.text.PrintSettings")
  var comDotsunDotstarDottextDotPrintSettings: PrintSettings
  @JSName("com.sun.star.text.RedlinePortion")
  var comDotsunDotstarDottextDotRedlinePortion: RedlinePortion
  @JSName("com.sun.star.text.ReferenceMark")
  var comDotsunDotstarDottextDotReferenceMark: ReferenceMark
  @JSName("com.sun.star.text.ReferenceMarks")
  var comDotsunDotstarDottextDotReferenceMarks: ReferenceMarks
  @JSName("com.sun.star.text.Shape")
  var comDotsunDotstarDottextDotShape: typingsSlinky.activexLibreoffice.com_.sun.star.text.Shape
  @JSName("com.sun.star.text.TableColumns")
  var comDotsunDotstarDottextDotTableColumns: typingsSlinky.activexLibreoffice.com_.sun.star.text.TableColumns
  @JSName("com.sun.star.text.TableIndex")
  var comDotsunDotstarDottextDotTableIndex: TableIndex
  @JSName("com.sun.star.text.TableRows")
  var comDotsunDotstarDottextDotTableRows: typingsSlinky.activexLibreoffice.com_.sun.star.text.TableRows
  @JSName("com.sun.star.text.Text")
  var comDotsunDotstarDottextDotText: typingsSlinky.activexLibreoffice.com_.sun.star.text.Text
  @JSName("com.sun.star.text.TextColumns")
  var comDotsunDotstarDottextDotTextColumns: TextColumns
  @JSName("com.sun.star.text.TextContent")
  var comDotsunDotstarDottextDotTextContent: TextContent
  @JSName("com.sun.star.text.TextContentCollection")
  var comDotsunDotstarDottextDotTextContentCollection: TextContentCollection
  @JSName("com.sun.star.text.TextCursor")
  var comDotsunDotstarDottextDotTextCursor: TextCursor
  @JSName("com.sun.star.text.TextDocument")
  var comDotsunDotstarDottextDotTextDocument: TextDocument
  @JSName("com.sun.star.text.TextDocumentView")
  var comDotsunDotstarDottextDotTextDocumentView: TextDocumentView
  @JSName("com.sun.star.text.TextEmbeddedObject")
  var comDotsunDotstarDottextDotTextEmbeddedObject: TextEmbeddedObject
  @JSName("com.sun.star.text.TextEmbeddedObjects")
  var comDotsunDotstarDottextDotTextEmbeddedObjects: TextEmbeddedObjects
  @JSName("com.sun.star.text.TextField")
  var comDotsunDotstarDottextDotTextField: TextField_
  @JSName("com.sun.star.text.TextFieldEnumeration")
  var comDotsunDotstarDottextDotTextFieldEnumeration: TextFieldEnumeration
  @JSName("com.sun.star.text.TextFieldMaster")
  var comDotsunDotstarDottextDotTextFieldMaster: TextFieldMaster
  @JSName("com.sun.star.text.TextFieldMasters")
  var comDotsunDotstarDottextDotTextFieldMasters: TextFieldMasters
  @JSName("com.sun.star.text.TextFields")
  var comDotsunDotstarDottextDotTextFields: TextFields
  @JSName("com.sun.star.text.TextFrame")
  var comDotsunDotstarDottextDotTextFrame: TextFrame
  @JSName("com.sun.star.text.TextFrames")
  var comDotsunDotstarDottextDotTextFrames: TextFrames
  @JSName("com.sun.star.text.TextGraphicObject")
  var comDotsunDotstarDottextDotTextGraphicObject: TextGraphicObject
  @JSName("com.sun.star.text.TextGraphicObjects")
  var comDotsunDotstarDottextDotTextGraphicObjects: TextGraphicObjects
  @JSName("com.sun.star.text.TextLayoutCursor")
  var comDotsunDotstarDottextDotTextLayoutCursor: TextLayoutCursor
  @JSName("com.sun.star.text.TextPageStyle")
  var comDotsunDotstarDottextDotTextPageStyle: TextPageStyle
  @JSName("com.sun.star.text.TextPortion")
  var comDotsunDotstarDottextDotTextPortion: TextPortion
  @JSName("com.sun.star.text.TextPortionEnumeration")
  var comDotsunDotstarDottextDotTextPortionEnumeration: TextPortionEnumeration
  @JSName("com.sun.star.text.TextRange")
  var comDotsunDotstarDottextDotTextRange: TextRange
  @JSName("com.sun.star.text.TextRangeContentProperties")
  var comDotsunDotstarDottextDotTextRangeContentProperties: TextRangeContentProperties
  @JSName("com.sun.star.text.TextRanges")
  var comDotsunDotstarDottextDotTextRanges: TextRanges
  @JSName("com.sun.star.text.TextSection")
  var comDotsunDotstarDottextDotTextSection: TextSection
  @JSName("com.sun.star.text.TextSections")
  var comDotsunDotstarDottextDotTextSections: TextSections
  @JSName("com.sun.star.text.TextSortDescriptor")
  var comDotsunDotstarDottextDotTextSortDescriptor: TextSortDescriptor
  @JSName("com.sun.star.text.TextSortDescriptor2")
  var comDotsunDotstarDottextDotTextSortDescriptor2: TextSortDescriptor2
  @JSName("com.sun.star.text.TextSortable")
  var comDotsunDotstarDottextDotTextSortable: TextSortable
  @JSName("com.sun.star.text.TextTable")
  var comDotsunDotstarDottextDotTextTable: TextTable
  @JSName("com.sun.star.text.TextTableCursor")
  var comDotsunDotstarDottextDotTextTableCursor: TextTableCursor
  @JSName("com.sun.star.text.TextTableRow")
  var comDotsunDotstarDottextDotTextTableRow: TextTableRow
  @JSName("com.sun.star.text.TextTables")
  var comDotsunDotstarDottextDotTextTables: TextTables
  @JSName("com.sun.star.text.TextViewCursor")
  var comDotsunDotstarDottextDotTextViewCursor: TextViewCursor
  @JSName("com.sun.star.text.UserDefinedIndex")
  var comDotsunDotstarDottextDotUserDefinedIndex: UserDefinedIndex
  @JSName("com.sun.star.text.UserIndex")
  var comDotsunDotstarDottextDotUserIndex: UserIndex
  @JSName("com.sun.star.text.UserIndexMark")
  var comDotsunDotstarDottextDotUserIndexMark: UserIndexMark
  @JSName("com.sun.star.text.ViewSettings")
  var comDotsunDotstarDottextDotViewSettings: ViewSettings
  @JSName("com.sun.star.text.WebDocument")
  var comDotsunDotstarDottextDotWebDocument: WebDocument
  @JSName("com.sun.star.text.fieldmaster.Bibliography")
  var comDotsunDotstarDottextDotfieldmasterDotBibliography: typingsSlinky.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography
  @JSName("com.sun.star.text.fieldmaster.DDE")
  var comDotsunDotstarDottextDotfieldmasterDotDDE: DDE
  @JSName("com.sun.star.text.fieldmaster.Database")
  var comDotsunDotstarDottextDotfieldmasterDotDatabase: Database
  @JSName("com.sun.star.text.fieldmaster.SetExpression")
  var comDotsunDotstarDottextDotfieldmasterDotSetExpression: SetExpression
  @JSName("com.sun.star.text.fieldmaster.User")
  var comDotsunDotstarDottextDotfieldmasterDotUser: typingsSlinky.activexLibreoffice.com_.sun.star.text.fieldmaster.User
  @JSName("com.sun.star.text.textfield.Annotation")
  var comDotsunDotstarDottextDottextfieldDotAnnotation: Annotation
  @JSName("com.sun.star.text.textfield.Author")
  var comDotsunDotstarDottextDottextfieldDotAuthor: Author
  @JSName("com.sun.star.text.textfield.Bibliography")
  var comDotsunDotstarDottextDottextfieldDotBibliography: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Bibliography
  @JSName("com.sun.star.text.textfield.Chapter")
  var comDotsunDotstarDottextDottextfieldDotChapter: Chapter
  @JSName("com.sun.star.text.textfield.CharacterCount")
  var comDotsunDotstarDottextDottextfieldDotCharacterCount: CharacterCount
  @JSName("com.sun.star.text.textfield.CombinedCharacters")
  var comDotsunDotstarDottextDottextfieldDotCombinedCharacters: CombinedCharacters
  @JSName("com.sun.star.text.textfield.ConditionalText")
  var comDotsunDotstarDottextDottextfieldDotConditionalText: ConditionalText
  @JSName("com.sun.star.text.textfield.DDE")
  var comDotsunDotstarDottextDottextfieldDotDDE: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DDE
  @JSName("com.sun.star.text.textfield.Database")
  var comDotsunDotstarDottextDottextfieldDotDatabase: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.Database
  @JSName("com.sun.star.text.textfield.DatabaseName")
  var comDotsunDotstarDottextDottextfieldDotDatabaseName: DatabaseName
  @JSName("com.sun.star.text.textfield.DatabaseNextSet")
  var comDotsunDotstarDottextDottextfieldDotDatabaseNextSet: DatabaseNextSet
  @JSName("com.sun.star.text.textfield.DatabaseNumberOfSet")
  var comDotsunDotstarDottextDottextfieldDotDatabaseNumberOfSet: DatabaseNumberOfSet
  @JSName("com.sun.star.text.textfield.DatabaseSetNumber")
  var comDotsunDotstarDottextDottextfieldDotDatabaseSetNumber: DatabaseSetNumber
  @JSName("com.sun.star.text.textfield.DateTime")
  var comDotsunDotstarDottextDottextfieldDotDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.DateTime
  @JSName("com.sun.star.text.textfield.DropDown")
  var comDotsunDotstarDottextDottextfieldDotDropDown: DropDown
  @JSName("com.sun.star.text.textfield.EmbeddedObjectCount")
  var comDotsunDotstarDottextDottextfieldDotEmbeddedObjectCount: EmbeddedObjectCount
  @JSName("com.sun.star.text.textfield.ExtendedUser")
  var comDotsunDotstarDottextDottextfieldDotExtendedUser: ExtendedUser
  @JSName("com.sun.star.text.textfield.FileName")
  var comDotsunDotstarDottextDottextfieldDotFileName: FileName
  @JSName("com.sun.star.text.textfield.GetExpression")
  var comDotsunDotstarDottextDottextfieldDotGetExpression: GetExpression
  @JSName("com.sun.star.text.textfield.GetReference")
  var comDotsunDotstarDottextDottextfieldDotGetReference: GetReference
  @JSName("com.sun.star.text.textfield.GraphicObjectCount")
  var comDotsunDotstarDottextDottextfieldDotGraphicObjectCount: GraphicObjectCount
  @JSName("com.sun.star.text.textfield.HiddenParagraph")
  var comDotsunDotstarDottextDottextfieldDotHiddenParagraph: HiddenParagraph
  @JSName("com.sun.star.text.textfield.HiddenText")
  var comDotsunDotstarDottextDottextfieldDotHiddenText: HiddenText
  @JSName("com.sun.star.text.textfield.Input")
  var comDotsunDotstarDottextDottextfieldDotInput: Input
  @JSName("com.sun.star.text.textfield.InputUser")
  var comDotsunDotstarDottextDottextfieldDotInputUser: InputUser
  @JSName("com.sun.star.text.textfield.JumpEdit")
  var comDotsunDotstarDottextDottextfieldDotJumpEdit: JumpEdit
  @JSName("com.sun.star.text.textfield.Macro")
  var comDotsunDotstarDottextDottextfieldDotMacro: Macro
  @JSName("com.sun.star.text.textfield.MetadataField")
  var comDotsunDotstarDottextDottextfieldDotMetadataField: MetadataField
  @JSName("com.sun.star.text.textfield.PageCount")
  var comDotsunDotstarDottextDottextfieldDotPageCount: PageCount
  @JSName("com.sun.star.text.textfield.PageNumber")
  var comDotsunDotstarDottextDottextfieldDotPageNumber: PageNumber
  @JSName("com.sun.star.text.textfield.ParagraphCount")
  var comDotsunDotstarDottextDottextfieldDotParagraphCount: ParagraphCount
  @JSName("com.sun.star.text.textfield.ReferencePageGet")
  var comDotsunDotstarDottextDottextfieldDotReferencePageGet: ReferencePageGet
  @JSName("com.sun.star.text.textfield.ReferencePageSet")
  var comDotsunDotstarDottextDottextfieldDotReferencePageSet: ReferencePageSet
  @JSName("com.sun.star.text.textfield.Script")
  var comDotsunDotstarDottextDottextfieldDotScript: Script
  @JSName("com.sun.star.text.textfield.SetExpression")
  var comDotsunDotstarDottextDottextfieldDotSetExpression: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.SetExpression
  @JSName("com.sun.star.text.textfield.TableCount")
  var comDotsunDotstarDottextDottextfieldDotTableCount: TableCount
  @JSName("com.sun.star.text.textfield.TableFormula")
  var comDotsunDotstarDottextDottextfieldDotTableFormula: TableFormula
  @JSName("com.sun.star.text.textfield.TemplateName")
  var comDotsunDotstarDottextDottextfieldDotTemplateName: TemplateName
  @JSName("com.sun.star.text.textfield.URL")
  var comDotsunDotstarDottextDottextfieldDotURL: URL
  @JSName("com.sun.star.text.textfield.User")
  var comDotsunDotstarDottextDottextfieldDotUser: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.User
  @JSName("com.sun.star.text.textfield.WordCount")
  var comDotsunDotstarDottextDottextfieldDotWordCount: WordCount
  @JSName("com.sun.star.text.textfield.docinfo.ChangeAuthor")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotChangeAuthor: ChangeAuthor
  @JSName("com.sun.star.text.textfield.docinfo.ChangeDateTime")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotChangeDateTime: ChangeDateTime
  @JSName("com.sun.star.text.textfield.docinfo.CreateAuthor")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotCreateAuthor: CreateAuthor
  @JSName("com.sun.star.text.textfield.docinfo.CreateDateTime")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotCreateDateTime: CreateDateTime
  @JSName("com.sun.star.text.textfield.docinfo.Custom")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotCustom: Custom
  @JSName("com.sun.star.text.textfield.docinfo.Description")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotDescription: Description
  @JSName("com.sun.star.text.textfield.docinfo.EditTime")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotEditTime: EditTime
  @JSName("com.sun.star.text.textfield.docinfo.Keywords")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotKeywords: Keywords
  @JSName("com.sun.star.text.textfield.docinfo.PrintAuthor")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotPrintAuthor: PrintAuthor
  @JSName("com.sun.star.text.textfield.docinfo.PrintDateTime")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotPrintDateTime: PrintDateTime
  @JSName("com.sun.star.text.textfield.docinfo.Revision")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotRevision: Revision
  @JSName("com.sun.star.text.textfield.docinfo.Subject")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotSubject: Subject
  @JSName("com.sun.star.text.textfield.docinfo.Title")
  var comDotsunDotstarDottextDottextfieldDotdocinfoDotTitle: typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield.docinfo.Title
  @JSName("com.sun.star.ucb.AnyCompareFactory")
  var comDotsunDotstarDotucbDotAnyCompareFactory: AnyCompareFactory
  @JSName("com.sun.star.ucb.CachedContentResultSet")
  var comDotsunDotstarDotucbDotCachedContentResultSet: CachedContentResultSet
  @JSName("com.sun.star.ucb.CachedContentResultSetFactory")
  var comDotsunDotstarDotucbDotCachedContentResultSetFactory: CachedContentResultSetFactory
  @JSName("com.sun.star.ucb.CachedContentResultSetStub")
  var comDotsunDotstarDotucbDotCachedContentResultSetStub: CachedContentResultSetStub
  @JSName("com.sun.star.ucb.CachedContentResultSetStubFactory")
  var comDotsunDotstarDotucbDotCachedContentResultSetStubFactory: CachedContentResultSetStubFactory
  @JSName("com.sun.star.ucb.CachedDynamicResultSet")
  var comDotsunDotstarDotucbDotCachedDynamicResultSet: CachedDynamicResultSet
  @JSName("com.sun.star.ucb.CachedDynamicResultSetFactory")
  var comDotsunDotstarDotucbDotCachedDynamicResultSetFactory: CachedDynamicResultSetFactory
  @JSName("com.sun.star.ucb.CachedDynamicResultSetStub")
  var comDotsunDotstarDotucbDotCachedDynamicResultSetStub: CachedDynamicResultSetStub
  @JSName("com.sun.star.ucb.CachedDynamicResultSetStubFactory")
  var comDotsunDotstarDotucbDotCachedDynamicResultSetStubFactory: CachedDynamicResultSetStubFactory
  @JSName("com.sun.star.ucb.CmisContentProvider")
  var comDotsunDotstarDotucbDotCmisContentProvider: CmisContentProvider
  @JSName("com.sun.star.ucb.CommandEnvironment")
  var comDotsunDotstarDotucbDotCommandEnvironment: CommandEnvironment
  @JSName("com.sun.star.ucb.Content")
  var comDotsunDotstarDotucbDotContent: Content
  @JSName("com.sun.star.ucb.ContentProvider")
  var comDotsunDotstarDotucbDotContentProvider: ContentProvider
  @JSName("com.sun.star.ucb.ContentProviderProxy")
  var comDotsunDotstarDotucbDotContentProviderProxy: ContentProviderProxy
  @JSName("com.sun.star.ucb.ContentProviderProxyFactory")
  var comDotsunDotstarDotucbDotContentProviderProxyFactory: ContentProviderProxyFactory
  @JSName("com.sun.star.ucb.ContentResultSet")
  var comDotsunDotstarDotucbDotContentResultSet: ContentResultSet
  @JSName("com.sun.star.ucb.ContentTransmitter")
  var comDotsunDotstarDotucbDotContentTransmitter: ContentTransmitter
  @JSName("com.sun.star.ucb.DefaultHierarchyDataSource")
  var comDotsunDotstarDotucbDotDefaultHierarchyDataSource: DefaultHierarchyDataSource
  @JSName("com.sun.star.ucb.DynamicResultSet")
  var comDotsunDotstarDotucbDotDynamicResultSet: DynamicResultSet
  @JSName("com.sun.star.ucb.ExpandContentProvider")
  var comDotsunDotstarDotucbDotExpandContentProvider: ExpandContentProvider
  @JSName("com.sun.star.ucb.FTPContent")
  var comDotsunDotstarDotucbDotFTPContent: FTPContent
  @JSName("com.sun.star.ucb.FTPContentProvider")
  var comDotsunDotstarDotucbDotFTPContentProvider: FTPContentProvider
  @JSName("com.sun.star.ucb.FileContent")
  var comDotsunDotstarDotucbDotFileContent: FileContent
  @JSName("com.sun.star.ucb.FileContentProvider")
  var comDotsunDotstarDotucbDotFileContentProvider: FileContentProvider
  @JSName("com.sun.star.ucb.GIOContentProvider")
  var comDotsunDotstarDotucbDotGIOContentProvider: GIOContentProvider
  @JSName("com.sun.star.ucb.GnomeVFSContentProvider")
  var comDotsunDotstarDotucbDotGnomeVFSContentProvider: GnomeVFSContentProvider
  @JSName("com.sun.star.ucb.GnomeVFSDocumentContent")
  var comDotsunDotstarDotucbDotGnomeVFSDocumentContent: GnomeVFSDocumentContent
  @JSName("com.sun.star.ucb.GnomeVFSFolderContent")
  var comDotsunDotstarDotucbDotGnomeVFSFolderContent: GnomeVFSFolderContent
  @JSName("com.sun.star.ucb.HelpContent")
  var comDotsunDotstarDotucbDotHelpContent: HelpContent
  @JSName("com.sun.star.ucb.HelpContentProvider")
  var comDotsunDotstarDotucbDotHelpContentProvider: HelpContentProvider
  @JSName("com.sun.star.ucb.HierarchyContentProvider")
  var comDotsunDotstarDotucbDotHierarchyContentProvider: HierarchyContentProvider
  @JSName("com.sun.star.ucb.HierarchyDataReadAccess")
  var comDotsunDotstarDotucbDotHierarchyDataReadAccess: HierarchyDataReadAccess
  @JSName("com.sun.star.ucb.HierarchyDataReadWriteAccess")
  var comDotsunDotstarDotucbDotHierarchyDataReadWriteAccess: HierarchyDataReadWriteAccess
  @JSName("com.sun.star.ucb.HierarchyDataSource")
  var comDotsunDotstarDotucbDotHierarchyDataSource: HierarchyDataSource
  @JSName("com.sun.star.ucb.HierarchyFolderContent")
  var comDotsunDotstarDotucbDotHierarchyFolderContent: HierarchyFolderContent
  @JSName("com.sun.star.ucb.HierarchyLinkContent")
  var comDotsunDotstarDotucbDotHierarchyLinkContent: HierarchyLinkContent
  @JSName("com.sun.star.ucb.HierarchyRootFolderContent")
  var comDotsunDotstarDotucbDotHierarchyRootFolderContent: HierarchyRootFolderContent
  @JSName("com.sun.star.ucb.ODMAContent")
  var comDotsunDotstarDotucbDotODMAContent: ODMAContent
  @JSName("com.sun.star.ucb.ODMAContentProvider")
  var comDotsunDotstarDotucbDotODMAContentProvider: ODMAContentProvider
  @JSName("com.sun.star.ucb.PackageContentProvider")
  var comDotsunDotstarDotucbDotPackageContentProvider: PackageContentProvider
  @JSName("com.sun.star.ucb.PackageFolderContent")
  var comDotsunDotstarDotucbDotPackageFolderContent: PackageFolderContent
  @JSName("com.sun.star.ucb.PackageStreamContent")
  var comDotsunDotstarDotucbDotPackageStreamContent: PackageStreamContent
  @JSName("com.sun.star.ucb.PersistentPropertySet")
  var comDotsunDotstarDotucbDotPersistentPropertySet: PersistentPropertySet
  @JSName("com.sun.star.ucb.PropertiesManager")
  var comDotsunDotstarDotucbDotPropertiesManager: PropertiesManager
  @JSName("com.sun.star.ucb.PropertySetRegistry")
  var comDotsunDotstarDotucbDotPropertySetRegistry: PropertySetRegistry
  @JSName("com.sun.star.ucb.RemoteAccessContentProvider")
  var comDotsunDotstarDotucbDotRemoteAccessContentProvider: RemoteAccessContentProvider
  @JSName("com.sun.star.ucb.RemoteContentProviderAcceptor")
  var comDotsunDotstarDotucbDotRemoteContentProviderAcceptor: RemoteContentProviderAcceptor
  @JSName("com.sun.star.ucb.RemoteProxyContentProvider")
  var comDotsunDotstarDotucbDotRemoteProxyContentProvider: RemoteProxyContentProvider
  @JSName("com.sun.star.ucb.SimpleFileAccess")
  var comDotsunDotstarDotucbDotSimpleFileAccess: SimpleFileAccess
  @JSName("com.sun.star.ucb.SortedDynamicResultSetFactory")
  var comDotsunDotstarDotucbDotSortedDynamicResultSetFactory: SortedDynamicResultSetFactory
  @JSName("com.sun.star.ucb.Store")
  var comDotsunDotstarDotucbDotStore: Store
  @JSName("com.sun.star.ucb.TransientDocumentsContentProvider")
  var comDotsunDotstarDotucbDotTransientDocumentsContentProvider: TransientDocumentsContentProvider
  @JSName("com.sun.star.ucb.TransientDocumentsDocumentContent")
  var comDotsunDotstarDotucbDotTransientDocumentsDocumentContent: TransientDocumentsDocumentContent
  @JSName("com.sun.star.ucb.TransientDocumentsFolderContent")
  var comDotsunDotstarDotucbDotTransientDocumentsFolderContent: TransientDocumentsFolderContent
  @JSName("com.sun.star.ucb.TransientDocumentsRootContent")
  var comDotsunDotstarDotucbDotTransientDocumentsRootContent: TransientDocumentsRootContent
  @JSName("com.sun.star.ucb.TransientDocumentsStreamContent")
  var comDotsunDotstarDotucbDotTransientDocumentsStreamContent: TransientDocumentsStreamContent
  @JSName("com.sun.star.ucb.UniversalContentBroker")
  var comDotsunDotstarDotucbDotUniversalContentBroker: UniversalContentBroker
  @JSName("com.sun.star.ucb.WebDAVContentProvider")
  var comDotsunDotstarDotucbDotWebDAVContentProvider: WebDAVContentProvider
  @JSName("com.sun.star.ucb.WebDAVDocumentContent")
  var comDotsunDotstarDotucbDotWebDAVDocumentContent: WebDAVDocumentContent
  @JSName("com.sun.star.ucb.WebDAVFolderContent")
  var comDotsunDotstarDotucbDotWebDAVFolderContent: WebDAVFolderContent
  @JSName("com.sun.star.ui.ActionTrigger")
  var comDotsunDotstarDotuiDotActionTrigger: ActionTrigger
  @JSName("com.sun.star.ui.ActionTriggerContainer")
  var comDotsunDotstarDotuiDotActionTriggerContainer: ActionTriggerContainer
  @JSName("com.sun.star.ui.ActionTriggerSeparator")
  var comDotsunDotstarDotuiDotActionTriggerSeparator: ActionTriggerSeparator
  @JSName("com.sun.star.ui.AddressBookSourceDialog")
  var comDotsunDotstarDotuiDotAddressBookSourceDialog: AddressBookSourceDialog
  @JSName("com.sun.star.ui.ConfigurableUIElement")
  var comDotsunDotstarDotuiDotConfigurableUIElement: ConfigurableUIElement
  @JSName("com.sun.star.ui.DocumentAcceleratorConfiguration")
  var comDotsunDotstarDotuiDotDocumentAcceleratorConfiguration: DocumentAcceleratorConfiguration
  @JSName("com.sun.star.ui.GlobalAcceleratorConfiguration")
  var comDotsunDotstarDotuiDotGlobalAcceleratorConfiguration: GlobalAcceleratorConfiguration
  @JSName("com.sun.star.ui.ImageManager")
  var comDotsunDotstarDotuiDotImageManager: ImageManager
  @JSName("com.sun.star.ui.ItemDescriptor")
  var comDotsunDotstarDotuiDotItemDescriptor: ItemDescriptor
  @JSName("com.sun.star.ui.ModuleAcceleratorConfiguration")
  var comDotsunDotstarDotuiDotModuleAcceleratorConfiguration: ModuleAcceleratorConfiguration
  @JSName("com.sun.star.ui.ModuleUICategoryDescription")
  var comDotsunDotstarDotuiDotModuleUICategoryDescription: ModuleUICategoryDescription
  @JSName("com.sun.star.ui.ModuleUICommandDescription")
  var comDotsunDotstarDotuiDotModuleUICommandDescription: ModuleUICommandDescription
  @JSName("com.sun.star.ui.ModuleUIConfigurationManager")
  var comDotsunDotstarDotuiDotModuleUIConfigurationManager: ModuleUIConfigurationManager
  @JSName("com.sun.star.ui.ModuleWindowStateConfiguration")
  var comDotsunDotstarDotuiDotModuleWindowStateConfiguration: ModuleWindowStateConfiguration
  @JSName("com.sun.star.ui.UICategoryDescription")
  var comDotsunDotstarDotuiDotUICategoryDescription: UICategoryDescription
  @JSName("com.sun.star.ui.UIConfigurationManager")
  var comDotsunDotstarDotuiDotUIConfigurationManager: UIConfigurationManager
  @JSName("com.sun.star.ui.UIElement")
  var comDotsunDotstarDotuiDotUIElement: UIElement
  @JSName("com.sun.star.ui.UIElementFactory")
  var comDotsunDotstarDotuiDotUIElementFactory: UIElementFactory
  @JSName("com.sun.star.ui.UIElementFactoryManager")
  var comDotsunDotstarDotuiDotUIElementFactoryManager: UIElementFactoryManager
  @JSName("com.sun.star.ui.UIElementSettings")
  var comDotsunDotstarDotuiDotUIElementSettings: UIElementSettings
  @JSName("com.sun.star.ui.WindowContentFactory")
  var comDotsunDotstarDotuiDotWindowContentFactory: WindowContentFactory
  @JSName("com.sun.star.ui.WindowContentFactoryManager")
  var comDotsunDotstarDotuiDotWindowContentFactoryManager: WindowContentFactoryManager
  @JSName("com.sun.star.ui.WindowStateConfiguration")
  var comDotsunDotstarDotuiDotWindowStateConfiguration: WindowStateConfiguration
  @JSName("com.sun.star.ui.dialogs.AddressBookSourcePilot")
  var comDotsunDotstarDotuiDotdialogsDotAddressBookSourcePilot: AddressBookSourcePilot
  @JSName("com.sun.star.ui.dialogs.FilePicker")
  var comDotsunDotstarDotuiDotdialogsDotFilePicker: FilePicker
  @JSName("com.sun.star.ui.dialogs.FilterOptionsDialog")
  var comDotsunDotstarDotuiDotdialogsDotFilterOptionsDialog: FilterOptionsDialog
  @JSName("com.sun.star.ui.dialogs.FolderPicker")
  var comDotsunDotstarDotuiDotdialogsDotFolderPicker: FolderPicker
  @JSName("com.sun.star.ui.dialogs.Wizard")
  var comDotsunDotstarDotuiDotdialogsDotWizard: Wizard
  @JSName("com.sun.star.ui.dialogs.XSLTFilterDialog")
  var comDotsunDotstarDotuiDotdialogsDotXSLTFilterDialog: XSLTFilterDialog
  @JSName("com.sun.star.ui.test.UITest")
  var comDotsunDotstarDotuiDottestDotUITest: UITest
  @JSName("com.sun.star.uno.NamingService")
  var comDotsunDotstarDotunoDotNamingService: NamingService
  @JSName("com.sun.star.uri.ExternalUriReferenceTranslator")
  var comDotsunDotstarDoturiDotExternalUriReferenceTranslator: ExternalUriReferenceTranslator
  @JSName("com.sun.star.uri.UriReferenceFactory")
  var comDotsunDotstarDoturiDotUriReferenceFactory: UriReferenceFactory
  @JSName("com.sun.star.uri.UriSchemeParser_vndDOTsunDOTstarDOTexpand")
  var comDotsunDotstarDoturiDotUriSchemeParser_vndDOTsunDOTstarDOTexpand: UriSchemeParserVndDOTsunDOTstarDOTexpand
  @JSName("com.sun.star.uri.UriSchemeParser_vndDOTsunDOTstarDOTscript")
  var comDotsunDotstarDoturiDotUriSchemeParser_vndDOTsunDOTstarDOTscript: UriSchemeParserVndDOTsunDOTstarDOTscript
  @JSName("com.sun.star.uri.VndSunStarPkgUrlReferenceFactory")
  var comDotsunDotstarDoturiDotVndSunStarPkgUrlReferenceFactory: VndSunStarPkgUrlReferenceFactory
  @JSName("com.sun.star.util.BootstrapMacroExpander")
  var comDotsunDotstarDotutilDotBootstrapMacroExpander: BootstrapMacroExpander
  @JSName("com.sun.star.util.JobManager")
  var comDotsunDotstarDotutilDotJobManager: JobManager
  @JSName("com.sun.star.util.MacroExpander")
  var comDotsunDotstarDotutilDotMacroExpander: MacroExpander
  @JSName("com.sun.star.util.NumberFormatProperties")
  var comDotsunDotstarDotutilDotNumberFormatProperties: NumberFormatProperties
  @JSName("com.sun.star.util.NumberFormatSettings")
  var comDotsunDotstarDotutilDotNumberFormatSettings: NumberFormatSettings
  @JSName("com.sun.star.util.NumberFormats")
  var comDotsunDotstarDotutilDotNumberFormats: NumberFormats
  @JSName("com.sun.star.util.NumberFormatsSupplier")
  var comDotsunDotstarDotutilDotNumberFormatsSupplier: NumberFormatsSupplier
  @JSName("com.sun.star.util.NumberFormatter")
  var comDotsunDotstarDotutilDotNumberFormatter: NumberFormatter
  @JSName("com.sun.star.util.OfficeInstallationDirectories")
  var comDotsunDotstarDotutilDotOfficeInstallationDirectories: OfficeInstallationDirectories
  @JSName("com.sun.star.util.PathSettings")
  var comDotsunDotstarDotutilDotPathSettings: PathSettings
  @JSName("com.sun.star.util.PathSubstitution")
  var comDotsunDotstarDotutilDotPathSubstitution: PathSubstitution
  @JSName("com.sun.star.util.ReplaceDescriptor")
  var comDotsunDotstarDotutilDotReplaceDescriptor: ReplaceDescriptor
  @JSName("com.sun.star.util.SearchDescriptor")
  var comDotsunDotstarDotutilDotSearchDescriptor: SearchDescriptor
  @JSName("com.sun.star.util.SortDescriptor")
  var comDotsunDotstarDotutilDotSortDescriptor: SortDescriptor
  @JSName("com.sun.star.util.SortDescriptor2")
  var comDotsunDotstarDotutilDotSortDescriptor2: SortDescriptor2
  @JSName("com.sun.star.util.Sortable")
  var comDotsunDotstarDotutilDotSortable: Sortable
  @JSName("com.sun.star.util.TextSearch")
  var comDotsunDotstarDotutilDotTextSearch: TextSearch
  @JSName("com.sun.star.util.TextSearch2")
  var comDotsunDotstarDotutilDotTextSearch2: TextSearch2
  @JSName("com.sun.star.util.URLTransformer")
  var comDotsunDotstarDotutilDotURLTransformer: URLTransformer
  @JSName("com.sun.star.util.UriAbbreviation")
  var comDotsunDotstarDotutilDotUriAbbreviation: UriAbbreviation
  @JSName("com.sun.star.view.OfficeDocumentView")
  var comDotsunDotstarDotviewDotOfficeDocumentView: OfficeDocumentView
  @JSName("com.sun.star.view.PrintOptions")
  var comDotsunDotstarDotviewDotPrintOptions: PrintOptions
  @JSName("com.sun.star.view.PrintSettings")
  var comDotsunDotstarDotviewDotPrintSettings: typingsSlinky.activexLibreoffice.com_.sun.star.view.PrintSettings
  @JSName("com.sun.star.view.PrinterDescriptor")
  var comDotsunDotstarDotviewDotPrinterDescriptor: PrinterDescriptor
  @JSName("com.sun.star.view.RenderDescriptor")
  var comDotsunDotstarDotviewDotRenderDescriptor: RenderDescriptor
  @JSName("com.sun.star.view.RenderOptions")
  var comDotsunDotstarDotviewDotRenderOptions: RenderOptions
  @JSName("com.sun.star.view.ViewSettings")
  var comDotsunDotstarDotviewDotViewSettings: typingsSlinky.activexLibreoffice.com_.sun.star.view.ViewSettings
  @JSName("com.sun.star.xforms.Binding")
  var comDotsunDotstarDotxformsDotBinding: Binding
  @JSName("com.sun.star.xforms.Model")
  var comDotsunDotstarDotxformsDotModel: Model
  @JSName("com.sun.star.xforms.XForms")
  var comDotsunDotstarDotxformsDotXForms: XForms
  @JSName("com.sun.star.xml.AttributeContainer")
  var comDotsunDotstarDotxmlDotAttributeContainer: AttributeContainer
  @JSName("com.sun.star.xml.ExportFilter")
  var comDotsunDotstarDotxmlDotExportFilter: typingsSlinky.activexLibreoffice.com_.sun.star.xml.ExportFilter
  @JSName("com.sun.star.xml.ImportFilter")
  var comDotsunDotstarDotxmlDotImportFilter: typingsSlinky.activexLibreoffice.com_.sun.star.xml.ImportFilter
  @JSName("com.sun.star.xml.NamespaceContainer")
  var comDotsunDotstarDotxmlDotNamespaceContainer: NamespaceContainer
  @JSName("com.sun.star.xml.ParaUserDefinedAttributesSupplier")
  var comDotsunDotstarDotxmlDotParaUserDefinedAttributesSupplier: ParaUserDefinedAttributesSupplier
  @JSName("com.sun.star.xml.TextUserDefinedAttributesSupplier")
  var comDotsunDotstarDotxmlDotTextUserDefinedAttributesSupplier: TextUserDefinedAttributesSupplier
  @JSName("com.sun.star.xml.UserDefinedAttributesSupplier")
  var comDotsunDotstarDotxmlDotUserDefinedAttributesSupplier: UserDefinedAttributesSupplier
  @JSName("com.sun.star.xml.XMLExportFilter")
  var comDotsunDotstarDotxmlDotXMLExportFilter: XMLExportFilter
  @JSName("com.sun.star.xml.XMLImportFilter")
  var comDotsunDotstarDotxmlDotXMLImportFilter: XMLImportFilter
  @JSName("com.sun.star.xml.crypto.NSSInitializer")
  var comDotsunDotstarDotxmlDotcryptoDotNSSInitializer: NSSInitializer
  @JSName("com.sun.star.xml.crypto.SEInitializer")
  var comDotsunDotstarDotxmlDotcryptoDotSEInitializer: SEInitializer
  @JSName("com.sun.star.xml.crypto.SecurityEnvironment")
  var comDotsunDotstarDotxmlDotcryptoDotSecurityEnvironment: SecurityEnvironment
  @JSName("com.sun.star.xml.crypto.XMLEncryption")
  var comDotsunDotstarDotxmlDotcryptoDotXMLEncryption: XMLEncryption
  @JSName("com.sun.star.xml.crypto.XMLEncryptionTemplate")
  var comDotsunDotstarDotxmlDotcryptoDotXMLEncryptionTemplate: XMLEncryptionTemplate
  @JSName("com.sun.star.xml.crypto.XMLSecurityContext")
  var comDotsunDotstarDotxmlDotcryptoDotXMLSecurityContext: XMLSecurityContext
  @JSName("com.sun.star.xml.crypto.XMLSignature")
  var comDotsunDotstarDotxmlDotcryptoDotXMLSignature: XMLSignature
  @JSName("com.sun.star.xml.crypto.XMLSignatureTemplate")
  var comDotsunDotstarDotxmlDotcryptoDotXMLSignatureTemplate: XMLSignatureTemplate
  @JSName("com.sun.star.xml.crypto.sax.Decryptor")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotDecryptor: Decryptor
  @JSName("com.sun.star.xml.crypto.sax.Encryptor")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotEncryptor: Encryptor
  @JSName("com.sun.star.xml.crypto.sax.SAXEventKeeper")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotSAXEventKeeper: SAXEventKeeper
  @JSName("com.sun.star.xml.crypto.sax.SignatureCreator")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotSignatureCreator: SignatureCreator
  @JSName("com.sun.star.xml.crypto.sax.SignatureVerifier")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotSignatureVerifier: SignatureVerifier
  @JSName("com.sun.star.xml.dom.DocumentBuilder")
  var comDotsunDotstarDotxmlDotdomDotDocumentBuilder: DocumentBuilder
  @JSName("com.sun.star.xml.dom.SAXDocumentBuilder")
  var comDotsunDotstarDotxmlDotdomDotSAXDocumentBuilder: SAXDocumentBuilder
  @JSName("com.sun.star.xml.input.SaxDocumentHandler")
  var comDotsunDotstarDotxmlDotinputDotSaxDocumentHandler: SaxDocumentHandler
  @JSName("com.sun.star.xml.sax.FastParser")
  var comDotsunDotstarDotxmlDotsaxDotFastParser: FastParser
  @JSName("com.sun.star.xml.sax.FastShapeContextHandler")
  var comDotsunDotstarDotxmlDotsaxDotFastShapeContextHandler: FastShapeContextHandler
  @JSName("com.sun.star.xml.sax.FastTokenHandler")
  var comDotsunDotstarDotxmlDotsaxDotFastTokenHandler: FastTokenHandler
  @JSName("com.sun.star.xml.sax.Parser")
  var comDotsunDotstarDotxmlDotsaxDotParser: Parser
  @JSName("com.sun.star.xml.sax.Writer")
  var comDotsunDotstarDotxmlDotsaxDotWriter: Writer
  @JSName("com.sun.star.xml.wrapper.XMLDocumentWrapper")
  var comDotsunDotstarDotxmlDotwrapperDotXMLDocumentWrapper: XMLDocumentWrapper
  @JSName("com.sun.star.xml.wrapper.XMLElementWrapper")
  var comDotsunDotstarDotxmlDotwrapperDotXMLElementWrapper: XMLElementWrapper
  @JSName("com.sun.star.xml.xpath.XPathAPI")
  var comDotsunDotstarDotxmlDotxpathDotXPathAPI: XPathAPI
  @JSName("com.sun.star.xml.xpath.XPathExtension")
  var comDotsunDotstarDotxmlDotxpathDotXPathExtension: XPathExtension
  @JSName("com.sun.star.xml.xslt.XSLT2Transformer")
  var comDotsunDotstarDotxmlDotxsltDotXSLT2Transformer: XSLT2Transformer
  @JSName("com.sun.star.xml.xslt.XSLTTransformer")
  var comDotsunDotstarDotxmlDotxsltDotXSLTTransformer: XSLTTransformer
  @JSName("com.sun.star.xsd.Boolean")
  var comDotsunDotstarDotxsdDotBoolean: Boolean
  @JSName("com.sun.star.xsd.Date")
  var comDotsunDotstarDotxsdDotDate: Date
  @JSName("com.sun.star.xsd.DateTime")
  var comDotsunDotstarDotxsdDotDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.xsd.DateTime
  @JSName("com.sun.star.xsd.Day")
  var comDotsunDotstarDotxsdDotDay: Day
  @JSName("com.sun.star.xsd.Decimal")
  var comDotsunDotstarDotxsdDotDecimal: Decimal
  @JSName("com.sun.star.xsd.Month")
  var comDotsunDotstarDotxsdDotMonth: Month
  @JSName("com.sun.star.xsd.String")
  var comDotsunDotstarDotxsdDotString: String
  @JSName("com.sun.star.xsd.Time")
  var comDotsunDotstarDotxsdDotTime: Time
  @JSName("com.sun.star.xsd.Year")
  var comDotsunDotstarDotxsdDotYear: Year
  @JSName("org.freedesktop.PackageKit.SyncDbusSessionHelper")
  var orgDotfreedesktopDotPackageKitDotSyncDbusSessionHelper: SyncDbusSessionHelper
}

object ServicesNameMap {
  @scala.inline
  def apply(
    comDotsunDotstarDotaccessibilityDotAccessible: Accessible,
    comDotsunDotstarDotaccessibilityDotAccessibleContext: AccessibleContext,
    comDotsunDotstarDotaccessibilityDotMSAAService: MSAAService,
    comDotsunDotstarDotanimationsDotAnimateColor: AnimateColor,
    comDotsunDotstarDotanimationsDotAnimateMotion: AnimateMotion,
    comDotsunDotstarDotanimationsDotAnimateSet: AnimateSet,
    comDotsunDotstarDotanimationsDotAudio: Audio,
    comDotsunDotstarDotanimationsDotCommand: Command,
    comDotsunDotstarDotanimationsDotIterateContainer: IterateContainer,
    comDotsunDotstarDotanimationsDotParallelTimeContainer: ParallelTimeContainer,
    comDotsunDotstarDotanimationsDotSequenceTimeContainer: SequenceTimeContainer,
    comDotsunDotstarDotauthDotSSOManagerFactory: SSOManagerFactory,
    comDotsunDotstarDotauthDotSSOPasswordCache: SSOPasswordCache,
    comDotsunDotstarDotawtDotAccessibleButton: AccessibleButton,
    comDotsunDotstarDotawtDotAccessibleCheckBox: AccessibleCheckBox,
    comDotsunDotstarDotawtDotAccessibleComboBox: AccessibleComboBox,
    comDotsunDotstarDotawtDotAccessibleDropDownComboBox: AccessibleDropDownComboBox,
    comDotsunDotstarDotawtDotAccessibleDropDownListBox: AccessibleDropDownListBox,
    comDotsunDotstarDotawtDotAccessibleEdit: AccessibleEdit,
    comDotsunDotstarDotawtDotAccessibleFixedText: AccessibleFixedText,
    comDotsunDotstarDotawtDotAccessibleIconChoiceControl: AccessibleIconChoiceControl,
    comDotsunDotstarDotawtDotAccessibleIconChoiceControlEntry: AccessibleIconChoiceControlEntry,
    comDotsunDotstarDotawtDotAccessibleList: AccessibleList,
    comDotsunDotstarDotawtDotAccessibleListBox: AccessibleListBox,
    comDotsunDotstarDotawtDotAccessibleListBoxList: AccessibleListBoxList,
    comDotsunDotstarDotawtDotAccessibleListItem: AccessibleListItem,
    comDotsunDotstarDotawtDotAccessibleMenu: AccessibleMenu,
    comDotsunDotstarDotawtDotAccessibleMenuBar: AccessibleMenuBar,
    comDotsunDotstarDotawtDotAccessibleMenuItem: AccessibleMenuItem,
    comDotsunDotstarDotawtDotAccessibleMenuSeparator: AccessibleMenuSeparator,
    comDotsunDotstarDotawtDotAccessiblePopupMenu: AccessiblePopupMenu,
    comDotsunDotstarDotawtDotAccessibleRadioButton: AccessibleRadioButton,
    comDotsunDotstarDotawtDotAccessibleScrollBar: AccessibleScrollBar,
    comDotsunDotstarDotawtDotAccessibleStatusBar: AccessibleStatusBar,
    comDotsunDotstarDotawtDotAccessibleStatusBarItem: AccessibleStatusBarItem,
    comDotsunDotstarDotawtDotAccessibleTabBar: AccessibleTabBar,
    comDotsunDotstarDotawtDotAccessibleTabBarPage: AccessibleTabBarPage,
    comDotsunDotstarDotawtDotAccessibleTabBarPageList: AccessibleTabBarPageList,
    comDotsunDotstarDotawtDotAccessibleTabControl: AccessibleTabControl,
    comDotsunDotstarDotawtDotAccessibleTabPage: AccessibleTabPage,
    comDotsunDotstarDotawtDotAccessibleTextField: AccessibleTextField,
    comDotsunDotstarDotawtDotAccessibleToolBox: AccessibleToolBox,
    comDotsunDotstarDotawtDotAccessibleToolBoxItem: AccessibleToolBoxItem,
    comDotsunDotstarDotawtDotAccessibleTreeListBox: AccessibleTreeListBox,
    comDotsunDotstarDotawtDotAccessibleTreeListBoxEntry: AccessibleTreeListBoxEntry,
    comDotsunDotstarDotawtDotAccessibleWindow: AccessibleWindow,
    comDotsunDotstarDotawtDotAnimatedImagesControl: AnimatedImagesControl,
    comDotsunDotstarDotawtDotAnimatedImagesControlModel: AnimatedImagesControlModel,
    comDotsunDotstarDotawtDotAsyncCallback: AsyncCallback,
    comDotsunDotstarDotawtDotContainerWindowProvider: ContainerWindowProvider,
    comDotsunDotstarDotawtDotDialogProvider: DialogProvider,
    comDotsunDotstarDotawtDotDialogProvider2: DialogProvider2,
    comDotsunDotstarDotawtDotMenuBar: MenuBar,
    comDotsunDotstarDotawtDotPointer: Pointer,
    comDotsunDotstarDotawtDotPopupMenu: PopupMenu,
    comDotsunDotstarDotawtDotPrinterServer: PrinterServer,
    comDotsunDotstarDotawtDotRoadmapItem: RoadmapItem,
    comDotsunDotstarDotawtDotSpinningProgressControlModel: SpinningProgressControlModel,
    comDotsunDotstarDotawtDotTabController: TabController,
    comDotsunDotstarDotawtDotTabControllerModel: TabControllerModel,
    comDotsunDotstarDotawtDotToolkit: Toolkit,
    comDotsunDotstarDotawtDotUnoControl: UnoControl,
    comDotsunDotstarDotawtDotUnoControlButton: UnoControlButton,
    comDotsunDotstarDotawtDotUnoControlButtonModel: UnoControlButtonModel,
    comDotsunDotstarDotawtDotUnoControlCheckBox: UnoControlCheckBox,
    comDotsunDotstarDotawtDotUnoControlCheckBoxModel: UnoControlCheckBoxModel,
    comDotsunDotstarDotawtDotUnoControlComboBox: UnoControlComboBox,
    comDotsunDotstarDotawtDotUnoControlComboBoxModel: UnoControlComboBoxModel,
    comDotsunDotstarDotawtDotUnoControlContainer: UnoControlContainer,
    comDotsunDotstarDotawtDotUnoControlContainerModel: UnoControlContainerModel,
    comDotsunDotstarDotawtDotUnoControlCurrencyField: UnoControlCurrencyField,
    comDotsunDotstarDotawtDotUnoControlCurrencyFieldModel: UnoControlCurrencyFieldModel,
    comDotsunDotstarDotawtDotUnoControlDateField: UnoControlDateField,
    comDotsunDotstarDotawtDotUnoControlDateFieldModel: UnoControlDateFieldModel,
    comDotsunDotstarDotawtDotUnoControlDialog: UnoControlDialog,
    comDotsunDotstarDotawtDotUnoControlDialogElement: UnoControlDialogElement,
    comDotsunDotstarDotawtDotUnoControlDialogModel: UnoControlDialogModel,
    comDotsunDotstarDotawtDotUnoControlDialogModelProvider: UnoControlDialogModelProvider,
    comDotsunDotstarDotawtDotUnoControlEdit: UnoControlEdit,
    comDotsunDotstarDotawtDotUnoControlEditModel: UnoControlEditModel,
    comDotsunDotstarDotawtDotUnoControlFileControl: UnoControlFileControl,
    comDotsunDotstarDotawtDotUnoControlFileControlModel: UnoControlFileControlModel,
    comDotsunDotstarDotawtDotUnoControlFixedHyperlink: UnoControlFixedHyperlink,
    comDotsunDotstarDotawtDotUnoControlFixedHyperlinkModel: UnoControlFixedHyperlinkModel,
    comDotsunDotstarDotawtDotUnoControlFixedLine: UnoControlFixedLine,
    comDotsunDotstarDotawtDotUnoControlFixedLineModel: UnoControlFixedLineModel,
    comDotsunDotstarDotawtDotUnoControlFixedText: UnoControlFixedText,
    comDotsunDotstarDotawtDotUnoControlFixedTextModel: UnoControlFixedTextModel,
    comDotsunDotstarDotawtDotUnoControlFormattedField: UnoControlFormattedField,
    comDotsunDotstarDotawtDotUnoControlFormattedFieldModel: UnoControlFormattedFieldModel,
    comDotsunDotstarDotawtDotUnoControlGroupBox: UnoControlGroupBox,
    comDotsunDotstarDotawtDotUnoControlGroupBoxModel: UnoControlGroupBoxModel,
    comDotsunDotstarDotawtDotUnoControlImageControl: UnoControlImageControl,
    comDotsunDotstarDotawtDotUnoControlImageControlModel: UnoControlImageControlModel,
    comDotsunDotstarDotawtDotUnoControlListBox: UnoControlListBox,
    comDotsunDotstarDotawtDotUnoControlListBoxModel: UnoControlListBoxModel,
    comDotsunDotstarDotawtDotUnoControlModel: UnoControlModel,
    comDotsunDotstarDotawtDotUnoControlNumericField: UnoControlNumericField,
    comDotsunDotstarDotawtDotUnoControlNumericFieldModel: UnoControlNumericFieldModel,
    comDotsunDotstarDotawtDotUnoControlPatternField: UnoControlPatternField,
    comDotsunDotstarDotawtDotUnoControlPatternFieldModel: UnoControlPatternFieldModel,
    comDotsunDotstarDotawtDotUnoControlProgressBar: UnoControlProgressBar,
    comDotsunDotstarDotawtDotUnoControlProgressBarModel: UnoControlProgressBarModel,
    comDotsunDotstarDotawtDotUnoControlRadioButton: UnoControlRadioButton,
    comDotsunDotstarDotawtDotUnoControlRadioButtonModel: UnoControlRadioButtonModel,
    comDotsunDotstarDotawtDotUnoControlRoadmap: UnoControlRoadmap,
    comDotsunDotstarDotawtDotUnoControlRoadmapModel: UnoControlRoadmapModel,
    comDotsunDotstarDotawtDotUnoControlScrollBar: UnoControlScrollBar,
    comDotsunDotstarDotawtDotUnoControlScrollBarModel: UnoControlScrollBarModel,
    comDotsunDotstarDotawtDotUnoControlSpinButton: UnoControlSpinButton,
    comDotsunDotstarDotawtDotUnoControlSpinButtonModel: UnoControlSpinButtonModel,
    comDotsunDotstarDotawtDotUnoControlTimeField: UnoControlTimeField,
    comDotsunDotstarDotawtDotUnoControlTimeFieldModel: UnoControlTimeFieldModel,
    comDotsunDotstarDotawtDotgridDotDefaultGridColumnModel: DefaultGridColumnModel,
    comDotsunDotstarDotawtDotgridDotDefaultGridDataModel: DefaultGridDataModel,
    comDotsunDotstarDotawtDotgridDotGridColumn: GridColumn,
    comDotsunDotstarDotawtDotgridDotSortableGridDataModel: SortableGridDataModel,
    comDotsunDotstarDotawtDotgridDotUnoControlGrid: UnoControlGrid,
    comDotsunDotstarDotawtDotgridDotUnoControlGridModel: UnoControlGridModel,
    comDotsunDotstarDotawtDottabDotUnoControlTabPage: UnoControlTabPage,
    comDotsunDotstarDotawtDottabDotUnoControlTabPageContainer: UnoControlTabPageContainer,
    comDotsunDotstarDotawtDottabDotUnoControlTabPageContainerModel: UnoControlTabPageContainerModel,
    comDotsunDotstarDotawtDottabDotUnoControlTabPageModel: UnoControlTabPageModel,
    comDotsunDotstarDotawtDottreeDotMutableTreeDataModel: MutableTreeDataModel,
    comDotsunDotstarDotawtDottreeDotMutableTreeNode: MutableTreeNode,
    comDotsunDotstarDotawtDottreeDotTreeControl: TreeControl,
    comDotsunDotstarDotawtDottreeDotTreeControlModel: TreeControlModel,
    comDotsunDotstarDotbeansDotIntrospection: Introspection,
    comDotsunDotstarDotbeansDotPropertyBag: PropertyBag,
    comDotsunDotstarDotbeansDotPropertySet: PropertySet,
    comDotsunDotstarDotbridgeDotBridge: Bridge,
    comDotsunDotstarDotbridgeDotBridgeFactory: BridgeFactory,
    comDotsunDotstarDotbridgeDotIiopBridge: IiopBridge,
    comDotsunDotstarDotbridgeDotOleApplicationRegistration: OleApplicationRegistration,
    comDotsunDotstarDotbridgeDotOleBridgeSupplier: OleBridgeSupplier,
    comDotsunDotstarDotbridgeDotOleBridgeSupplier2: OleBridgeSupplier2,
    comDotsunDotstarDotbridgeDotOleBridgeSupplierVar1: OleBridgeSupplierVar1,
    comDotsunDotstarDotbridgeDotOleObjectFactory: OleObjectFactory,
    comDotsunDotstarDotbridgeDotUnoUrlResolver: UnoUrlResolver,
    comDotsunDotstarDotbridgeDotUrpBridge: UrpBridge,
    comDotsunDotstarDotbridgeDotoleautomationDotApplicationRegistration: ApplicationRegistration,
    comDotsunDotstarDotbridgeDotoleautomationDotBridgeSupplier: BridgeSupplier,
    comDotsunDotstarDotbridgeDotoleautomationDotFactory: Factory,
    comDotsunDotstarDotchart2DotAxis: Axis,
    comDotsunDotstarDotchart2DotCandleStickChartType: CandleStickChartType,
    comDotsunDotstarDotchart2DotCartesianCoordinateSystem2d: CartesianCoordinateSystem2d,
    comDotsunDotstarDotchart2DotCartesianCoordinateSystem3d: CartesianCoordinateSystem3d,
    comDotsunDotstarDotchart2DotChartDocument: ChartDocument,
    comDotsunDotstarDotchart2DotChartDocumentWrapper: ChartDocumentWrapper,
    comDotsunDotstarDotchart2DotChartType: ChartType,
    comDotsunDotstarDotchart2DotChartTypeManager: ChartTypeManager,
    comDotsunDotstarDotchart2DotChartTypeTemplate: ChartTypeTemplate,
    comDotsunDotstarDotchart2DotCoordinateSystem: CoordinateSystem,
    comDotsunDotstarDotchart2DotCoordinateSystemType: CoordinateSystemType,
    comDotsunDotstarDotchart2DotDataPoint: DataPoint,
    comDotsunDotstarDotchart2DotDataPointProperties: DataPointProperties,
    comDotsunDotstarDotchart2DotDataSeries: DataSeries,
    comDotsunDotstarDotchart2DotDiagram: Diagram,
    comDotsunDotstarDotchart2DotErrorBar: ErrorBar,
    comDotsunDotstarDotchart2DotExponentialRegressionCurve: ExponentialRegressionCurve,
    comDotsunDotstarDotchart2DotExponentialScaling: ExponentialScaling,
    comDotsunDotstarDotchart2DotFormattedString: FormattedString,
    comDotsunDotstarDotchart2DotGridProperties: GridProperties,
    comDotsunDotstarDotchart2DotLegend: Legend,
    comDotsunDotstarDotchart2DotLinearRegressionCurve: LinearRegressionCurve,
    comDotsunDotstarDotchart2DotLinearScaling: LinearScaling,
    comDotsunDotstarDotchart2DotLogarithmicRegressionCurve: LogarithmicRegressionCurve,
    comDotsunDotstarDotchart2DotLogarithmicScaling: LogarithmicScaling,
    comDotsunDotstarDotchart2DotLogicTargetModel: LogicTargetModel,
    comDotsunDotstarDotchart2DotMovingAverageRegressionCurve: MovingAverageRegressionCurve,
    comDotsunDotstarDotchart2DotPolarCoordinateSystem2d: PolarCoordinateSystem2d,
    comDotsunDotstarDotchart2DotPolarCoordinateSystem3d: PolarCoordinateSystem3d,
    comDotsunDotstarDotchart2DotPolynomialRegressionCurve: PolynomialRegressionCurve,
    comDotsunDotstarDotchart2DotPotentialRegressionCurve: PotentialRegressionCurve,
    comDotsunDotstarDotchart2DotPowerScaling: PowerScaling,
    comDotsunDotstarDotchart2DotPropertyPool: PropertyPool,
    comDotsunDotstarDotchart2DotRegressionCurve: RegressionCurve,
    comDotsunDotstarDotchart2DotRegressionCurveEquation: RegressionCurveEquation,
    comDotsunDotstarDotchart2DotRegressionEquation: RegressionEquation,
    comDotsunDotstarDotchart2DotScaling: Scaling,
    comDotsunDotstarDotchart2DotStandardDiagramCreationParameters: StandardDiagramCreationParameters,
    comDotsunDotstarDotchart2DotTitle: Title,
    comDotsunDotstarDotchart2DotdataDotDataFilter: DataFilter,
    comDotsunDotstarDotchart2DotdataDotDataProvider: DataProvider,
    comDotsunDotstarDotchart2DotdataDotDataSequence: DataSequence,
    comDotsunDotstarDotchart2DotdataDotDataSink: DataSink,
    comDotsunDotstarDotchart2DotdataDotDataSource: DataSource,
    comDotsunDotstarDotchart2DotdataDotDatabaseDataProvider: DatabaseDataProvider,
    comDotsunDotstarDotchart2DotdataDotLabeledDataSequence: LabeledDataSequence,
    comDotsunDotstarDotchart2DotdataDotRangeHighlightListener: RangeHighlightListener,
    comDotsunDotstarDotchart2DotdataDotRangeHighlighter: RangeHighlighter,
    comDotsunDotstarDotchart2DotdataDotTabularDataProviderArguments: TabularDataProviderArguments,
    comDotsunDotstarDotchartDotAccessibleChartDocumentView: AccessibleChartDocumentView,
    comDotsunDotstarDotchartDotAccessibleChartElement: AccessibleChartElement,
    comDotsunDotstarDotchartDotAreaDiagram: AreaDiagram,
    comDotsunDotstarDotchartDotBarDiagram: BarDiagram,
    comDotsunDotstarDotchartDotBubbleDiagram: BubbleDiagram,
    comDotsunDotstarDotchartDotChart3DBarProperties: Chart3DBarProperties,
    comDotsunDotstarDotchartDotChartArea: ChartArea,
    comDotsunDotstarDotchartDotChartAxis: ChartAxis,
    comDotsunDotstarDotchartDotChartAxisXSupplier: ChartAxisXSupplier,
    comDotsunDotstarDotchartDotChartAxisYSupplier: ChartAxisYSupplier,
    comDotsunDotstarDotchartDotChartAxisZSupplier: ChartAxisZSupplier,
    comDotsunDotstarDotchartDotChartData: ChartData,
    comDotsunDotstarDotchartDotChartDataArray: ChartDataArray,
    comDotsunDotstarDotchartDotChartDataPointProperties: ChartDataPointProperties,
    comDotsunDotstarDotchartDotChartDataRowProperties: ChartDataRowProperties,
    comDotsunDotstarDotchartDotChartDocument: typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDocument,
    comDotsunDotstarDotchartDotChartGrid: ChartGrid,
    comDotsunDotstarDotchartDotChartLegend: ChartLegend,
    comDotsunDotstarDotchartDotChartLine: ChartLine,
    comDotsunDotstarDotchartDotChartPieSegmentProperties: ChartPieSegmentProperties,
    comDotsunDotstarDotchartDotChartStatistics: ChartStatistics,
    comDotsunDotstarDotchartDotChartTableAddressSupplier: ChartTableAddressSupplier,
    comDotsunDotstarDotchartDotChartTitle: ChartTitle,
    comDotsunDotstarDotchartDotChartTwoAxisXSupplier: ChartTwoAxisXSupplier,
    comDotsunDotstarDotchartDotChartTwoAxisYSupplier: ChartTwoAxisYSupplier,
    comDotsunDotstarDotchartDotDiagram: typingsSlinky.activexLibreoffice.com_.sun.star.chart.Diagram,
    comDotsunDotstarDotchartDotDim3DDiagram: Dim3DDiagram,
    comDotsunDotstarDotchartDotDonutDiagram: DonutDiagram,
    comDotsunDotstarDotchartDotFilledNetDiagram: FilledNetDiagram,
    comDotsunDotstarDotchartDotLineDiagram: LineDiagram,
    comDotsunDotstarDotchartDotNetDiagram: NetDiagram,
    comDotsunDotstarDotchartDotPieDiagram: PieDiagram,
    comDotsunDotstarDotchartDotStackableDiagram: StackableDiagram,
    comDotsunDotstarDotchartDotStockDiagram: StockDiagram,
    comDotsunDotstarDotchartDotXYDiagram: XYDiagram,
    comDotsunDotstarDotconfigurationDotAccessRootElement: AccessRootElement,
    comDotsunDotstarDotconfigurationDotAdministrationProvider: AdministrationProvider,
    comDotsunDotstarDotconfigurationDotConfigurationAccess: ConfigurationAccess,
    comDotsunDotstarDotconfigurationDotConfigurationProvider: ConfigurationProvider,
    comDotsunDotstarDotconfigurationDotConfigurationRegistry: ConfigurationRegistry,
    comDotsunDotstarDotconfigurationDotConfigurationUpdateAccess: ConfigurationUpdateAccess,
    comDotsunDotstarDotconfigurationDotDefaultProvider: DefaultProvider,
    comDotsunDotstarDotconfigurationDotGroupAccess: GroupAccess,
    comDotsunDotstarDotconfigurationDotGroupElement: GroupElement,
    comDotsunDotstarDotconfigurationDotGroupUpdate: GroupUpdate,
    comDotsunDotstarDotconfigurationDotHierarchyAccess: HierarchyAccess,
    comDotsunDotstarDotconfigurationDotHierarchyElement: HierarchyElement,
    comDotsunDotstarDotconfigurationDotPropertyHierarchy: PropertyHierarchy,
    comDotsunDotstarDotconfigurationDotReadOnlyAccess: ReadOnlyAccess,
    comDotsunDotstarDotconfigurationDotReadWriteAccess: ReadWriteAccess,
    comDotsunDotstarDotconfigurationDotSetAccess: SetAccess,
    comDotsunDotstarDotconfigurationDotSetElement: SetElement,
    comDotsunDotstarDotconfigurationDotSetUpdate: SetUpdate,
    comDotsunDotstarDotconfigurationDotSimpleSetAccess: SimpleSetAccess,
    comDotsunDotstarDotconfigurationDotSimpleSetUpdate: SimpleSetUpdate,
    comDotsunDotstarDotconfigurationDotUpdateRootElement: UpdateRootElement,
    comDotsunDotstarDotconfigurationDotbackendDotBackend: Backend,
    comDotsunDotstarDotconfigurationDotbackendDotBackendAdapter: BackendAdapter,
    comDotsunDotstarDotconfigurationDotbackendDotCopyImporter: CopyImporter,
    comDotsunDotstarDotconfigurationDotbackendDotDataImporter: DataImporter,
    comDotsunDotstarDotconfigurationDotbackendDotDefaultBackend: DefaultBackend,
    comDotsunDotstarDotconfigurationDotbackendDotHierarchyBrowser: HierarchyBrowser
  ): ServicesNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com.sun.star.accessibility.Accessible")(comDotsunDotstarDotaccessibilityDotAccessible.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleContext")(comDotsunDotstarDotaccessibilityDotAccessibleContext.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.MSAAService")(comDotsunDotstarDotaccessibilityDotMSAAService.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.AnimateColor")(comDotsunDotstarDotanimationsDotAnimateColor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.AnimateMotion")(comDotsunDotstarDotanimationsDotAnimateMotion.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.AnimateSet")(comDotsunDotstarDotanimationsDotAnimateSet.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.Audio")(comDotsunDotstarDotanimationsDotAudio.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.Command")(comDotsunDotstarDotanimationsDotCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.IterateContainer")(comDotsunDotstarDotanimationsDotIterateContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.ParallelTimeContainer")(comDotsunDotstarDotanimationsDotParallelTimeContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.SequenceTimeContainer")(comDotsunDotstarDotanimationsDotSequenceTimeContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.auth.SSOManagerFactory")(comDotsunDotstarDotauthDotSSOManagerFactory.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.auth.SSOPasswordCache")(comDotsunDotstarDotauthDotSSOPasswordCache.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleButton")(comDotsunDotstarDotawtDotAccessibleButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleCheckBox")(comDotsunDotstarDotawtDotAccessibleCheckBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleComboBox")(comDotsunDotstarDotawtDotAccessibleComboBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleDropDownComboBox")(comDotsunDotstarDotawtDotAccessibleDropDownComboBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleDropDownListBox")(comDotsunDotstarDotawtDotAccessibleDropDownListBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleEdit")(comDotsunDotstarDotawtDotAccessibleEdit.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleFixedText")(comDotsunDotstarDotawtDotAccessibleFixedText.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleIconChoiceControl")(comDotsunDotstarDotawtDotAccessibleIconChoiceControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleIconChoiceControlEntry")(comDotsunDotstarDotawtDotAccessibleIconChoiceControlEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleList")(comDotsunDotstarDotawtDotAccessibleList.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleListBox")(comDotsunDotstarDotawtDotAccessibleListBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleListBoxList")(comDotsunDotstarDotawtDotAccessibleListBoxList.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleListItem")(comDotsunDotstarDotawtDotAccessibleListItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleMenu")(comDotsunDotstarDotawtDotAccessibleMenu.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleMenuBar")(comDotsunDotstarDotawtDotAccessibleMenuBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleMenuItem")(comDotsunDotstarDotawtDotAccessibleMenuItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleMenuSeparator")(comDotsunDotstarDotawtDotAccessibleMenuSeparator.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessiblePopupMenu")(comDotsunDotstarDotawtDotAccessiblePopupMenu.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleRadioButton")(comDotsunDotstarDotawtDotAccessibleRadioButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleScrollBar")(comDotsunDotstarDotawtDotAccessibleScrollBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleStatusBar")(comDotsunDotstarDotawtDotAccessibleStatusBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleStatusBarItem")(comDotsunDotstarDotawtDotAccessibleStatusBarItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTabBar")(comDotsunDotstarDotawtDotAccessibleTabBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTabBarPage")(comDotsunDotstarDotawtDotAccessibleTabBarPage.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTabBarPageList")(comDotsunDotstarDotawtDotAccessibleTabBarPageList.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTabControl")(comDotsunDotstarDotawtDotAccessibleTabControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTabPage")(comDotsunDotstarDotawtDotAccessibleTabPage.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTextField")(comDotsunDotstarDotawtDotAccessibleTextField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleToolBox")(comDotsunDotstarDotawtDotAccessibleToolBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleToolBoxItem")(comDotsunDotstarDotawtDotAccessibleToolBoxItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTreeListBox")(comDotsunDotstarDotawtDotAccessibleTreeListBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleTreeListBoxEntry")(comDotsunDotstarDotawtDotAccessibleTreeListBoxEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AccessibleWindow")(comDotsunDotstarDotawtDotAccessibleWindow.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AnimatedImagesControl")(comDotsunDotstarDotawtDotAnimatedImagesControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AnimatedImagesControlModel")(comDotsunDotstarDotawtDotAnimatedImagesControlModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AsyncCallback")(comDotsunDotstarDotawtDotAsyncCallback.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ContainerWindowProvider")(comDotsunDotstarDotawtDotContainerWindowProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DialogProvider")(comDotsunDotstarDotawtDotDialogProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DialogProvider2")(comDotsunDotstarDotawtDotDialogProvider2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.MenuBar")(comDotsunDotstarDotawtDotMenuBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Pointer")(comDotsunDotstarDotawtDotPointer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.PopupMenu")(comDotsunDotstarDotawtDotPopupMenu.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.PrinterServer")(comDotsunDotstarDotawtDotPrinterServer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.RoadmapItem")(comDotsunDotstarDotawtDotRoadmapItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SpinningProgressControlModel")(comDotsunDotstarDotawtDotSpinningProgressControlModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.TabController")(comDotsunDotstarDotawtDotTabController.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.TabControllerModel")(comDotsunDotstarDotawtDotTabControllerModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Toolkit")(comDotsunDotstarDotawtDotToolkit.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControl")(comDotsunDotstarDotawtDotUnoControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlButton")(comDotsunDotstarDotawtDotUnoControlButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlButtonModel")(comDotsunDotstarDotawtDotUnoControlButtonModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlCheckBox")(comDotsunDotstarDotawtDotUnoControlCheckBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlCheckBoxModel")(comDotsunDotstarDotawtDotUnoControlCheckBoxModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlComboBox")(comDotsunDotstarDotawtDotUnoControlComboBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlComboBoxModel")(comDotsunDotstarDotawtDotUnoControlComboBoxModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlContainer")(comDotsunDotstarDotawtDotUnoControlContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlContainerModel")(comDotsunDotstarDotawtDotUnoControlContainerModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlCurrencyField")(comDotsunDotstarDotawtDotUnoControlCurrencyField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlCurrencyFieldModel")(comDotsunDotstarDotawtDotUnoControlCurrencyFieldModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlDateField")(comDotsunDotstarDotawtDotUnoControlDateField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlDateFieldModel")(comDotsunDotstarDotawtDotUnoControlDateFieldModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlDialog")(comDotsunDotstarDotawtDotUnoControlDialog.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlDialogElement")(comDotsunDotstarDotawtDotUnoControlDialogElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlDialogModel")(comDotsunDotstarDotawtDotUnoControlDialogModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlDialogModelProvider")(comDotsunDotstarDotawtDotUnoControlDialogModelProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlEdit")(comDotsunDotstarDotawtDotUnoControlEdit.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlEditModel")(comDotsunDotstarDotawtDotUnoControlEditModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFileControl")(comDotsunDotstarDotawtDotUnoControlFileControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFileControlModel")(comDotsunDotstarDotawtDotUnoControlFileControlModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFixedHyperlink")(comDotsunDotstarDotawtDotUnoControlFixedHyperlink.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFixedHyperlinkModel")(comDotsunDotstarDotawtDotUnoControlFixedHyperlinkModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFixedLine")(comDotsunDotstarDotawtDotUnoControlFixedLine.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFixedLineModel")(comDotsunDotstarDotawtDotUnoControlFixedLineModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFixedText")(comDotsunDotstarDotawtDotUnoControlFixedText.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFixedTextModel")(comDotsunDotstarDotawtDotUnoControlFixedTextModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFormattedField")(comDotsunDotstarDotawtDotUnoControlFormattedField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlFormattedFieldModel")(comDotsunDotstarDotawtDotUnoControlFormattedFieldModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlGroupBox")(comDotsunDotstarDotawtDotUnoControlGroupBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlGroupBoxModel")(comDotsunDotstarDotawtDotUnoControlGroupBoxModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlImageControl")(comDotsunDotstarDotawtDotUnoControlImageControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlImageControlModel")(comDotsunDotstarDotawtDotUnoControlImageControlModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlListBox")(comDotsunDotstarDotawtDotUnoControlListBox.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlListBoxModel")(comDotsunDotstarDotawtDotUnoControlListBoxModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlModel")(comDotsunDotstarDotawtDotUnoControlModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlNumericField")(comDotsunDotstarDotawtDotUnoControlNumericField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlNumericFieldModel")(comDotsunDotstarDotawtDotUnoControlNumericFieldModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlPatternField")(comDotsunDotstarDotawtDotUnoControlPatternField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlPatternFieldModel")(comDotsunDotstarDotawtDotUnoControlPatternFieldModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlProgressBar")(comDotsunDotstarDotawtDotUnoControlProgressBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlProgressBarModel")(comDotsunDotstarDotawtDotUnoControlProgressBarModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlRadioButton")(comDotsunDotstarDotawtDotUnoControlRadioButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlRadioButtonModel")(comDotsunDotstarDotawtDotUnoControlRadioButtonModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlRoadmap")(comDotsunDotstarDotawtDotUnoControlRoadmap.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlRoadmapModel")(comDotsunDotstarDotawtDotUnoControlRoadmapModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlScrollBar")(comDotsunDotstarDotawtDotUnoControlScrollBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlScrollBarModel")(comDotsunDotstarDotawtDotUnoControlScrollBarModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlSpinButton")(comDotsunDotstarDotawtDotUnoControlSpinButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlSpinButtonModel")(comDotsunDotstarDotawtDotUnoControlSpinButtonModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlTimeField")(comDotsunDotstarDotawtDotUnoControlTimeField.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.UnoControlTimeFieldModel")(comDotsunDotstarDotawtDotUnoControlTimeFieldModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.DefaultGridColumnModel")(comDotsunDotstarDotawtDotgridDotDefaultGridColumnModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.DefaultGridDataModel")(comDotsunDotstarDotawtDotgridDotDefaultGridDataModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridColumn")(comDotsunDotstarDotawtDotgridDotGridColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.SortableGridDataModel")(comDotsunDotstarDotawtDotgridDotSortableGridDataModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.UnoControlGrid")(comDotsunDotstarDotawtDotgridDotUnoControlGrid.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.UnoControlGridModel")(comDotsunDotstarDotawtDotgridDotUnoControlGridModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tab.UnoControlTabPage")(comDotsunDotstarDotawtDottabDotUnoControlTabPage.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tab.UnoControlTabPageContainer")(comDotsunDotstarDotawtDottabDotUnoControlTabPageContainer.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tab.UnoControlTabPageContainerModel")(comDotsunDotstarDotawtDottabDotUnoControlTabPageContainerModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tab.UnoControlTabPageModel")(comDotsunDotstarDotawtDottabDotUnoControlTabPageModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.MutableTreeDataModel")(comDotsunDotstarDotawtDottreeDotMutableTreeDataModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.MutableTreeNode")(comDotsunDotstarDotawtDottreeDotMutableTreeNode.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.TreeControl")(comDotsunDotstarDotawtDottreeDotTreeControl.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.TreeControlModel")(comDotsunDotstarDotawtDottreeDotTreeControlModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.Introspection")(comDotsunDotstarDotbeansDotIntrospection.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyBag")(comDotsunDotstarDotbeansDotPropertyBag.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertySet")(comDotsunDotstarDotbeansDotPropertySet.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.Bridge")(comDotsunDotstarDotbridgeDotBridge.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.BridgeFactory")(comDotsunDotstarDotbridgeDotBridgeFactory.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.IiopBridge")(comDotsunDotstarDotbridgeDotIiopBridge.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.OleApplicationRegistration")(comDotsunDotstarDotbridgeDotOleApplicationRegistration.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.OleBridgeSupplier")(comDotsunDotstarDotbridgeDotOleBridgeSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.OleBridgeSupplier2")(comDotsunDotstarDotbridgeDotOleBridgeSupplier2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.OleBridgeSupplierVar1")(comDotsunDotstarDotbridgeDotOleBridgeSupplierVar1.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.OleObjectFactory")(comDotsunDotstarDotbridgeDotOleObjectFactory.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.UnoUrlResolver")(comDotsunDotstarDotbridgeDotUnoUrlResolver.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.UrpBridge")(comDotsunDotstarDotbridgeDotUrpBridge.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.ApplicationRegistration")(comDotsunDotstarDotbridgeDotoleautomationDotApplicationRegistration.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.BridgeSupplier")(comDotsunDotstarDotbridgeDotoleautomationDotBridgeSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Factory")(comDotsunDotstarDotbridgeDotoleautomationDotFactory.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Axis")(comDotsunDotstarDotchart2DotAxis.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.CandleStickChartType")(comDotsunDotstarDotchart2DotCandleStickChartType.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.CartesianCoordinateSystem2d")(comDotsunDotstarDotchart2DotCartesianCoordinateSystem2d.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.CartesianCoordinateSystem3d")(comDotsunDotstarDotchart2DotCartesianCoordinateSystem3d.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ChartDocument")(comDotsunDotstarDotchart2DotChartDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ChartDocumentWrapper")(comDotsunDotstarDotchart2DotChartDocumentWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ChartType")(comDotsunDotstarDotchart2DotChartType.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ChartTypeManager")(comDotsunDotstarDotchart2DotChartTypeManager.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ChartTypeTemplate")(comDotsunDotstarDotchart2DotChartTypeTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.CoordinateSystem")(comDotsunDotstarDotchart2DotCoordinateSystem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.CoordinateSystemType")(comDotsunDotstarDotchart2DotCoordinateSystemType.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.DataPoint")(comDotsunDotstarDotchart2DotDataPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.DataPointProperties")(comDotsunDotstarDotchart2DotDataPointProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.DataSeries")(comDotsunDotstarDotchart2DotDataSeries.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Diagram")(comDotsunDotstarDotchart2DotDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ErrorBar")(comDotsunDotstarDotchart2DotErrorBar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ExponentialRegressionCurve")(comDotsunDotstarDotchart2DotExponentialRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ExponentialScaling")(comDotsunDotstarDotchart2DotExponentialScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.FormattedString")(comDotsunDotstarDotchart2DotFormattedString.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.GridProperties")(comDotsunDotstarDotchart2DotGridProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Legend")(comDotsunDotstarDotchart2DotLegend.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LinearRegressionCurve")(comDotsunDotstarDotchart2DotLinearRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LinearScaling")(comDotsunDotstarDotchart2DotLinearScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LogarithmicRegressionCurve")(comDotsunDotstarDotchart2DotLogarithmicRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LogarithmicScaling")(comDotsunDotstarDotchart2DotLogarithmicScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LogicTargetModel")(comDotsunDotstarDotchart2DotLogicTargetModel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.MovingAverageRegressionCurve")(comDotsunDotstarDotchart2DotMovingAverageRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.PolarCoordinateSystem2d")(comDotsunDotstarDotchart2DotPolarCoordinateSystem2d.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.PolarCoordinateSystem3d")(comDotsunDotstarDotchart2DotPolarCoordinateSystem3d.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.PolynomialRegressionCurve")(comDotsunDotstarDotchart2DotPolynomialRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.PotentialRegressionCurve")(comDotsunDotstarDotchart2DotPotentialRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.PowerScaling")(comDotsunDotstarDotchart2DotPowerScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.PropertyPool")(comDotsunDotstarDotchart2DotPropertyPool.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RegressionCurve")(comDotsunDotstarDotchart2DotRegressionCurve.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RegressionCurveEquation")(comDotsunDotstarDotchart2DotRegressionCurveEquation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RegressionEquation")(comDotsunDotstarDotchart2DotRegressionEquation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Scaling")(comDotsunDotstarDotchart2DotScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.StandardDiagramCreationParameters")(comDotsunDotstarDotchart2DotStandardDiagramCreationParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Title")(comDotsunDotstarDotchart2DotTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.DataFilter")(comDotsunDotstarDotchart2DotdataDotDataFilter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.DataProvider")(comDotsunDotstarDotchart2DotdataDotDataProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.DataSequence")(comDotsunDotstarDotchart2DotdataDotDataSequence.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.DataSink")(comDotsunDotstarDotchart2DotdataDotDataSink.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.DataSource")(comDotsunDotstarDotchart2DotdataDotDataSource.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.DatabaseDataProvider")(comDotsunDotstarDotchart2DotdataDotDatabaseDataProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.LabeledDataSequence")(comDotsunDotstarDotchart2DotdataDotLabeledDataSequence.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.RangeHighlightListener")(comDotsunDotstarDotchart2DotdataDotRangeHighlightListener.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.RangeHighlighter")(comDotsunDotstarDotchart2DotdataDotRangeHighlighter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.TabularDataProviderArguments")(comDotsunDotstarDotchart2DotdataDotTabularDataProviderArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.AccessibleChartDocumentView")(comDotsunDotstarDotchartDotAccessibleChartDocumentView.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.AccessibleChartElement")(comDotsunDotstarDotchartDotAccessibleChartElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.AreaDiagram")(comDotsunDotstarDotchartDotAreaDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.BarDiagram")(comDotsunDotstarDotchartDotBarDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.BubbleDiagram")(comDotsunDotstarDotchartDotBubbleDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.Chart3DBarProperties")(comDotsunDotstarDotchartDotChart3DBarProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartArea")(comDotsunDotstarDotchartDotChartArea.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartAxis")(comDotsunDotstarDotchartDotChartAxis.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartAxisXSupplier")(comDotsunDotstarDotchartDotChartAxisXSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartAxisYSupplier")(comDotsunDotstarDotchartDotChartAxisYSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartAxisZSupplier")(comDotsunDotstarDotchartDotChartAxisZSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartData")(comDotsunDotstarDotchartDotChartData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataArray")(comDotsunDotstarDotchartDotChartDataArray.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataPointProperties")(comDotsunDotstarDotchartDotChartDataPointProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataRowProperties")(comDotsunDotstarDotchartDotChartDataRowProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDocument")(comDotsunDotstarDotchartDotChartDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartGrid")(comDotsunDotstarDotchartDotChartGrid.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartLegend")(comDotsunDotstarDotchartDotChartLegend.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartLine")(comDotsunDotstarDotchartDotChartLine.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartPieSegmentProperties")(comDotsunDotstarDotchartDotChartPieSegmentProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartStatistics")(comDotsunDotstarDotchartDotChartStatistics.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartTableAddressSupplier")(comDotsunDotstarDotchartDotChartTableAddressSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartTitle")(comDotsunDotstarDotchartDotChartTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartTwoAxisXSupplier")(comDotsunDotstarDotchartDotChartTwoAxisXSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartTwoAxisYSupplier")(comDotsunDotstarDotchartDotChartTwoAxisYSupplier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.Diagram")(comDotsunDotstarDotchartDotDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.Dim3DDiagram")(comDotsunDotstarDotchartDotDim3DDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.DonutDiagram")(comDotsunDotstarDotchartDotDonutDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.FilledNetDiagram")(comDotsunDotstarDotchartDotFilledNetDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.LineDiagram")(comDotsunDotstarDotchartDotLineDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.NetDiagram")(comDotsunDotstarDotchartDotNetDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.PieDiagram")(comDotsunDotstarDotchartDotPieDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.StackableDiagram")(comDotsunDotstarDotchartDotStackableDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.StockDiagram")(comDotsunDotstarDotchartDotStockDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.XYDiagram")(comDotsunDotstarDotchartDotXYDiagram.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.AccessRootElement")(comDotsunDotstarDotconfigurationDotAccessRootElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.AdministrationProvider")(comDotsunDotstarDotconfigurationDotAdministrationProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.ConfigurationAccess")(comDotsunDotstarDotconfigurationDotConfigurationAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.ConfigurationProvider")(comDotsunDotstarDotconfigurationDotConfigurationProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.ConfigurationRegistry")(comDotsunDotstarDotconfigurationDotConfigurationRegistry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.ConfigurationUpdateAccess")(comDotsunDotstarDotconfigurationDotConfigurationUpdateAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.DefaultProvider")(comDotsunDotstarDotconfigurationDotDefaultProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.GroupAccess")(comDotsunDotstarDotconfigurationDotGroupAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.GroupElement")(comDotsunDotstarDotconfigurationDotGroupElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.GroupUpdate")(comDotsunDotstarDotconfigurationDotGroupUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.HierarchyAccess")(comDotsunDotstarDotconfigurationDotHierarchyAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.HierarchyElement")(comDotsunDotstarDotconfigurationDotHierarchyElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.PropertyHierarchy")(comDotsunDotstarDotconfigurationDotPropertyHierarchy.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.ReadOnlyAccess")(comDotsunDotstarDotconfigurationDotReadOnlyAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.ReadWriteAccess")(comDotsunDotstarDotconfigurationDotReadWriteAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.SetAccess")(comDotsunDotstarDotconfigurationDotSetAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.SetElement")(comDotsunDotstarDotconfigurationDotSetElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.SetUpdate")(comDotsunDotstarDotconfigurationDotSetUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.SimpleSetAccess")(comDotsunDotstarDotconfigurationDotSimpleSetAccess.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.SimpleSetUpdate")(comDotsunDotstarDotconfigurationDotSimpleSetUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.UpdateRootElement")(comDotsunDotstarDotconfigurationDotUpdateRootElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.Backend")(comDotsunDotstarDotconfigurationDotbackendDotBackend.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.BackendAdapter")(comDotsunDotstarDotconfigurationDotbackendDotBackendAdapter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.CopyImporter")(comDotsunDotstarDotconfigurationDotbackendDotCopyImporter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.DataImporter")(comDotsunDotstarDotconfigurationDotbackendDotDataImporter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.DefaultBackend")(comDotsunDotstarDotconfigurationDotbackendDotDefaultBackend.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.HierarchyBrowser")(comDotsunDotstarDotconfigurationDotbackendDotHierarchyBrowser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesNameMap]
  }
}

