package typingsSlinky.activexLibreoffice.LibreOffice

import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.AccessibleEventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.AccessibleRelation
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.AccessibleTableModelChange
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.TextSegment
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.Event
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.TargetProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.TimeFilterPair
import typingsSlinky.activexLibreoffice.com_.sun.star.animations.ValuePair
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.ActionEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.AdjustmentEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.DeviceInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.DockingData
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.DockingEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.EndDockingEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.EndPopupModeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.EnhancedMouseEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FocusEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Gradient
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.InputEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.ItemEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.ItemListEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.KeyStroke
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.MenuEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.PaintEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Selection
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.SimpleFontMetric
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.SpinEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.SystemDependentXWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.TextEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.VclContainerEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.WindowDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.WindowEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.GridColumnEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.GridDataEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid.GridSelectionEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tab.TabPageActivatedEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree.TreeDataModelEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree.TreeExpansionEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Property
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertySetInfoChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyStateChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.ProtocolProperty
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.Currency
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.Date
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.Decimal
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.NamedArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.PropertyPutArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation.SCode
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDataChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDataRow
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartDataValue
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.ChartSeriesAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.TimeIncrement
import typingsSlinky.activexLibreoffice.com_.sun.star.chart.TimeInterval
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.DataPointLabel
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.FillBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.IncrementData
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.InterpretedData
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.LightSource
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.RelativePosition
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.RelativeSize
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.ScaleData
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.SubIncrement
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.Symbol
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.HighlightedRange
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.ComponentChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.PropertyInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend.TemplateIdentifier
import typingsSlinky.activexLibreoffice.com_.sun.star.connection.SocketPermission
import typingsSlinky.activexLibreoffice.com_.sun.star.container.ContainerEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard.ClipboardEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragGestureEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragSourceDragEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragSourceDropEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DragSourceEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetDragEnterEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetDragEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetDropEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd.DropTargetEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.deployment.UpdateInformationEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.document.CmisProperty
import typingsSlinky.activexLibreoffice.com_.sun.star.document.CmisVersion
import typingsSlinky.activexLibreoffice.com_.sun.star.document.DocumentEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.document.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.document.UndoManagerEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.BezierPoint
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.BoundVolume
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.CameraGeometry
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Direction3D
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeAdjustmentValue
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeParameter
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeParameterPair
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeSegment
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.EnhancedCustomShapeTextFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GluePoint
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.GluePoint2
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Hatch
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix3
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix4
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HomogenMatrixLine
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HomogenMatrixLine3
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.HomogenMatrixLine4
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonShape3D
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.Position3D
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.ConfigurationChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework.TabBarButton
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.InsertedObjectInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.VerbDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.embed.VisualRepresentation
import typingsSlinky.activexLibreoffice.com_.sun.star.form.DatabaseDeleteEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.form.DatabaseParameterEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.form.ErrorEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.ListEntryEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.form.runtime.FeatureState
import typingsSlinky.activexLibreoffice.com_.sun.star.form.runtime.FilterEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.formula.SymbolDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.BorderWidths
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ControlCommand
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.ControlEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchInformation
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchResultEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchStatement
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.FeatureStateEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.FrameActionEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.TitleChangedEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.ClipboardFormats
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.FontHeight
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.ItemStatus
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.LeftRightMargin
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.LeftRightMarginScale
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.Template
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.UpperLowerMargin
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.UpperLowerMarginScale
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.Verb
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.status.Visibility
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.AffineMatrix3D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.EllipticalArc
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerBezierSegment2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerRectangle2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.Matrix2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealRectangle3D
import typingsSlinky.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Boundary
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Calendar
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Calendar2
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.CalendarItem
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.CalendarItem2
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Currency2
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.ForbiddenCharacters
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.FormatElement
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Implementation
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LanguageCountryInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LineBreakHyphenationOptions
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LineBreakResults
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LineBreakUserOptions
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.LocaleDataItem
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.NativeNumberXmlAttributes
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.NumberFormatCode
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.ParseResult
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.TextConversionResult
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.LineDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.inspection.PropertyCategoryDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.io.DataTransferEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.io.FilePermission
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.DictionaryEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.DictionaryListEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.LinguServiceEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.ProofreadingResult
import typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2.SingleProofreadingError
import typingsSlinky.activexLibreoffice.com_.sun.star.logging.LogRecord
import typingsSlinky.activexLibreoffice.com_.sun.star.mail.MailAttachment
import typingsSlinky.activexLibreoffice.com_.sun.star.mozilla.MenuMultipleChange
import typingsSlinky.activexLibreoffice.com_.sun.star.mozilla.MenuSingleChange
import typingsSlinky.activexLibreoffice.com_.sun.star.packages.zip.ZipEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.presentation.ParagraphTarget
import typingsSlinky.activexLibreoffice.com_.sun.star.rdf.Statement
import typingsSlinky.activexLibreoffice.com_.sun.star.reflection.ParamInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.ARGBColor
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.AnimationAttributes
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.Caret
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.ColorProfile
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FloatingPointBitmapLayout
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontMetrics
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.FontRequest
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.IntegerBitmapLayout
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.Panose
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.RGBColor
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.RenderState
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.StringContext
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.StrokeAttributes
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.TextHit
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.Texture
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.ViewState
import typingsSlinky.activexLibreoffice.com_.sun.star.scanner.ScannerContext
import typingsSlinky.activexLibreoffice.com_.sun.star.script.AllEventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.script.ArrayWrapper
import typingsSlinky.activexLibreoffice.com_.sun.star.script.ContextInformation
import typingsSlinky.activexLibreoffice.com_.sun.star.script.EventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.script.FinishEngineEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.script.InterruptEngineEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.script.InvocationInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.script.ModuleInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.script.NativeObjectWrapper
import typingsSlinky.activexLibreoffice.com_.sun.star.script.ScriptEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.script.ScriptEventDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.script.vba.VBAScriptEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.DatabaseRegistrationEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.RowChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.RowsChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.SQLErrorEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.application.CopyTableRowEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.application.NamedDatabaseObject
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.ChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.DriverPropertyInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.security.AllPermission
import typingsSlinky.activexLibreoffice.com_.sun.star.security.CertAltNameEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.security.DocumentSignatureInformation
import typingsSlinky.activexLibreoffice.com_.sun.star.security.RuntimePermission
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ActivationEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ComplexReference
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DDEItemInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DDELinkInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldAutoShowInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldFilter
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldGroupInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldLayoutInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldReference
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotFieldSortInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotTableHeaderData
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotTablePositionData
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataPilotTableResultData
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.DataResult
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ExternalLinkInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ExternalReference
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FilterFieldValue
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaOpCodeMapEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FunctionArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.GoalResult
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.LocalizedName
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.MemberResult
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.NameToken
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.RangeSelectionEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.ResultEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SingleReference
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SolverConstraint
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.SubTotalColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableFilterField
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableFilterField2
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TableFilterField3
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.TablePageBreakData
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.opencl.OpenCLDevice
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.opencl.OpenCLPlatform
import typingsSlinky.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.style.LineSpacing
import typingsSlinky.activexLibreoffice.com_.sun.star.style.TabStop
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine
import typingsSlinky.activexLibreoffice.com_.sun.star.table.BorderLine2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorder2
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableBorderDistances
import typingsSlinky.activexLibreoffice.com_.sun.star.table.TableSortField
import typingsSlinky.activexLibreoffice.com_.sun.star.task.UrlRecord
import typingsSlinky.activexLibreoffice.com_.sun.star.task.UserRecord
import typingsSlinky.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typingsSlinky.activexLibreoffice.com_.sun.star.text.HoriOrientationFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.text.MailMergeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.text.SectionFileLink
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TableColumnSeparator
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextColumn
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextMarkupDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextPosition
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextRangeSelection
import typingsSlinky.activexLibreoffice.com_.sun.star.text.VertOrientationFormat
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CheckinArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Command
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CommandInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CommandInfoChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentProviderInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.CrossReference
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.DocumentHeaderField
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ExportStreamInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FetchResult
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FolderList
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.FolderListEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.GlobalTransferCommandArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.GlobalTransferCommandArgument2
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.InsertCommandArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.InsertCommandArgument2
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Link
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ListAction
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ListEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Lock
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.LockEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.NumberedSortingInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.OpenCommandArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.OpenCommandArgument2
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.OpenCommandArgument3
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PostCommandArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PostCommandArgument2
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PropertyCommandArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.PropertyValueInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RecipientInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RemoteContentProviderChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Rule
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RuleSet
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.RuleTerm
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SearchCommandArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SearchCriterium
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SearchInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SendInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SendMediaTypes
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.SortingInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransferInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransferInfo2
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.TransferResult
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.WelcomeDynamicResultSetStruct
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ConfigurationEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ContextChangeEventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.ContextMenuExecuteEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.LayoutSize
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.DialogClosedEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.FilePickerEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Uik
import typingsSlinky.activexLibreoffice.com_.sun.star.util.AliasProgrammaticPair
import typingsSlinky.activexLibreoffice.com_.sun.star.util.AtomClassRequest
import typingsSlinky.activexLibreoffice.com_.sun.star.util.AtomDescription
import typingsSlinky.activexLibreoffice.com_.sun.star.util.CellProtection
import typingsSlinky.activexLibreoffice.com_.sun.star.util.ChangesEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DataEditorEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTimeRange
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTimeWithTimezone
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateWithTimezone
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Duration
import typingsSlinky.activexLibreoffice.com_.sun.star.util.ElementChange
import typingsSlinky.activexLibreoffice.com_.sun.star.util.ModeChangeEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.util.RevisionTag
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SearchOptions
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SearchOptions2
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SearchResult
import typingsSlinky.activexLibreoffice.com_.sun.star.util.SortField
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Time
import typingsSlinky.activexLibreoffice.com_.sun.star.util.TimeWithTimezone
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.activexLibreoffice.com_.sun.star.view.PrintJobEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.view.PrintableStateEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.Attribute
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.AttributeData
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.FastAttribute
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax.ElementStackItem
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.csax.XMLAttribute
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.InputSource
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructNameMap extends js.Object {
  @JSName("com.sun.star.accessibility.AccessibleEventObject")
  var comDotsunDotstarDotaccessibilityDotAccessibleEventObject: AccessibleEventObject = js.native
  @JSName("com.sun.star.accessibility.AccessibleRelation")
  var comDotsunDotstarDotaccessibilityDotAccessibleRelation: AccessibleRelation = js.native
  @JSName("com.sun.star.accessibility.AccessibleTableModelChange")
  var comDotsunDotstarDotaccessibilityDotAccessibleTableModelChange: AccessibleTableModelChange = js.native
  @JSName("com.sun.star.accessibility.TextSegment")
  var comDotsunDotstarDotaccessibilityDotTextSegment: TextSegment = js.native
  @JSName("com.sun.star.animations.Event")
  var comDotsunDotstarDotanimationsDotEvent: Event = js.native
  @JSName("com.sun.star.animations.TargetProperties")
  var comDotsunDotstarDotanimationsDotTargetProperties: TargetProperties = js.native
  @JSName("com.sun.star.animations.TimeFilterPair")
  var comDotsunDotstarDotanimationsDotTimeFilterPair: TimeFilterPair = js.native
  @JSName("com.sun.star.animations.ValuePair")
  var comDotsunDotstarDotanimationsDotValuePair: ValuePair = js.native
  @JSName("com.sun.star.awt.ActionEvent")
  var comDotsunDotstarDotawtDotActionEvent: ActionEvent = js.native
  @JSName("com.sun.star.awt.AdjustmentEvent")
  var comDotsunDotstarDotawtDotAdjustmentEvent: AdjustmentEvent = js.native
  @JSName("com.sun.star.awt.DeviceInfo")
  var comDotsunDotstarDotawtDotDeviceInfo: DeviceInfo = js.native
  @JSName("com.sun.star.awt.DockingData")
  var comDotsunDotstarDotawtDotDockingData: DockingData = js.native
  @JSName("com.sun.star.awt.DockingEvent")
  var comDotsunDotstarDotawtDotDockingEvent: DockingEvent = js.native
  @JSName("com.sun.star.awt.EndDockingEvent")
  var comDotsunDotstarDotawtDotEndDockingEvent: EndDockingEvent = js.native
  @JSName("com.sun.star.awt.EndPopupModeEvent")
  var comDotsunDotstarDotawtDotEndPopupModeEvent: EndPopupModeEvent = js.native
  @JSName("com.sun.star.awt.EnhancedMouseEvent")
  var comDotsunDotstarDotawtDotEnhancedMouseEvent: EnhancedMouseEvent = js.native
  @JSName("com.sun.star.awt.FocusEvent")
  var comDotsunDotstarDotawtDotFocusEvent: FocusEvent = js.native
  @JSName("com.sun.star.awt.FontDescriptor")
  var comDotsunDotstarDotawtDotFontDescriptor: FontDescriptor = js.native
  @JSName("com.sun.star.awt.Gradient")
  var comDotsunDotstarDotawtDotGradient: Gradient = js.native
  @JSName("com.sun.star.awt.InputEvent")
  var comDotsunDotstarDotawtDotInputEvent: InputEvent = js.native
  @JSName("com.sun.star.awt.ItemEvent")
  var comDotsunDotstarDotawtDotItemEvent: ItemEvent = js.native
  @JSName("com.sun.star.awt.ItemListEvent")
  var comDotsunDotstarDotawtDotItemListEvent: ItemListEvent = js.native
  @JSName("com.sun.star.awt.KeyEvent")
  var comDotsunDotstarDotawtDotKeyEvent: KeyEvent = js.native
  @JSName("com.sun.star.awt.KeyStroke")
  var comDotsunDotstarDotawtDotKeyStroke: KeyStroke = js.native
  @JSName("com.sun.star.awt.MenuEvent")
  var comDotsunDotstarDotawtDotMenuEvent: MenuEvent = js.native
  @JSName("com.sun.star.awt.MouseEvent")
  var comDotsunDotstarDotawtDotMouseEvent: MouseEvent = js.native
  @JSName("com.sun.star.awt.PaintEvent")
  var comDotsunDotstarDotawtDotPaintEvent: PaintEvent = js.native
  @JSName("com.sun.star.awt.Point")
  var comDotsunDotstarDotawtDotPoint: Point = js.native
  @JSName("com.sun.star.awt.Rectangle")
  var comDotsunDotstarDotawtDotRectangle: Rectangle = js.native
  @JSName("com.sun.star.awt.Selection")
  var comDotsunDotstarDotawtDotSelection: Selection = js.native
  @JSName("com.sun.star.awt.SimpleFontMetric")
  var comDotsunDotstarDotawtDotSimpleFontMetric: SimpleFontMetric = js.native
  @JSName("com.sun.star.awt.Size")
  var comDotsunDotstarDotawtDotSize: Size = js.native
  @JSName("com.sun.star.awt.SpinEvent")
  var comDotsunDotstarDotawtDotSpinEvent: SpinEvent = js.native
  @JSName("com.sun.star.awt.SystemDependentXWindow")
  var comDotsunDotstarDotawtDotSystemDependentXWindow: SystemDependentXWindow = js.native
  @JSName("com.sun.star.awt.TextEvent")
  var comDotsunDotstarDotawtDotTextEvent: TextEvent = js.native
  @JSName("com.sun.star.awt.VclContainerEvent")
  var comDotsunDotstarDotawtDotVclContainerEvent: VclContainerEvent = js.native
  @JSName("com.sun.star.awt.WindowDescriptor")
  var comDotsunDotstarDotawtDotWindowDescriptor: WindowDescriptor = js.native
  @JSName("com.sun.star.awt.WindowEvent")
  var comDotsunDotstarDotawtDotWindowEvent: WindowEvent = js.native
  @JSName("com.sun.star.awt.grid.GridColumnEvent")
  var comDotsunDotstarDotawtDotgridDotGridColumnEvent: GridColumnEvent = js.native
  @JSName("com.sun.star.awt.grid.GridDataEvent")
  var comDotsunDotstarDotawtDotgridDotGridDataEvent: GridDataEvent = js.native
  @JSName("com.sun.star.awt.grid.GridSelectionEvent")
  var comDotsunDotstarDotawtDotgridDotGridSelectionEvent: GridSelectionEvent = js.native
  @JSName("com.sun.star.awt.tab.TabPageActivatedEvent")
  var comDotsunDotstarDotawtDottabDotTabPageActivatedEvent: TabPageActivatedEvent = js.native
  @JSName("com.sun.star.awt.tree.TreeDataModelEvent")
  var comDotsunDotstarDotawtDottreeDotTreeDataModelEvent: TreeDataModelEvent = js.native
  @JSName("com.sun.star.awt.tree.TreeExpansionEvent")
  var comDotsunDotstarDotawtDottreeDotTreeExpansionEvent: TreeExpansionEvent = js.native
  @JSName("com.sun.star.beans.GetDirectPropertyTolerantResult")
  var comDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult: GetDirectPropertyTolerantResult = js.native
  @JSName("com.sun.star.beans.GetPropertyTolerantResult")
  var comDotsunDotstarDotbeansDotGetPropertyTolerantResult: GetPropertyTolerantResult = js.native
  @JSName("com.sun.star.beans.NamedValue")
  var comDotsunDotstarDotbeansDotNamedValue: NamedValue = js.native
  @JSName("com.sun.star.beans.Property")
  var comDotsunDotstarDotbeansDotProperty: Property = js.native
  @JSName("com.sun.star.beans.PropertyChangeEvent")
  var comDotsunDotstarDotbeansDotPropertyChangeEvent: PropertyChangeEvent = js.native
  @JSName("com.sun.star.beans.PropertySetInfoChangeEvent")
  var comDotsunDotstarDotbeansDotPropertySetInfoChangeEvent: PropertySetInfoChangeEvent = js.native
  @JSName("com.sun.star.beans.PropertyStateChangeEvent")
  var comDotsunDotstarDotbeansDotPropertyStateChangeEvent: PropertyStateChangeEvent = js.native
  @JSName("com.sun.star.beans.PropertyValue")
  var comDotsunDotstarDotbeansDotPropertyValue: PropertyValue = js.native
  @JSName("com.sun.star.beans.SetPropertyTolerantFailed")
  var comDotsunDotstarDotbeansDotSetPropertyTolerantFailed: SetPropertyTolerantFailed = js.native
  @JSName("com.sun.star.beans.StringPair")
  var comDotsunDotstarDotbeansDotStringPair: StringPair = js.native
  @JSName("com.sun.star.bridge.ProtocolProperty")
  var comDotsunDotstarDotbridgeDotProtocolProperty: ProtocolProperty = js.native
  @JSName("com.sun.star.bridge.oleautomation.Currency")
  var comDotsunDotstarDotbridgeDotoleautomationDotCurrency: Currency = js.native
  @JSName("com.sun.star.bridge.oleautomation.Date")
  var comDotsunDotstarDotbridgeDotoleautomationDotDate: Date = js.native
  @JSName("com.sun.star.bridge.oleautomation.Decimal")
  var comDotsunDotstarDotbridgeDotoleautomationDotDecimal: Decimal = js.native
  @JSName("com.sun.star.bridge.oleautomation.NamedArgument")
  var comDotsunDotstarDotbridgeDotoleautomationDotNamedArgument: NamedArgument = js.native
  @JSName("com.sun.star.bridge.oleautomation.PropertyPutArgument")
  var comDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument: PropertyPutArgument = js.native
  @JSName("com.sun.star.bridge.oleautomation.SCode")
  var comDotsunDotstarDotbridgeDotoleautomationDotSCode: SCode = js.native
  @JSName("com.sun.star.chart2.DataPointLabel")
  var comDotsunDotstarDotchart2DotDataPointLabel: DataPointLabel = js.native
  @JSName("com.sun.star.chart2.FillBitmap")
  var comDotsunDotstarDotchart2DotFillBitmap: FillBitmap = js.native
  @JSName("com.sun.star.chart2.IncrementData")
  var comDotsunDotstarDotchart2DotIncrementData: IncrementData = js.native
  @JSName("com.sun.star.chart2.InterpretedData")
  var comDotsunDotstarDotchart2DotInterpretedData: InterpretedData = js.native
  @JSName("com.sun.star.chart2.LightSource")
  var comDotsunDotstarDotchart2DotLightSource: LightSource = js.native
  @JSName("com.sun.star.chart2.RelativePosition")
  var comDotsunDotstarDotchart2DotRelativePosition: RelativePosition = js.native
  @JSName("com.sun.star.chart2.RelativeSize")
  var comDotsunDotstarDotchart2DotRelativeSize: RelativeSize = js.native
  @JSName("com.sun.star.chart2.ScaleData")
  var comDotsunDotstarDotchart2DotScaleData: ScaleData = js.native
  @JSName("com.sun.star.chart2.SubIncrement")
  var comDotsunDotstarDotchart2DotSubIncrement: SubIncrement = js.native
  @JSName("com.sun.star.chart2.Symbol")
  var comDotsunDotstarDotchart2DotSymbol: Symbol = js.native
  @JSName("com.sun.star.chart2.data.HighlightedRange")
  var comDotsunDotstarDotchart2DotdataDotHighlightedRange: HighlightedRange = js.native
  @JSName("com.sun.star.chart.ChartDataChangeEvent")
  var comDotsunDotstarDotchartDotChartDataChangeEvent: ChartDataChangeEvent = js.native
  @JSName("com.sun.star.chart.ChartDataRow")
  var comDotsunDotstarDotchartDotChartDataRow: ChartDataRow = js.native
  @JSName("com.sun.star.chart.ChartDataValue")
  var comDotsunDotstarDotchartDotChartDataValue: ChartDataValue = js.native
  @JSName("com.sun.star.chart.ChartSeriesAddress")
  var comDotsunDotstarDotchartDotChartSeriesAddress: ChartSeriesAddress = js.native
  @JSName("com.sun.star.chart.TimeIncrement")
  var comDotsunDotstarDotchartDotTimeIncrement: TimeIncrement = js.native
  @JSName("com.sun.star.chart.TimeInterval")
  var comDotsunDotstarDotchartDotTimeInterval: TimeInterval = js.native
  @JSName("com.sun.star.configuration.backend.ComponentChangeEvent")
  var comDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent: ComponentChangeEvent = js.native
  @JSName("com.sun.star.configuration.backend.PropertyInfo")
  var comDotsunDotstarDotconfigurationDotbackendDotPropertyInfo: PropertyInfo = js.native
  @JSName("com.sun.star.configuration.backend.TemplateIdentifier")
  var comDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier: TemplateIdentifier = js.native
  @JSName("com.sun.star.connection.SocketPermission")
  var comDotsunDotstarDotconnectionDotSocketPermission: SocketPermission = js.native
  @JSName("com.sun.star.container.ContainerEvent")
  var comDotsunDotstarDotcontainerDotContainerEvent: ContainerEvent = js.native
  @JSName("com.sun.star.datatransfer.DataFlavor")
  var comDotsunDotstarDotdatatransferDotDataFlavor: DataFlavor = js.native
  @JSName("com.sun.star.datatransfer.clipboard.ClipboardEvent")
  var comDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent: ClipboardEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DragGestureEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragGestureEvent: DragGestureEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DragSourceDragEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent: DragSourceDragEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DragSourceDropEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent: DragSourceDropEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DragSourceEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDragSourceEvent: DragSourceEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DropTargetDragEnterEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent: DropTargetDragEnterEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DropTargetDragEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent: DropTargetDragEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DropTargetDropEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent: DropTargetDropEvent = js.native
  @JSName("com.sun.star.datatransfer.dnd.DropTargetEvent")
  var comDotsunDotstarDotdatatransferDotdndDotDropTargetEvent: DropTargetEvent = js.native
  @JSName("com.sun.star.deployment.UpdateInformationEntry")
  var comDotsunDotstarDotdeploymentDotUpdateInformationEntry: UpdateInformationEntry = js.native
  @JSName("com.sun.star.document.CmisProperty")
  var comDotsunDotstarDotdocumentDotCmisProperty: CmisProperty = js.native
  @JSName("com.sun.star.document.CmisVersion")
  var comDotsunDotstarDotdocumentDotCmisVersion: CmisVersion = js.native
  @JSName("com.sun.star.document.DocumentEvent")
  var comDotsunDotstarDotdocumentDotDocumentEvent: DocumentEvent = js.native
  @JSName("com.sun.star.document.EventObject")
  var comDotsunDotstarDotdocumentDotEventObject: EventObject = js.native
  @JSName("com.sun.star.document.UndoManagerEvent")
  var comDotsunDotstarDotdocumentDotUndoManagerEvent: UndoManagerEvent = js.native
  @JSName("com.sun.star.drawing.BezierPoint")
  var comDotsunDotstarDotdrawingDotBezierPoint: BezierPoint = js.native
  @JSName("com.sun.star.drawing.BoundVolume")
  var comDotsunDotstarDotdrawingDotBoundVolume: BoundVolume = js.native
  @JSName("com.sun.star.drawing.CameraGeometry")
  var comDotsunDotstarDotdrawingDotCameraGeometry: CameraGeometry = js.native
  @JSName("com.sun.star.drawing.Direction3D")
  var comDotsunDotstarDotdrawingDotDirection3D: Direction3D = js.native
  @JSName("com.sun.star.drawing.EnhancedCustomShapeAdjustmentValue")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue: EnhancedCustomShapeAdjustmentValue = js.native
  @JSName("com.sun.star.drawing.EnhancedCustomShapeParameter")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter: EnhancedCustomShapeParameter = js.native
  @JSName("com.sun.star.drawing.EnhancedCustomShapeParameterPair")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair: EnhancedCustomShapeParameterPair = js.native
  @JSName("com.sun.star.drawing.EnhancedCustomShapeSegment")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment: EnhancedCustomShapeSegment = js.native
  @JSName("com.sun.star.drawing.EnhancedCustomShapeTextFrame")
  var comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame: EnhancedCustomShapeTextFrame = js.native
  @JSName("com.sun.star.drawing.GluePoint")
  var comDotsunDotstarDotdrawingDotGluePoint: GluePoint = js.native
  @JSName("com.sun.star.drawing.GluePoint2")
  var comDotsunDotstarDotdrawingDotGluePoint2: GluePoint2 = js.native
  @JSName("com.sun.star.drawing.Hatch")
  var comDotsunDotstarDotdrawingDotHatch: Hatch = js.native
  @JSName("com.sun.star.drawing.HomogenMatrix")
  var comDotsunDotstarDotdrawingDotHomogenMatrix: HomogenMatrix = js.native
  @JSName("com.sun.star.drawing.HomogenMatrix3")
  var comDotsunDotstarDotdrawingDotHomogenMatrix3: HomogenMatrix3 = js.native
  @JSName("com.sun.star.drawing.HomogenMatrix4")
  var comDotsunDotstarDotdrawingDotHomogenMatrix4: HomogenMatrix4 = js.native
  @JSName("com.sun.star.drawing.HomogenMatrixLine")
  var comDotsunDotstarDotdrawingDotHomogenMatrixLine: HomogenMatrixLine = js.native
  @JSName("com.sun.star.drawing.HomogenMatrixLine3")
  var comDotsunDotstarDotdrawingDotHomogenMatrixLine3: HomogenMatrixLine3 = js.native
  @JSName("com.sun.star.drawing.HomogenMatrixLine4")
  var comDotsunDotstarDotdrawingDotHomogenMatrixLine4: HomogenMatrixLine4 = js.native
  @JSName("com.sun.star.drawing.LineDash")
  var comDotsunDotstarDotdrawingDotLineDash: LineDash = js.native
  @JSName("com.sun.star.drawing.PolyPolygonBezierCoords")
  var comDotsunDotstarDotdrawingDotPolyPolygonBezierCoords: PolyPolygonBezierCoords = js.native
  @JSName("com.sun.star.drawing.PolyPolygonShape3D")
  var comDotsunDotstarDotdrawingDotPolyPolygonShape3D: PolyPolygonShape3D = js.native
  @JSName("com.sun.star.drawing.Position3D")
  var comDotsunDotstarDotdrawingDotPosition3D: Position3D = js.native
  @JSName("com.sun.star.drawing.framework.ConfigurationChangeEvent")
  var comDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent: ConfigurationChangeEvent = js.native
  @JSName("com.sun.star.drawing.framework.TabBarButton")
  var comDotsunDotstarDotdrawingDotframeworkDotTabBarButton: TabBarButton = js.native
  @JSName("com.sun.star.embed.InsertedObjectInfo")
  var comDotsunDotstarDotembedDotInsertedObjectInfo: InsertedObjectInfo = js.native
  @JSName("com.sun.star.embed.VerbDescriptor")
  var comDotsunDotstarDotembedDotVerbDescriptor: VerbDescriptor = js.native
  @JSName("com.sun.star.embed.VisualRepresentation")
  var comDotsunDotstarDotembedDotVisualRepresentation: VisualRepresentation = js.native
  @JSName("com.sun.star.form.DatabaseDeleteEvent")
  var comDotsunDotstarDotformDotDatabaseDeleteEvent: DatabaseDeleteEvent = js.native
  @JSName("com.sun.star.form.DatabaseParameterEvent")
  var comDotsunDotstarDotformDotDatabaseParameterEvent: DatabaseParameterEvent = js.native
  @JSName("com.sun.star.form.ErrorEvent")
  var comDotsunDotstarDotformDotErrorEvent: ErrorEvent = js.native
  @JSName("com.sun.star.form.binding.ListEntryEvent")
  var comDotsunDotstarDotformDotbindingDotListEntryEvent: ListEntryEvent = js.native
  @JSName("com.sun.star.form.runtime.FeatureState")
  var comDotsunDotstarDotformDotruntimeDotFeatureState: FeatureState = js.native
  @JSName("com.sun.star.form.runtime.FilterEvent")
  var comDotsunDotstarDotformDotruntimeDotFilterEvent: FilterEvent = js.native
  @JSName("com.sun.star.formula.SymbolDescriptor")
  var comDotsunDotstarDotformulaDotSymbolDescriptor: SymbolDescriptor = js.native
  @JSName("com.sun.star.frame.BorderWidths")
  var comDotsunDotstarDotframeDotBorderWidths: BorderWidths = js.native
  @JSName("com.sun.star.frame.ControlCommand")
  var comDotsunDotstarDotframeDotControlCommand: ControlCommand = js.native
  @JSName("com.sun.star.frame.ControlEvent")
  var comDotsunDotstarDotframeDotControlEvent: ControlEvent = js.native
  @JSName("com.sun.star.frame.DispatchDescriptor")
  var comDotsunDotstarDotframeDotDispatchDescriptor: DispatchDescriptor = js.native
  @JSName("com.sun.star.frame.DispatchInformation")
  var comDotsunDotstarDotframeDotDispatchInformation: DispatchInformation = js.native
  @JSName("com.sun.star.frame.DispatchResultEvent")
  var comDotsunDotstarDotframeDotDispatchResultEvent: DispatchResultEvent = js.native
  @JSName("com.sun.star.frame.DispatchStatement")
  var comDotsunDotstarDotframeDotDispatchStatement: DispatchStatement = js.native
  @JSName("com.sun.star.frame.FeatureStateEvent")
  var comDotsunDotstarDotframeDotFeatureStateEvent: FeatureStateEvent = js.native
  @JSName("com.sun.star.frame.FrameActionEvent")
  var comDotsunDotstarDotframeDotFrameActionEvent: FrameActionEvent = js.native
  @JSName("com.sun.star.frame.TitleChangedEvent")
  var comDotsunDotstarDotframeDotTitleChangedEvent: TitleChangedEvent = js.native
  @JSName("com.sun.star.frame.status.ClipboardFormats")
  var comDotsunDotstarDotframeDotstatusDotClipboardFormats: ClipboardFormats = js.native
  @JSName("com.sun.star.frame.status.FontHeight")
  var comDotsunDotstarDotframeDotstatusDotFontHeight: FontHeight = js.native
  @JSName("com.sun.star.frame.status.ItemStatus")
  var comDotsunDotstarDotframeDotstatusDotItemStatus: ItemStatus = js.native
  @JSName("com.sun.star.frame.status.LeftRightMargin")
  var comDotsunDotstarDotframeDotstatusDotLeftRightMargin: LeftRightMargin = js.native
  @JSName("com.sun.star.frame.status.LeftRightMarginScale")
  var comDotsunDotstarDotframeDotstatusDotLeftRightMarginScale: LeftRightMarginScale = js.native
  @JSName("com.sun.star.frame.status.Template")
  var comDotsunDotstarDotframeDotstatusDotTemplate: Template = js.native
  @JSName("com.sun.star.frame.status.UpperLowerMargin")
  var comDotsunDotstarDotframeDotstatusDotUpperLowerMargin: UpperLowerMargin = js.native
  @JSName("com.sun.star.frame.status.UpperLowerMarginScale")
  var comDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale: UpperLowerMarginScale = js.native
  @JSName("com.sun.star.frame.status.Verb")
  var comDotsunDotstarDotframeDotstatusDotVerb: Verb = js.native
  @JSName("com.sun.star.frame.status.Visibility")
  var comDotsunDotstarDotframeDotstatusDotVisibility: Visibility = js.native
  @JSName("com.sun.star.geometry.AffineMatrix2D")
  var comDotsunDotstarDotgeometryDotAffineMatrix2D: AffineMatrix2D = js.native
  @JSName("com.sun.star.geometry.AffineMatrix3D")
  var comDotsunDotstarDotgeometryDotAffineMatrix3D: AffineMatrix3D = js.native
  @JSName("com.sun.star.geometry.EllipticalArc")
  var comDotsunDotstarDotgeometryDotEllipticalArc: EllipticalArc = js.native
  @JSName("com.sun.star.geometry.IntegerBezierSegment2D")
  var comDotsunDotstarDotgeometryDotIntegerBezierSegment2D: IntegerBezierSegment2D = js.native
  @JSName("com.sun.star.geometry.IntegerPoint2D")
  var comDotsunDotstarDotgeometryDotIntegerPoint2D: IntegerPoint2D = js.native
  @JSName("com.sun.star.geometry.IntegerRectangle2D")
  var comDotsunDotstarDotgeometryDotIntegerRectangle2D: IntegerRectangle2D = js.native
  @JSName("com.sun.star.geometry.IntegerSize2D")
  var comDotsunDotstarDotgeometryDotIntegerSize2D: IntegerSize2D = js.native
  @JSName("com.sun.star.geometry.Matrix2D")
  var comDotsunDotstarDotgeometryDotMatrix2D: Matrix2D = js.native
  @JSName("com.sun.star.geometry.RealBezierSegment2D")
  var comDotsunDotstarDotgeometryDotRealBezierSegment2D: RealBezierSegment2D = js.native
  @JSName("com.sun.star.geometry.RealPoint2D")
  var comDotsunDotstarDotgeometryDotRealPoint2D: RealPoint2D = js.native
  @JSName("com.sun.star.geometry.RealRectangle2D")
  var comDotsunDotstarDotgeometryDotRealRectangle2D: RealRectangle2D = js.native
  @JSName("com.sun.star.geometry.RealRectangle3D")
  var comDotsunDotstarDotgeometryDotRealRectangle3D: RealRectangle3D = js.native
  @JSName("com.sun.star.geometry.RealSize2D")
  var comDotsunDotstarDotgeometryDotRealSize2D: RealSize2D = js.native
  @JSName("com.sun.star.i18n.Boundary")
  var comDotsunDotstarDoti18nDotBoundary: Boundary = js.native
  @JSName("com.sun.star.i18n.Calendar")
  var comDotsunDotstarDoti18nDotCalendar: Calendar = js.native
  @JSName("com.sun.star.i18n.Calendar2")
  var comDotsunDotstarDoti18nDotCalendar2: Calendar2 = js.native
  @JSName("com.sun.star.i18n.CalendarItem")
  var comDotsunDotstarDoti18nDotCalendarItem: CalendarItem = js.native
  @JSName("com.sun.star.i18n.CalendarItem2")
  var comDotsunDotstarDoti18nDotCalendarItem2: CalendarItem2 = js.native
  @JSName("com.sun.star.i18n.Currency")
  var comDotsunDotstarDoti18nDotCurrency: typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Currency = js.native
  @JSName("com.sun.star.i18n.Currency2")
  var comDotsunDotstarDoti18nDotCurrency2: Currency2 = js.native
  @JSName("com.sun.star.i18n.ForbiddenCharacters")
  var comDotsunDotstarDoti18nDotForbiddenCharacters: ForbiddenCharacters = js.native
  @JSName("com.sun.star.i18n.FormatElement")
  var comDotsunDotstarDoti18nDotFormatElement: FormatElement = js.native
  @JSName("com.sun.star.i18n.Implementation")
  var comDotsunDotstarDoti18nDotImplementation: Implementation = js.native
  @JSName("com.sun.star.i18n.LanguageCountryInfo")
  var comDotsunDotstarDoti18nDotLanguageCountryInfo: LanguageCountryInfo = js.native
  @JSName("com.sun.star.i18n.LineBreakHyphenationOptions")
  var comDotsunDotstarDoti18nDotLineBreakHyphenationOptions: LineBreakHyphenationOptions = js.native
  @JSName("com.sun.star.i18n.LineBreakResults")
  var comDotsunDotstarDoti18nDotLineBreakResults: LineBreakResults = js.native
  @JSName("com.sun.star.i18n.LineBreakUserOptions")
  var comDotsunDotstarDoti18nDotLineBreakUserOptions: LineBreakUserOptions = js.native
  @JSName("com.sun.star.i18n.LocaleDataItem")
  var comDotsunDotstarDoti18nDotLocaleDataItem: LocaleDataItem = js.native
  @JSName("com.sun.star.i18n.NativeNumberXmlAttributes")
  var comDotsunDotstarDoti18nDotNativeNumberXmlAttributes: NativeNumberXmlAttributes = js.native
  @JSName("com.sun.star.i18n.NumberFormatCode")
  var comDotsunDotstarDoti18nDotNumberFormatCode: NumberFormatCode = js.native
  @JSName("com.sun.star.i18n.ParseResult")
  var comDotsunDotstarDoti18nDotParseResult: ParseResult = js.native
  @JSName("com.sun.star.i18n.TextConversionResult")
  var comDotsunDotstarDoti18nDotTextConversionResult: TextConversionResult = js.native
  @JSName("com.sun.star.inspection.LineDescriptor")
  var comDotsunDotstarDotinspectionDotLineDescriptor: LineDescriptor = js.native
  @JSName("com.sun.star.inspection.PropertyCategoryDescriptor")
  var comDotsunDotstarDotinspectionDotPropertyCategoryDescriptor: PropertyCategoryDescriptor = js.native
  @JSName("com.sun.star.io.DataTransferEvent")
  var comDotsunDotstarDotioDotDataTransferEvent: DataTransferEvent = js.native
  @JSName("com.sun.star.io.FilePermission")
  var comDotsunDotstarDotioDotFilePermission: FilePermission = js.native
  @JSName("com.sun.star.lang.EventObject")
  var comDotsunDotstarDotlangDotEventObject: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject = js.native
  @JSName("com.sun.star.lang.Locale")
  var comDotsunDotstarDotlangDotLocale: Locale = js.native
  @JSName("com.sun.star.linguistic2.DictionaryEvent")
  var comDotsunDotstarDotlinguistic2DotDictionaryEvent: DictionaryEvent = js.native
  @JSName("com.sun.star.linguistic2.DictionaryListEvent")
  var comDotsunDotstarDotlinguistic2DotDictionaryListEvent: DictionaryListEvent = js.native
  @JSName("com.sun.star.linguistic2.LinguServiceEvent")
  var comDotsunDotstarDotlinguistic2DotLinguServiceEvent: LinguServiceEvent = js.native
  @JSName("com.sun.star.linguistic2.ProofreadingResult")
  var comDotsunDotstarDotlinguistic2DotProofreadingResult: ProofreadingResult = js.native
  @JSName("com.sun.star.linguistic2.SingleProofreadingError")
  var comDotsunDotstarDotlinguistic2DotSingleProofreadingError: SingleProofreadingError = js.native
  @JSName("com.sun.star.logging.LogRecord")
  var comDotsunDotstarDotloggingDotLogRecord: LogRecord = js.native
  @JSName("com.sun.star.mail.MailAttachment")
  var comDotsunDotstarDotmailDotMailAttachment: MailAttachment = js.native
  @JSName("com.sun.star.mozilla.MenuMultipleChange")
  var comDotsunDotstarDotmozillaDotMenuMultipleChange: MenuMultipleChange = js.native
  @JSName("com.sun.star.mozilla.MenuSingleChange")
  var comDotsunDotstarDotmozillaDotMenuSingleChange: MenuSingleChange = js.native
  @JSName("com.sun.star.packages.zip.ZipEntry")
  var comDotsunDotstarDotpackagesDotzipDotZipEntry: ZipEntry = js.native
  @JSName("com.sun.star.presentation.ParagraphTarget")
  var comDotsunDotstarDotpresentationDotParagraphTarget: ParagraphTarget = js.native
  @JSName("com.sun.star.rdf.Statement")
  var comDotsunDotstarDotrdfDotStatement: Statement = js.native
  @JSName("com.sun.star.reflection.ParamInfo")
  var comDotsunDotstarDotreflectionDotParamInfo: ParamInfo = js.native
  @JSName("com.sun.star.rendering.ARGBColor")
  var comDotsunDotstarDotrenderingDotARGBColor: ARGBColor = js.native
  @JSName("com.sun.star.rendering.AnimationAttributes")
  var comDotsunDotstarDotrenderingDotAnimationAttributes: AnimationAttributes = js.native
  @JSName("com.sun.star.rendering.Caret")
  var comDotsunDotstarDotrenderingDotCaret: Caret = js.native
  @JSName("com.sun.star.rendering.ColorProfile")
  var comDotsunDotstarDotrenderingDotColorProfile: ColorProfile = js.native
  @JSName("com.sun.star.rendering.FloatingPointBitmapLayout")
  var comDotsunDotstarDotrenderingDotFloatingPointBitmapLayout: FloatingPointBitmapLayout = js.native
  @JSName("com.sun.star.rendering.FontInfo")
  var comDotsunDotstarDotrenderingDotFontInfo: FontInfo = js.native
  @JSName("com.sun.star.rendering.FontMetrics")
  var comDotsunDotstarDotrenderingDotFontMetrics: FontMetrics = js.native
  @JSName("com.sun.star.rendering.FontRequest")
  var comDotsunDotstarDotrenderingDotFontRequest: FontRequest = js.native
  @JSName("com.sun.star.rendering.IntegerBitmapLayout")
  var comDotsunDotstarDotrenderingDotIntegerBitmapLayout: IntegerBitmapLayout = js.native
  @JSName("com.sun.star.rendering.Panose")
  var comDotsunDotstarDotrenderingDotPanose: Panose = js.native
  @JSName("com.sun.star.rendering.RGBColor")
  var comDotsunDotstarDotrenderingDotRGBColor: RGBColor = js.native
  @JSName("com.sun.star.rendering.RenderState")
  var comDotsunDotstarDotrenderingDotRenderState: RenderState = js.native
  @JSName("com.sun.star.rendering.StringContext")
  var comDotsunDotstarDotrenderingDotStringContext: StringContext = js.native
  @JSName("com.sun.star.rendering.StrokeAttributes")
  var comDotsunDotstarDotrenderingDotStrokeAttributes: StrokeAttributes = js.native
  @JSName("com.sun.star.rendering.TextHit")
  var comDotsunDotstarDotrenderingDotTextHit: TextHit = js.native
  @JSName("com.sun.star.rendering.Texture")
  var comDotsunDotstarDotrenderingDotTexture: Texture = js.native
  @JSName("com.sun.star.rendering.ViewState")
  var comDotsunDotstarDotrenderingDotViewState: ViewState = js.native
  @JSName("com.sun.star.scanner.ScannerContext")
  var comDotsunDotstarDotscannerDotScannerContext: ScannerContext = js.native
  @JSName("com.sun.star.script.AllEventObject")
  var comDotsunDotstarDotscriptDotAllEventObject: AllEventObject = js.native
  @JSName("com.sun.star.script.ArrayWrapper")
  var comDotsunDotstarDotscriptDotArrayWrapper: ArrayWrapper = js.native
  @JSName("com.sun.star.script.ContextInformation")
  var comDotsunDotstarDotscriptDotContextInformation: ContextInformation = js.native
  @JSName("com.sun.star.script.EventListener")
  var comDotsunDotstarDotscriptDotEventListener: EventListener = js.native
  @JSName("com.sun.star.script.FinishEngineEvent")
  var comDotsunDotstarDotscriptDotFinishEngineEvent: FinishEngineEvent = js.native
  @JSName("com.sun.star.script.InterruptEngineEvent")
  var comDotsunDotstarDotscriptDotInterruptEngineEvent: InterruptEngineEvent = js.native
  @JSName("com.sun.star.script.InvocationInfo")
  var comDotsunDotstarDotscriptDotInvocationInfo: InvocationInfo = js.native
  @JSName("com.sun.star.script.ModuleInfo")
  var comDotsunDotstarDotscriptDotModuleInfo: ModuleInfo = js.native
  @JSName("com.sun.star.script.NativeObjectWrapper")
  var comDotsunDotstarDotscriptDotNativeObjectWrapper: NativeObjectWrapper = js.native
  @JSName("com.sun.star.script.ScriptEvent")
  var comDotsunDotstarDotscriptDotScriptEvent: ScriptEvent = js.native
  @JSName("com.sun.star.script.ScriptEventDescriptor")
  var comDotsunDotstarDotscriptDotScriptEventDescriptor: ScriptEventDescriptor = js.native
  @JSName("com.sun.star.script.vba.VBAScriptEvent")
  var comDotsunDotstarDotscriptDotvbaDotVBAScriptEvent: VBAScriptEvent = js.native
  @JSName("com.sun.star.sdb.DatabaseRegistrationEvent")
  var comDotsunDotstarDotsdbDotDatabaseRegistrationEvent: DatabaseRegistrationEvent = js.native
  @JSName("com.sun.star.sdb.RowChangeEvent")
  var comDotsunDotstarDotsdbDotRowChangeEvent: RowChangeEvent = js.native
  @JSName("com.sun.star.sdb.RowsChangeEvent")
  var comDotsunDotstarDotsdbDotRowsChangeEvent: RowsChangeEvent = js.native
  @JSName("com.sun.star.sdb.SQLErrorEvent")
  var comDotsunDotstarDotsdbDotSQLErrorEvent: SQLErrorEvent = js.native
  @JSName("com.sun.star.sdb.application.CopyTableRowEvent")
  var comDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent: CopyTableRowEvent = js.native
  @JSName("com.sun.star.sdb.application.NamedDatabaseObject")
  var comDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject: NamedDatabaseObject = js.native
  @JSName("com.sun.star.sdbc.ChangeEvent")
  var comDotsunDotstarDotsdbcDotChangeEvent: ChangeEvent = js.native
  @JSName("com.sun.star.sdbc.DriverPropertyInfo")
  var comDotsunDotstarDotsdbcDotDriverPropertyInfo: DriverPropertyInfo = js.native
  @JSName("com.sun.star.security.AllPermission")
  var comDotsunDotstarDotsecurityDotAllPermission: AllPermission = js.native
  @JSName("com.sun.star.security.CertAltNameEntry")
  var comDotsunDotstarDotsecurityDotCertAltNameEntry: CertAltNameEntry = js.native
  @JSName("com.sun.star.security.DocumentSignatureInformation")
  var comDotsunDotstarDotsecurityDotDocumentSignatureInformation: DocumentSignatureInformation = js.native
  @JSName("com.sun.star.security.RuntimePermission")
  var comDotsunDotstarDotsecurityDotRuntimePermission: RuntimePermission = js.native
  @JSName("com.sun.star.sheet.ActivationEvent")
  var comDotsunDotstarDotsheetDotActivationEvent: ActivationEvent = js.native
  @JSName("com.sun.star.sheet.ComplexReference")
  var comDotsunDotstarDotsheetDotComplexReference: ComplexReference = js.native
  @JSName("com.sun.star.sheet.DDEItemInfo")
  var comDotsunDotstarDotsheetDotDDEItemInfo: DDEItemInfo = js.native
  @JSName("com.sun.star.sheet.DDELinkInfo")
  var comDotsunDotstarDotsheetDotDDELinkInfo: DDELinkInfo = js.native
  @JSName("com.sun.star.sheet.DataPilotFieldAutoShowInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo: DataPilotFieldAutoShowInfo = js.native
  @JSName("com.sun.star.sheet.DataPilotFieldFilter")
  var comDotsunDotstarDotsheetDotDataPilotFieldFilter: DataPilotFieldFilter = js.native
  @JSName("com.sun.star.sheet.DataPilotFieldGroupInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldGroupInfo: DataPilotFieldGroupInfo = js.native
  @JSName("com.sun.star.sheet.DataPilotFieldLayoutInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo: DataPilotFieldLayoutInfo = js.native
  @JSName("com.sun.star.sheet.DataPilotFieldReference")
  var comDotsunDotstarDotsheetDotDataPilotFieldReference: DataPilotFieldReference = js.native
  @JSName("com.sun.star.sheet.DataPilotFieldSortInfo")
  var comDotsunDotstarDotsheetDotDataPilotFieldSortInfo: DataPilotFieldSortInfo = js.native
  @JSName("com.sun.star.sheet.DataPilotTableHeaderData")
  var comDotsunDotstarDotsheetDotDataPilotTableHeaderData: DataPilotTableHeaderData = js.native
  @JSName("com.sun.star.sheet.DataPilotTablePositionData")
  var comDotsunDotstarDotsheetDotDataPilotTablePositionData: DataPilotTablePositionData = js.native
  @JSName("com.sun.star.sheet.DataPilotTableResultData")
  var comDotsunDotstarDotsheetDotDataPilotTableResultData: DataPilotTableResultData = js.native
  @JSName("com.sun.star.sheet.DataResult")
  var comDotsunDotstarDotsheetDotDataResult: DataResult = js.native
  @JSName("com.sun.star.sheet.ExternalLinkInfo")
  var comDotsunDotstarDotsheetDotExternalLinkInfo: ExternalLinkInfo = js.native
  @JSName("com.sun.star.sheet.ExternalReference")
  var comDotsunDotstarDotsheetDotExternalReference: ExternalReference = js.native
  @JSName("com.sun.star.sheet.FilterFieldValue")
  var comDotsunDotstarDotsheetDotFilterFieldValue: FilterFieldValue = js.native
  @JSName("com.sun.star.sheet.FormulaOpCodeMapEntry")
  var comDotsunDotstarDotsheetDotFormulaOpCodeMapEntry: FormulaOpCodeMapEntry = js.native
  @JSName("com.sun.star.sheet.FormulaToken")
  var comDotsunDotstarDotsheetDotFormulaToken: FormulaToken = js.native
  @JSName("com.sun.star.sheet.FunctionArgument")
  var comDotsunDotstarDotsheetDotFunctionArgument: FunctionArgument = js.native
  @JSName("com.sun.star.sheet.GoalResult")
  var comDotsunDotstarDotsheetDotGoalResult: GoalResult = js.native
  @JSName("com.sun.star.sheet.LocalizedName")
  var comDotsunDotstarDotsheetDotLocalizedName: LocalizedName = js.native
  @JSName("com.sun.star.sheet.MemberResult")
  var comDotsunDotstarDotsheetDotMemberResult: MemberResult = js.native
  @JSName("com.sun.star.sheet.NameToken")
  var comDotsunDotstarDotsheetDotNameToken: NameToken = js.native
  @JSName("com.sun.star.sheet.RangeSelectionEvent")
  var comDotsunDotstarDotsheetDotRangeSelectionEvent: RangeSelectionEvent = js.native
  @JSName("com.sun.star.sheet.ResultEvent")
  var comDotsunDotstarDotsheetDotResultEvent: ResultEvent = js.native
  @JSName("com.sun.star.sheet.SingleReference")
  var comDotsunDotstarDotsheetDotSingleReference: SingleReference = js.native
  @JSName("com.sun.star.sheet.SolverConstraint")
  var comDotsunDotstarDotsheetDotSolverConstraint: SolverConstraint = js.native
  @JSName("com.sun.star.sheet.SubTotalColumn")
  var comDotsunDotstarDotsheetDotSubTotalColumn: SubTotalColumn = js.native
  @JSName("com.sun.star.sheet.TableFilterField")
  var comDotsunDotstarDotsheetDotTableFilterField: TableFilterField = js.native
  @JSName("com.sun.star.sheet.TableFilterField2")
  var comDotsunDotstarDotsheetDotTableFilterField2: TableFilterField2 = js.native
  @JSName("com.sun.star.sheet.TableFilterField3")
  var comDotsunDotstarDotsheetDotTableFilterField3: TableFilterField3 = js.native
  @JSName("com.sun.star.sheet.TablePageBreakData")
  var comDotsunDotstarDotsheetDotTablePageBreakData: TablePageBreakData = js.native
  @JSName("com.sun.star.sheet.opencl.OpenCLDevice")
  var comDotsunDotstarDotsheetDotopenclDotOpenCLDevice: OpenCLDevice = js.native
  @JSName("com.sun.star.sheet.opencl.OpenCLPlatform")
  var comDotsunDotstarDotsheetDotopenclDotOpenCLPlatform: OpenCLPlatform = js.native
  @JSName("com.sun.star.style.DropCapFormat")
  var comDotsunDotstarDotstyleDotDropCapFormat: DropCapFormat = js.native
  @JSName("com.sun.star.style.LineSpacing")
  var comDotsunDotstarDotstyleDotLineSpacing: LineSpacing = js.native
  @JSName("com.sun.star.style.TabStop")
  var comDotsunDotstarDotstyleDotTabStop: TabStop = js.native
  @JSName("com.sun.star.table.BorderLine")
  var comDotsunDotstarDottableDotBorderLine: BorderLine = js.native
  @JSName("com.sun.star.table.BorderLine2")
  var comDotsunDotstarDottableDotBorderLine2: BorderLine2 = js.native
  @JSName("com.sun.star.table.CellAddress")
  var comDotsunDotstarDottableDotCellAddress: CellAddress = js.native
  @JSName("com.sun.star.table.CellRangeAddress")
  var comDotsunDotstarDottableDotCellRangeAddress: CellRangeAddress = js.native
  @JSName("com.sun.star.table.ShadowFormat")
  var comDotsunDotstarDottableDotShadowFormat: ShadowFormat = js.native
  @JSName("com.sun.star.table.TableBorder")
  var comDotsunDotstarDottableDotTableBorder: TableBorder = js.native
  @JSName("com.sun.star.table.TableBorder2")
  var comDotsunDotstarDottableDotTableBorder2: TableBorder2 = js.native
  @JSName("com.sun.star.table.TableBorderDistances")
  var comDotsunDotstarDottableDotTableBorderDistances: TableBorderDistances = js.native
  @JSName("com.sun.star.table.TableSortField")
  var comDotsunDotstarDottableDotTableSortField: TableSortField = js.native
  @JSName("com.sun.star.task.UrlRecord")
  var comDotsunDotstarDottaskDotUrlRecord: UrlRecord = js.native
  @JSName("com.sun.star.task.UserRecord")
  var comDotsunDotstarDottaskDotUserRecord: UserRecord = js.native
  @JSName("com.sun.star.text.GraphicCrop")
  var comDotsunDotstarDottextDotGraphicCrop: GraphicCrop = js.native
  @JSName("com.sun.star.text.HoriOrientationFormat")
  var comDotsunDotstarDottextDotHoriOrientationFormat: HoriOrientationFormat = js.native
  @JSName("com.sun.star.text.MailMergeEvent")
  var comDotsunDotstarDottextDotMailMergeEvent: MailMergeEvent = js.native
  @JSName("com.sun.star.text.SectionFileLink")
  var comDotsunDotstarDottextDotSectionFileLink: SectionFileLink = js.native
  @JSName("com.sun.star.text.TableColumnSeparator")
  var comDotsunDotstarDottextDotTableColumnSeparator: TableColumnSeparator = js.native
  @JSName("com.sun.star.text.TextColumn")
  var comDotsunDotstarDottextDotTextColumn: TextColumn = js.native
  @JSName("com.sun.star.text.TextMarkupDescriptor")
  var comDotsunDotstarDottextDotTextMarkupDescriptor: TextMarkupDescriptor = js.native
  @JSName("com.sun.star.text.TextPosition")
  var comDotsunDotstarDottextDotTextPosition: TextPosition = js.native
  @JSName("com.sun.star.text.TextRangeSelection")
  var comDotsunDotstarDottextDotTextRangeSelection: TextRangeSelection = js.native
  @JSName("com.sun.star.text.VertOrientationFormat")
  var comDotsunDotstarDottextDotVertOrientationFormat: VertOrientationFormat = js.native
  @JSName("com.sun.star.ucb.CheckinArgument")
  var comDotsunDotstarDotucbDotCheckinArgument: CheckinArgument = js.native
  @JSName("com.sun.star.ucb.Command")
  var comDotsunDotstarDotucbDotCommand: Command = js.native
  @JSName("com.sun.star.ucb.CommandInfo")
  var comDotsunDotstarDotucbDotCommandInfo: CommandInfo = js.native
  @JSName("com.sun.star.ucb.CommandInfoChangeEvent")
  var comDotsunDotstarDotucbDotCommandInfoChangeEvent: CommandInfoChangeEvent = js.native
  @JSName("com.sun.star.ucb.ContentEvent")
  var comDotsunDotstarDotucbDotContentEvent: ContentEvent = js.native
  @JSName("com.sun.star.ucb.ContentInfo")
  var comDotsunDotstarDotucbDotContentInfo: ContentInfo = js.native
  @JSName("com.sun.star.ucb.ContentProviderInfo")
  var comDotsunDotstarDotucbDotContentProviderInfo: ContentProviderInfo = js.native
  @JSName("com.sun.star.ucb.CrossReference")
  var comDotsunDotstarDotucbDotCrossReference: CrossReference = js.native
  @JSName("com.sun.star.ucb.DocumentHeaderField")
  var comDotsunDotstarDotucbDotDocumentHeaderField: DocumentHeaderField = js.native
  @JSName("com.sun.star.ucb.ExportStreamInfo")
  var comDotsunDotstarDotucbDotExportStreamInfo: ExportStreamInfo = js.native
  @JSName("com.sun.star.ucb.FetchResult")
  var comDotsunDotstarDotucbDotFetchResult: FetchResult = js.native
  @JSName("com.sun.star.ucb.FolderList")
  var comDotsunDotstarDotucbDotFolderList: FolderList = js.native
  @JSName("com.sun.star.ucb.FolderListEntry")
  var comDotsunDotstarDotucbDotFolderListEntry: FolderListEntry = js.native
  @JSName("com.sun.star.ucb.GlobalTransferCommandArgument")
  var comDotsunDotstarDotucbDotGlobalTransferCommandArgument: GlobalTransferCommandArgument = js.native
  @JSName("com.sun.star.ucb.GlobalTransferCommandArgument2")
  var comDotsunDotstarDotucbDotGlobalTransferCommandArgument2: GlobalTransferCommandArgument2 = js.native
  @JSName("com.sun.star.ucb.InsertCommandArgument")
  var comDotsunDotstarDotucbDotInsertCommandArgument: InsertCommandArgument = js.native
  @JSName("com.sun.star.ucb.InsertCommandArgument2")
  var comDotsunDotstarDotucbDotInsertCommandArgument2: InsertCommandArgument2 = js.native
  @JSName("com.sun.star.ucb.Link")
  var comDotsunDotstarDotucbDotLink: Link = js.native
  @JSName("com.sun.star.ucb.ListAction")
  var comDotsunDotstarDotucbDotListAction: ListAction = js.native
  @JSName("com.sun.star.ucb.ListEvent")
  var comDotsunDotstarDotucbDotListEvent: ListEvent = js.native
  @JSName("com.sun.star.ucb.Lock")
  var comDotsunDotstarDotucbDotLock: Lock = js.native
  @JSName("com.sun.star.ucb.LockEntry")
  var comDotsunDotstarDotucbDotLockEntry: LockEntry = js.native
  @JSName("com.sun.star.ucb.NumberedSortingInfo")
  var comDotsunDotstarDotucbDotNumberedSortingInfo: NumberedSortingInfo = js.native
  @JSName("com.sun.star.ucb.OpenCommandArgument")
  var comDotsunDotstarDotucbDotOpenCommandArgument: OpenCommandArgument = js.native
  @JSName("com.sun.star.ucb.OpenCommandArgument2")
  var comDotsunDotstarDotucbDotOpenCommandArgument2: OpenCommandArgument2 = js.native
  @JSName("com.sun.star.ucb.OpenCommandArgument3")
  var comDotsunDotstarDotucbDotOpenCommandArgument3: OpenCommandArgument3 = js.native
  @JSName("com.sun.star.ucb.PostCommandArgument")
  var comDotsunDotstarDotucbDotPostCommandArgument: PostCommandArgument = js.native
  @JSName("com.sun.star.ucb.PostCommandArgument2")
  var comDotsunDotstarDotucbDotPostCommandArgument2: PostCommandArgument2 = js.native
  @JSName("com.sun.star.ucb.PropertyCommandArgument")
  var comDotsunDotstarDotucbDotPropertyCommandArgument: PropertyCommandArgument = js.native
  @JSName("com.sun.star.ucb.PropertyValueInfo")
  var comDotsunDotstarDotucbDotPropertyValueInfo: PropertyValueInfo = js.native
  @JSName("com.sun.star.ucb.RecipientInfo")
  var comDotsunDotstarDotucbDotRecipientInfo: RecipientInfo = js.native
  @JSName("com.sun.star.ucb.RemoteContentProviderChangeEvent")
  var comDotsunDotstarDotucbDotRemoteContentProviderChangeEvent: RemoteContentProviderChangeEvent = js.native
  @JSName("com.sun.star.ucb.Rule")
  var comDotsunDotstarDotucbDotRule: Rule = js.native
  @JSName("com.sun.star.ucb.RuleSet")
  var comDotsunDotstarDotucbDotRuleSet: RuleSet = js.native
  @JSName("com.sun.star.ucb.RuleTerm")
  var comDotsunDotstarDotucbDotRuleTerm: RuleTerm = js.native
  @JSName("com.sun.star.ucb.SearchCommandArgument")
  var comDotsunDotstarDotucbDotSearchCommandArgument: SearchCommandArgument = js.native
  @JSName("com.sun.star.ucb.SearchCriterium")
  var comDotsunDotstarDotucbDotSearchCriterium: SearchCriterium = js.native
  @JSName("com.sun.star.ucb.SearchInfo")
  var comDotsunDotstarDotucbDotSearchInfo: SearchInfo = js.native
  @JSName("com.sun.star.ucb.SendInfo")
  var comDotsunDotstarDotucbDotSendInfo: SendInfo = js.native
  @JSName("com.sun.star.ucb.SendMediaTypes")
  var comDotsunDotstarDotucbDotSendMediaTypes: SendMediaTypes = js.native
  @JSName("com.sun.star.ucb.SortingInfo")
  var comDotsunDotstarDotucbDotSortingInfo: SortingInfo = js.native
  @JSName("com.sun.star.ucb.TransferInfo")
  var comDotsunDotstarDotucbDotTransferInfo: TransferInfo = js.native
  @JSName("com.sun.star.ucb.TransferInfo2")
  var comDotsunDotstarDotucbDotTransferInfo2: TransferInfo2 = js.native
  @JSName("com.sun.star.ucb.TransferResult")
  var comDotsunDotstarDotucbDotTransferResult: TransferResult = js.native
  @JSName("com.sun.star.ucb.WelcomeDynamicResultSetStruct")
  var comDotsunDotstarDotucbDotWelcomeDynamicResultSetStruct: WelcomeDynamicResultSetStruct = js.native
  @JSName("com.sun.star.ui.ConfigurationEvent")
  var comDotsunDotstarDotuiDotConfigurationEvent: ConfigurationEvent = js.native
  @JSName("com.sun.star.ui.ContextChangeEventObject")
  var comDotsunDotstarDotuiDotContextChangeEventObject: ContextChangeEventObject = js.native
  @JSName("com.sun.star.ui.ContextMenuExecuteEvent")
  var comDotsunDotstarDotuiDotContextMenuExecuteEvent: ContextMenuExecuteEvent = js.native
  @JSName("com.sun.star.ui.LayoutSize")
  var comDotsunDotstarDotuiDotLayoutSize: LayoutSize = js.native
  @JSName("com.sun.star.ui.dialogs.DialogClosedEvent")
  var comDotsunDotstarDotuiDotdialogsDotDialogClosedEvent: DialogClosedEvent = js.native
  @JSName("com.sun.star.ui.dialogs.FilePickerEvent")
  var comDotsunDotstarDotuiDotdialogsDotFilePickerEvent: FilePickerEvent = js.native
  @JSName("com.sun.star.uno.Uik")
  var comDotsunDotstarDotunoDotUik: Uik = js.native
  @JSName("com.sun.star.util.AliasProgrammaticPair")
  var comDotsunDotstarDotutilDotAliasProgrammaticPair: AliasProgrammaticPair = js.native
  @JSName("com.sun.star.util.AtomClassRequest")
  var comDotsunDotstarDotutilDotAtomClassRequest: AtomClassRequest = js.native
  @JSName("com.sun.star.util.AtomDescription")
  var comDotsunDotstarDotutilDotAtomDescription: AtomDescription = js.native
  @JSName("com.sun.star.util.CellProtection")
  var comDotsunDotstarDotutilDotCellProtection: CellProtection = js.native
  @JSName("com.sun.star.util.ChangesEvent")
  var comDotsunDotstarDotutilDotChangesEvent: ChangesEvent = js.native
  @JSName("com.sun.star.util.DataEditorEvent")
  var comDotsunDotstarDotutilDotDataEditorEvent: DataEditorEvent = js.native
  @JSName("com.sun.star.util.Date")
  var comDotsunDotstarDotutilDotDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  @JSName("com.sun.star.util.DateTime")
  var comDotsunDotstarDotutilDotDateTime: DateTime = js.native
  @JSName("com.sun.star.util.DateTimeRange")
  var comDotsunDotstarDotutilDotDateTimeRange: DateTimeRange = js.native
  @JSName("com.sun.star.util.DateTimeWithTimezone")
  var comDotsunDotstarDotutilDotDateTimeWithTimezone: DateTimeWithTimezone = js.native
  @JSName("com.sun.star.util.DateWithTimezone")
  var comDotsunDotstarDotutilDotDateWithTimezone: DateWithTimezone = js.native
  @JSName("com.sun.star.util.Duration")
  var comDotsunDotstarDotutilDotDuration: Duration = js.native
  @JSName("com.sun.star.util.ElementChange")
  var comDotsunDotstarDotutilDotElementChange: ElementChange = js.native
  @JSName("com.sun.star.util.ModeChangeEvent")
  var comDotsunDotstarDotutilDotModeChangeEvent: ModeChangeEvent = js.native
  @JSName("com.sun.star.util.RevisionTag")
  var comDotsunDotstarDotutilDotRevisionTag: RevisionTag = js.native
  @JSName("com.sun.star.util.SearchOptions")
  var comDotsunDotstarDotutilDotSearchOptions: SearchOptions = js.native
  @JSName("com.sun.star.util.SearchOptions2")
  var comDotsunDotstarDotutilDotSearchOptions2: SearchOptions2 = js.native
  @JSName("com.sun.star.util.SearchResult")
  var comDotsunDotstarDotutilDotSearchResult: SearchResult = js.native
  @JSName("com.sun.star.util.SortField")
  var comDotsunDotstarDotutilDotSortField: SortField = js.native
  @JSName("com.sun.star.util.Time")
  var comDotsunDotstarDotutilDotTime: Time = js.native
  @JSName("com.sun.star.util.TimeWithTimezone")
  var comDotsunDotstarDotutilDotTimeWithTimezone: TimeWithTimezone = js.native
  @JSName("com.sun.star.util.URL")
  var comDotsunDotstarDotutilDotURL: URL = js.native
  @JSName("com.sun.star.view.PrintJobEvent")
  var comDotsunDotstarDotviewDotPrintJobEvent: PrintJobEvent = js.native
  @JSName("com.sun.star.view.PrintableStateEvent")
  var comDotsunDotstarDotviewDotPrintableStateEvent: PrintableStateEvent = js.native
  @JSName("com.sun.star.xml.Attribute")
  var comDotsunDotstarDotxmlDotAttribute: Attribute = js.native
  @JSName("com.sun.star.xml.AttributeData")
  var comDotsunDotstarDotxmlDotAttributeData: AttributeData = js.native
  @JSName("com.sun.star.xml.FastAttribute")
  var comDotsunDotstarDotxmlDotFastAttribute: FastAttribute = js.native
  @JSName("com.sun.star.xml.crypto.sax.ElementStackItem")
  var comDotsunDotstarDotxmlDotcryptoDotsaxDotElementStackItem: ElementStackItem = js.native
  @JSName("com.sun.star.xml.csax.XMLAttribute")
  var comDotsunDotstarDotxmlDotcsaxDotXMLAttribute: XMLAttribute = js.native
  @JSName("com.sun.star.xml.sax.InputSource")
  var comDotsunDotstarDotxmlDotsaxDotInputSource: InputSource = js.native
  @JSName("com.sun.star.xml.xpath.Libxml2ExtensionHandle")
  var comDotsunDotstarDotxmlDotxpathDotLibxml2ExtensionHandle: Libxml2ExtensionHandle = js.native
}

object StructNameMap {
  @scala.inline
  def apply(
    comDotsunDotstarDotaccessibilityDotAccessibleEventObject: AccessibleEventObject,
    comDotsunDotstarDotaccessibilityDotAccessibleRelation: AccessibleRelation,
    comDotsunDotstarDotaccessibilityDotAccessibleTableModelChange: AccessibleTableModelChange,
    comDotsunDotstarDotaccessibilityDotTextSegment: TextSegment,
    comDotsunDotstarDotanimationsDotEvent: Event,
    comDotsunDotstarDotanimationsDotTargetProperties: TargetProperties,
    comDotsunDotstarDotanimationsDotTimeFilterPair: TimeFilterPair,
    comDotsunDotstarDotanimationsDotValuePair: ValuePair,
    comDotsunDotstarDotawtDotActionEvent: ActionEvent,
    comDotsunDotstarDotawtDotAdjustmentEvent: AdjustmentEvent,
    comDotsunDotstarDotawtDotDeviceInfo: DeviceInfo,
    comDotsunDotstarDotawtDotDockingData: DockingData,
    comDotsunDotstarDotawtDotDockingEvent: DockingEvent,
    comDotsunDotstarDotawtDotEndDockingEvent: EndDockingEvent,
    comDotsunDotstarDotawtDotEndPopupModeEvent: EndPopupModeEvent,
    comDotsunDotstarDotawtDotEnhancedMouseEvent: EnhancedMouseEvent,
    comDotsunDotstarDotawtDotFocusEvent: FocusEvent,
    comDotsunDotstarDotawtDotFontDescriptor: FontDescriptor,
    comDotsunDotstarDotawtDotGradient: Gradient,
    comDotsunDotstarDotawtDotInputEvent: InputEvent,
    comDotsunDotstarDotawtDotItemEvent: ItemEvent,
    comDotsunDotstarDotawtDotItemListEvent: ItemListEvent,
    comDotsunDotstarDotawtDotKeyEvent: KeyEvent,
    comDotsunDotstarDotawtDotKeyStroke: KeyStroke,
    comDotsunDotstarDotawtDotMenuEvent: MenuEvent,
    comDotsunDotstarDotawtDotMouseEvent: MouseEvent,
    comDotsunDotstarDotawtDotPaintEvent: PaintEvent,
    comDotsunDotstarDotawtDotPoint: Point,
    comDotsunDotstarDotawtDotRectangle: Rectangle,
    comDotsunDotstarDotawtDotSelection: Selection,
    comDotsunDotstarDotawtDotSimpleFontMetric: SimpleFontMetric,
    comDotsunDotstarDotawtDotSize: Size,
    comDotsunDotstarDotawtDotSpinEvent: SpinEvent,
    comDotsunDotstarDotawtDotSystemDependentXWindow: SystemDependentXWindow,
    comDotsunDotstarDotawtDotTextEvent: TextEvent,
    comDotsunDotstarDotawtDotVclContainerEvent: VclContainerEvent,
    comDotsunDotstarDotawtDotWindowDescriptor: WindowDescriptor,
    comDotsunDotstarDotawtDotWindowEvent: WindowEvent,
    comDotsunDotstarDotawtDotgridDotGridColumnEvent: GridColumnEvent,
    comDotsunDotstarDotawtDotgridDotGridDataEvent: GridDataEvent,
    comDotsunDotstarDotawtDotgridDotGridSelectionEvent: GridSelectionEvent,
    comDotsunDotstarDotawtDottabDotTabPageActivatedEvent: TabPageActivatedEvent,
    comDotsunDotstarDotawtDottreeDotTreeDataModelEvent: TreeDataModelEvent,
    comDotsunDotstarDotawtDottreeDotTreeExpansionEvent: TreeExpansionEvent,
    comDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult: GetDirectPropertyTolerantResult,
    comDotsunDotstarDotbeansDotGetPropertyTolerantResult: GetPropertyTolerantResult,
    comDotsunDotstarDotbeansDotNamedValue: NamedValue,
    comDotsunDotstarDotbeansDotProperty: Property,
    comDotsunDotstarDotbeansDotPropertyChangeEvent: PropertyChangeEvent,
    comDotsunDotstarDotbeansDotPropertySetInfoChangeEvent: PropertySetInfoChangeEvent,
    comDotsunDotstarDotbeansDotPropertyStateChangeEvent: PropertyStateChangeEvent,
    comDotsunDotstarDotbeansDotPropertyValue: PropertyValue,
    comDotsunDotstarDotbeansDotSetPropertyTolerantFailed: SetPropertyTolerantFailed,
    comDotsunDotstarDotbeansDotStringPair: StringPair,
    comDotsunDotstarDotbridgeDotProtocolProperty: ProtocolProperty,
    comDotsunDotstarDotbridgeDotoleautomationDotCurrency: Currency,
    comDotsunDotstarDotbridgeDotoleautomationDotDate: Date,
    comDotsunDotstarDotbridgeDotoleautomationDotDecimal: Decimal,
    comDotsunDotstarDotbridgeDotoleautomationDotNamedArgument: NamedArgument,
    comDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument: PropertyPutArgument,
    comDotsunDotstarDotbridgeDotoleautomationDotSCode: SCode,
    comDotsunDotstarDotchart2DotDataPointLabel: DataPointLabel,
    comDotsunDotstarDotchart2DotFillBitmap: FillBitmap,
    comDotsunDotstarDotchart2DotIncrementData: IncrementData,
    comDotsunDotstarDotchart2DotInterpretedData: InterpretedData,
    comDotsunDotstarDotchart2DotLightSource: LightSource,
    comDotsunDotstarDotchart2DotRelativePosition: RelativePosition,
    comDotsunDotstarDotchart2DotRelativeSize: RelativeSize,
    comDotsunDotstarDotchart2DotScaleData: ScaleData,
    comDotsunDotstarDotchart2DotSubIncrement: SubIncrement,
    comDotsunDotstarDotchart2DotSymbol: Symbol,
    comDotsunDotstarDotchart2DotdataDotHighlightedRange: HighlightedRange,
    comDotsunDotstarDotchartDotChartDataChangeEvent: ChartDataChangeEvent,
    comDotsunDotstarDotchartDotChartDataRow: ChartDataRow,
    comDotsunDotstarDotchartDotChartDataValue: ChartDataValue,
    comDotsunDotstarDotchartDotChartSeriesAddress: ChartSeriesAddress,
    comDotsunDotstarDotchartDotTimeIncrement: TimeIncrement,
    comDotsunDotstarDotchartDotTimeInterval: TimeInterval,
    comDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent: ComponentChangeEvent,
    comDotsunDotstarDotconfigurationDotbackendDotPropertyInfo: PropertyInfo,
    comDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier: TemplateIdentifier,
    comDotsunDotstarDotconnectionDotSocketPermission: SocketPermission,
    comDotsunDotstarDotcontainerDotContainerEvent: ContainerEvent,
    comDotsunDotstarDotdatatransferDotDataFlavor: DataFlavor,
    comDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent: ClipboardEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragGestureEvent: DragGestureEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent: DragSourceDragEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent: DragSourceDropEvent,
    comDotsunDotstarDotdatatransferDotdndDotDragSourceEvent: DragSourceEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent: DropTargetDragEnterEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent: DropTargetDragEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent: DropTargetDropEvent,
    comDotsunDotstarDotdatatransferDotdndDotDropTargetEvent: DropTargetEvent,
    comDotsunDotstarDotdeploymentDotUpdateInformationEntry: UpdateInformationEntry,
    comDotsunDotstarDotdocumentDotCmisProperty: CmisProperty,
    comDotsunDotstarDotdocumentDotCmisVersion: CmisVersion,
    comDotsunDotstarDotdocumentDotDocumentEvent: DocumentEvent,
    comDotsunDotstarDotdocumentDotEventObject: EventObject,
    comDotsunDotstarDotdocumentDotUndoManagerEvent: UndoManagerEvent,
    comDotsunDotstarDotdrawingDotBezierPoint: BezierPoint,
    comDotsunDotstarDotdrawingDotBoundVolume: BoundVolume,
    comDotsunDotstarDotdrawingDotCameraGeometry: CameraGeometry,
    comDotsunDotstarDotdrawingDotDirection3D: Direction3D,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue: EnhancedCustomShapeAdjustmentValue,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter: EnhancedCustomShapeParameter,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair: EnhancedCustomShapeParameterPair,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment: EnhancedCustomShapeSegment,
    comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame: EnhancedCustomShapeTextFrame,
    comDotsunDotstarDotdrawingDotGluePoint: GluePoint,
    comDotsunDotstarDotdrawingDotGluePoint2: GluePoint2,
    comDotsunDotstarDotdrawingDotHatch: Hatch,
    comDotsunDotstarDotdrawingDotHomogenMatrix: HomogenMatrix,
    comDotsunDotstarDotdrawingDotHomogenMatrix3: HomogenMatrix3,
    comDotsunDotstarDotdrawingDotHomogenMatrix4: HomogenMatrix4,
    comDotsunDotstarDotdrawingDotHomogenMatrixLine: HomogenMatrixLine,
    comDotsunDotstarDotdrawingDotHomogenMatrixLine3: HomogenMatrixLine3,
    comDotsunDotstarDotdrawingDotHomogenMatrixLine4: HomogenMatrixLine4,
    comDotsunDotstarDotdrawingDotLineDash: LineDash,
    comDotsunDotstarDotdrawingDotPolyPolygonBezierCoords: PolyPolygonBezierCoords,
    comDotsunDotstarDotdrawingDotPolyPolygonShape3D: PolyPolygonShape3D,
    comDotsunDotstarDotdrawingDotPosition3D: Position3D,
    comDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent: ConfigurationChangeEvent,
    comDotsunDotstarDotdrawingDotframeworkDotTabBarButton: TabBarButton,
    comDotsunDotstarDotembedDotInsertedObjectInfo: InsertedObjectInfo,
    comDotsunDotstarDotembedDotVerbDescriptor: VerbDescriptor,
    comDotsunDotstarDotembedDotVisualRepresentation: VisualRepresentation,
    comDotsunDotstarDotformDotDatabaseDeleteEvent: DatabaseDeleteEvent,
    comDotsunDotstarDotformDotDatabaseParameterEvent: DatabaseParameterEvent,
    comDotsunDotstarDotformDotErrorEvent: ErrorEvent,
    comDotsunDotstarDotformDotbindingDotListEntryEvent: ListEntryEvent,
    comDotsunDotstarDotformDotruntimeDotFeatureState: FeatureState,
    comDotsunDotstarDotformDotruntimeDotFilterEvent: FilterEvent,
    comDotsunDotstarDotformulaDotSymbolDescriptor: SymbolDescriptor,
    comDotsunDotstarDotframeDotBorderWidths: BorderWidths,
    comDotsunDotstarDotframeDotControlCommand: ControlCommand,
    comDotsunDotstarDotframeDotControlEvent: ControlEvent,
    comDotsunDotstarDotframeDotDispatchDescriptor: DispatchDescriptor,
    comDotsunDotstarDotframeDotDispatchInformation: DispatchInformation,
    comDotsunDotstarDotframeDotDispatchResultEvent: DispatchResultEvent,
    comDotsunDotstarDotframeDotDispatchStatement: DispatchStatement,
    comDotsunDotstarDotframeDotFeatureStateEvent: FeatureStateEvent,
    comDotsunDotstarDotframeDotFrameActionEvent: FrameActionEvent,
    comDotsunDotstarDotframeDotTitleChangedEvent: TitleChangedEvent,
    comDotsunDotstarDotframeDotstatusDotClipboardFormats: ClipboardFormats,
    comDotsunDotstarDotframeDotstatusDotFontHeight: FontHeight,
    comDotsunDotstarDotframeDotstatusDotItemStatus: ItemStatus,
    comDotsunDotstarDotframeDotstatusDotLeftRightMargin: LeftRightMargin,
    comDotsunDotstarDotframeDotstatusDotLeftRightMarginScale: LeftRightMarginScale,
    comDotsunDotstarDotframeDotstatusDotTemplate: Template,
    comDotsunDotstarDotframeDotstatusDotUpperLowerMargin: UpperLowerMargin,
    comDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale: UpperLowerMarginScale,
    comDotsunDotstarDotframeDotstatusDotVerb: Verb,
    comDotsunDotstarDotframeDotstatusDotVisibility: Visibility,
    comDotsunDotstarDotgeometryDotAffineMatrix2D: AffineMatrix2D,
    comDotsunDotstarDotgeometryDotAffineMatrix3D: AffineMatrix3D,
    comDotsunDotstarDotgeometryDotEllipticalArc: EllipticalArc,
    comDotsunDotstarDotgeometryDotIntegerBezierSegment2D: IntegerBezierSegment2D,
    comDotsunDotstarDotgeometryDotIntegerPoint2D: IntegerPoint2D,
    comDotsunDotstarDotgeometryDotIntegerRectangle2D: IntegerRectangle2D,
    comDotsunDotstarDotgeometryDotIntegerSize2D: IntegerSize2D,
    comDotsunDotstarDotgeometryDotMatrix2D: Matrix2D,
    comDotsunDotstarDotgeometryDotRealBezierSegment2D: RealBezierSegment2D,
    comDotsunDotstarDotgeometryDotRealPoint2D: RealPoint2D,
    comDotsunDotstarDotgeometryDotRealRectangle2D: RealRectangle2D,
    comDotsunDotstarDotgeometryDotRealRectangle3D: RealRectangle3D,
    comDotsunDotstarDotgeometryDotRealSize2D: RealSize2D,
    comDotsunDotstarDoti18nDotBoundary: Boundary,
    comDotsunDotstarDoti18nDotCalendar: Calendar,
    comDotsunDotstarDoti18nDotCalendar2: Calendar2,
    comDotsunDotstarDoti18nDotCalendarItem: CalendarItem,
    comDotsunDotstarDoti18nDotCalendarItem2: CalendarItem2,
    comDotsunDotstarDoti18nDotCurrency: typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Currency,
    comDotsunDotstarDoti18nDotCurrency2: Currency2,
    comDotsunDotstarDoti18nDotForbiddenCharacters: ForbiddenCharacters,
    comDotsunDotstarDoti18nDotFormatElement: FormatElement,
    comDotsunDotstarDoti18nDotImplementation: Implementation,
    comDotsunDotstarDoti18nDotLanguageCountryInfo: LanguageCountryInfo,
    comDotsunDotstarDoti18nDotLineBreakHyphenationOptions: LineBreakHyphenationOptions,
    comDotsunDotstarDoti18nDotLineBreakResults: LineBreakResults,
    comDotsunDotstarDoti18nDotLineBreakUserOptions: LineBreakUserOptions,
    comDotsunDotstarDoti18nDotLocaleDataItem: LocaleDataItem,
    comDotsunDotstarDoti18nDotNativeNumberXmlAttributes: NativeNumberXmlAttributes,
    comDotsunDotstarDoti18nDotNumberFormatCode: NumberFormatCode,
    comDotsunDotstarDoti18nDotParseResult: ParseResult,
    comDotsunDotstarDoti18nDotTextConversionResult: TextConversionResult,
    comDotsunDotstarDotinspectionDotLineDescriptor: LineDescriptor,
    comDotsunDotstarDotinspectionDotPropertyCategoryDescriptor: PropertyCategoryDescriptor,
    comDotsunDotstarDotioDotDataTransferEvent: DataTransferEvent,
    comDotsunDotstarDotioDotFilePermission: FilePermission,
    comDotsunDotstarDotlangDotEventObject: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject,
    comDotsunDotstarDotlangDotLocale: Locale,
    comDotsunDotstarDotlinguistic2DotDictionaryEvent: DictionaryEvent,
    comDotsunDotstarDotlinguistic2DotDictionaryListEvent: DictionaryListEvent,
    comDotsunDotstarDotlinguistic2DotLinguServiceEvent: LinguServiceEvent,
    comDotsunDotstarDotlinguistic2DotProofreadingResult: ProofreadingResult,
    comDotsunDotstarDotlinguistic2DotSingleProofreadingError: SingleProofreadingError,
    comDotsunDotstarDotloggingDotLogRecord: LogRecord,
    comDotsunDotstarDotmailDotMailAttachment: MailAttachment,
    comDotsunDotstarDotmozillaDotMenuMultipleChange: MenuMultipleChange,
    comDotsunDotstarDotmozillaDotMenuSingleChange: MenuSingleChange,
    comDotsunDotstarDotpackagesDotzipDotZipEntry: ZipEntry,
    comDotsunDotstarDotpresentationDotParagraphTarget: ParagraphTarget,
    comDotsunDotstarDotrdfDotStatement: Statement,
    comDotsunDotstarDotreflectionDotParamInfo: ParamInfo,
    comDotsunDotstarDotrenderingDotARGBColor: ARGBColor,
    comDotsunDotstarDotrenderingDotAnimationAttributes: AnimationAttributes,
    comDotsunDotstarDotrenderingDotCaret: Caret,
    comDotsunDotstarDotrenderingDotColorProfile: ColorProfile,
    comDotsunDotstarDotrenderingDotFloatingPointBitmapLayout: FloatingPointBitmapLayout,
    comDotsunDotstarDotrenderingDotFontInfo: FontInfo,
    comDotsunDotstarDotrenderingDotFontMetrics: FontMetrics,
    comDotsunDotstarDotrenderingDotFontRequest: FontRequest,
    comDotsunDotstarDotrenderingDotIntegerBitmapLayout: IntegerBitmapLayout,
    comDotsunDotstarDotrenderingDotPanose: Panose,
    comDotsunDotstarDotrenderingDotRGBColor: RGBColor,
    comDotsunDotstarDotrenderingDotRenderState: RenderState,
    comDotsunDotstarDotrenderingDotStringContext: StringContext,
    comDotsunDotstarDotrenderingDotStrokeAttributes: StrokeAttributes,
    comDotsunDotstarDotrenderingDotTextHit: TextHit,
    comDotsunDotstarDotrenderingDotTexture: Texture,
    comDotsunDotstarDotrenderingDotViewState: ViewState,
    comDotsunDotstarDotscannerDotScannerContext: ScannerContext,
    comDotsunDotstarDotscriptDotAllEventObject: AllEventObject,
    comDotsunDotstarDotscriptDotArrayWrapper: ArrayWrapper,
    comDotsunDotstarDotscriptDotContextInformation: ContextInformation,
    comDotsunDotstarDotscriptDotEventListener: EventListener,
    comDotsunDotstarDotscriptDotFinishEngineEvent: FinishEngineEvent,
    comDotsunDotstarDotscriptDotInterruptEngineEvent: InterruptEngineEvent,
    comDotsunDotstarDotscriptDotInvocationInfo: InvocationInfo,
    comDotsunDotstarDotscriptDotModuleInfo: ModuleInfo,
    comDotsunDotstarDotscriptDotNativeObjectWrapper: NativeObjectWrapper,
    comDotsunDotstarDotscriptDotScriptEvent: ScriptEvent,
    comDotsunDotstarDotscriptDotScriptEventDescriptor: ScriptEventDescriptor,
    comDotsunDotstarDotscriptDotvbaDotVBAScriptEvent: VBAScriptEvent,
    comDotsunDotstarDotsdbDotDatabaseRegistrationEvent: DatabaseRegistrationEvent,
    comDotsunDotstarDotsdbDotRowChangeEvent: RowChangeEvent,
    comDotsunDotstarDotsdbDotRowsChangeEvent: RowsChangeEvent,
    comDotsunDotstarDotsdbDotSQLErrorEvent: SQLErrorEvent,
    comDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent: CopyTableRowEvent,
    comDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject: NamedDatabaseObject,
    comDotsunDotstarDotsdbcDotChangeEvent: ChangeEvent,
    comDotsunDotstarDotsdbcDotDriverPropertyInfo: DriverPropertyInfo,
    comDotsunDotstarDotsecurityDotAllPermission: AllPermission,
    comDotsunDotstarDotsecurityDotCertAltNameEntry: CertAltNameEntry,
    comDotsunDotstarDotsecurityDotDocumentSignatureInformation: DocumentSignatureInformation,
    comDotsunDotstarDotsecurityDotRuntimePermission: RuntimePermission,
    comDotsunDotstarDotsheetDotActivationEvent: ActivationEvent,
    comDotsunDotstarDotsheetDotComplexReference: ComplexReference,
    comDotsunDotstarDotsheetDotDDEItemInfo: DDEItemInfo,
    comDotsunDotstarDotsheetDotDDELinkInfo: DDELinkInfo,
    comDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo: DataPilotFieldAutoShowInfo,
    comDotsunDotstarDotsheetDotDataPilotFieldFilter: DataPilotFieldFilter,
    comDotsunDotstarDotsheetDotDataPilotFieldGroupInfo: DataPilotFieldGroupInfo,
    comDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo: DataPilotFieldLayoutInfo
  ): StructNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleEventObject")(comDotsunDotstarDotaccessibilityDotAccessibleEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleRelation")(comDotsunDotstarDotaccessibilityDotAccessibleRelation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.AccessibleTableModelChange")(comDotsunDotstarDotaccessibilityDotAccessibleTableModelChange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.accessibility.TextSegment")(comDotsunDotstarDotaccessibilityDotTextSegment.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.Event")(comDotsunDotstarDotanimationsDotEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.TargetProperties")(comDotsunDotstarDotanimationsDotTargetProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.TimeFilterPair")(comDotsunDotstarDotanimationsDotTimeFilterPair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.animations.ValuePair")(comDotsunDotstarDotanimationsDotValuePair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ActionEvent")(comDotsunDotstarDotawtDotActionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.AdjustmentEvent")(comDotsunDotstarDotawtDotAdjustmentEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DeviceInfo")(comDotsunDotstarDotawtDotDeviceInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DockingData")(comDotsunDotstarDotawtDotDockingData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.DockingEvent")(comDotsunDotstarDotawtDotDockingEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.EndDockingEvent")(comDotsunDotstarDotawtDotEndDockingEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.EndPopupModeEvent")(comDotsunDotstarDotawtDotEndPopupModeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.EnhancedMouseEvent")(comDotsunDotstarDotawtDotEnhancedMouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.FocusEvent")(comDotsunDotstarDotawtDotFocusEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.FontDescriptor")(comDotsunDotstarDotawtDotFontDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Gradient")(comDotsunDotstarDotawtDotGradient.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.InputEvent")(comDotsunDotstarDotawtDotInputEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ItemEvent")(comDotsunDotstarDotawtDotItemEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.ItemListEvent")(comDotsunDotstarDotawtDotItemListEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.KeyEvent")(comDotsunDotstarDotawtDotKeyEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.KeyStroke")(comDotsunDotstarDotawtDotKeyStroke.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.MenuEvent")(comDotsunDotstarDotawtDotMenuEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.MouseEvent")(comDotsunDotstarDotawtDotMouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.PaintEvent")(comDotsunDotstarDotawtDotPaintEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Point")(comDotsunDotstarDotawtDotPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Rectangle")(comDotsunDotstarDotawtDotRectangle.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Selection")(comDotsunDotstarDotawtDotSelection.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SimpleFontMetric")(comDotsunDotstarDotawtDotSimpleFontMetric.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.Size")(comDotsunDotstarDotawtDotSize.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SpinEvent")(comDotsunDotstarDotawtDotSpinEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.SystemDependentXWindow")(comDotsunDotstarDotawtDotSystemDependentXWindow.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.TextEvent")(comDotsunDotstarDotawtDotTextEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.VclContainerEvent")(comDotsunDotstarDotawtDotVclContainerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.WindowDescriptor")(comDotsunDotstarDotawtDotWindowDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.WindowEvent")(comDotsunDotstarDotawtDotWindowEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridColumnEvent")(comDotsunDotstarDotawtDotgridDotGridColumnEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridDataEvent")(comDotsunDotstarDotawtDotgridDotGridDataEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.grid.GridSelectionEvent")(comDotsunDotstarDotawtDotgridDotGridSelectionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tab.TabPageActivatedEvent")(comDotsunDotstarDotawtDottabDotTabPageActivatedEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.TreeDataModelEvent")(comDotsunDotstarDotawtDottreeDotTreeDataModelEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.awt.tree.TreeExpansionEvent")(comDotsunDotstarDotawtDottreeDotTreeExpansionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.GetDirectPropertyTolerantResult")(comDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.GetPropertyTolerantResult")(comDotsunDotstarDotbeansDotGetPropertyTolerantResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.NamedValue")(comDotsunDotstarDotbeansDotNamedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.Property")(comDotsunDotstarDotbeansDotProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyChangeEvent")(comDotsunDotstarDotbeansDotPropertyChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertySetInfoChangeEvent")(comDotsunDotstarDotbeansDotPropertySetInfoChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyStateChangeEvent")(comDotsunDotstarDotbeansDotPropertyStateChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.PropertyValue")(comDotsunDotstarDotbeansDotPropertyValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.SetPropertyTolerantFailed")(comDotsunDotstarDotbeansDotSetPropertyTolerantFailed.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.beans.StringPair")(comDotsunDotstarDotbeansDotStringPair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.ProtocolProperty")(comDotsunDotstarDotbridgeDotProtocolProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Currency")(comDotsunDotstarDotbridgeDotoleautomationDotCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Date")(comDotsunDotstarDotbridgeDotoleautomationDotDate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.Decimal")(comDotsunDotstarDotbridgeDotoleautomationDotDecimal.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.NamedArgument")(comDotsunDotstarDotbridgeDotoleautomationDotNamedArgument.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.PropertyPutArgument")(comDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.bridge.oleautomation.SCode")(comDotsunDotstarDotbridgeDotoleautomationDotSCode.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.DataPointLabel")(comDotsunDotstarDotchart2DotDataPointLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.FillBitmap")(comDotsunDotstarDotchart2DotFillBitmap.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.IncrementData")(comDotsunDotstarDotchart2DotIncrementData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.InterpretedData")(comDotsunDotstarDotchart2DotInterpretedData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.LightSource")(comDotsunDotstarDotchart2DotLightSource.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RelativePosition")(comDotsunDotstarDotchart2DotRelativePosition.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.RelativeSize")(comDotsunDotstarDotchart2DotRelativeSize.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.ScaleData")(comDotsunDotstarDotchart2DotScaleData.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.SubIncrement")(comDotsunDotstarDotchart2DotSubIncrement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.Symbol")(comDotsunDotstarDotchart2DotSymbol.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart2.data.HighlightedRange")(comDotsunDotstarDotchart2DotdataDotHighlightedRange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataChangeEvent")(comDotsunDotstarDotchartDotChartDataChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataRow")(comDotsunDotstarDotchartDotChartDataRow.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartDataValue")(comDotsunDotstarDotchartDotChartDataValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.ChartSeriesAddress")(comDotsunDotstarDotchartDotChartSeriesAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.TimeIncrement")(comDotsunDotstarDotchartDotTimeIncrement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.chart.TimeInterval")(comDotsunDotstarDotchartDotTimeInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.ComponentChangeEvent")(comDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.PropertyInfo")(comDotsunDotstarDotconfigurationDotbackendDotPropertyInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.configuration.backend.TemplateIdentifier")(comDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.connection.SocketPermission")(comDotsunDotstarDotconnectionDotSocketPermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.container.ContainerEvent")(comDotsunDotstarDotcontainerDotContainerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.DataFlavor")(comDotsunDotstarDotdatatransferDotDataFlavor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.clipboard.ClipboardEvent")(comDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragGestureEvent")(comDotsunDotstarDotdatatransferDotdndDotDragGestureEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragSourceDragEvent")(comDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragSourceDropEvent")(comDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DragSourceEvent")(comDotsunDotstarDotdatatransferDotdndDotDragSourceEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDragEnterEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDragEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDropEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.datatransfer.dnd.DropTargetEvent")(comDotsunDotstarDotdatatransferDotdndDotDropTargetEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.deployment.UpdateInformationEntry")(comDotsunDotstarDotdeploymentDotUpdateInformationEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.CmisProperty")(comDotsunDotstarDotdocumentDotCmisProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.CmisVersion")(comDotsunDotstarDotdocumentDotCmisVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.DocumentEvent")(comDotsunDotstarDotdocumentDotDocumentEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.EventObject")(comDotsunDotstarDotdocumentDotEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.document.UndoManagerEvent")(comDotsunDotstarDotdocumentDotUndoManagerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.BezierPoint")(comDotsunDotstarDotdrawingDotBezierPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.BoundVolume")(comDotsunDotstarDotdrawingDotBoundVolume.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.CameraGeometry")(comDotsunDotstarDotdrawingDotCameraGeometry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.Direction3D")(comDotsunDotstarDotdrawingDotDirection3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeAdjustmentValue")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeParameter")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeParameterPair")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeSegment")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.EnhancedCustomShapeTextFrame")(comDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.GluePoint")(comDotsunDotstarDotdrawingDotGluePoint.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.GluePoint2")(comDotsunDotstarDotdrawingDotGluePoint2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.Hatch")(comDotsunDotstarDotdrawingDotHatch.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrix")(comDotsunDotstarDotdrawingDotHomogenMatrix.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrix3")(comDotsunDotstarDotdrawingDotHomogenMatrix3.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrix4")(comDotsunDotstarDotdrawingDotHomogenMatrix4.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrixLine")(comDotsunDotstarDotdrawingDotHomogenMatrixLine.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrixLine3")(comDotsunDotstarDotdrawingDotHomogenMatrixLine3.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.HomogenMatrixLine4")(comDotsunDotstarDotdrawingDotHomogenMatrixLine4.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.LineDash")(comDotsunDotstarDotdrawingDotLineDash.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.PolyPolygonBezierCoords")(comDotsunDotstarDotdrawingDotPolyPolygonBezierCoords.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.PolyPolygonShape3D")(comDotsunDotstarDotdrawingDotPolyPolygonShape3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.Position3D")(comDotsunDotstarDotdrawingDotPosition3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.framework.ConfigurationChangeEvent")(comDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.drawing.framework.TabBarButton")(comDotsunDotstarDotdrawingDotframeworkDotTabBarButton.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.embed.InsertedObjectInfo")(comDotsunDotstarDotembedDotInsertedObjectInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.embed.VerbDescriptor")(comDotsunDotstarDotembedDotVerbDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.embed.VisualRepresentation")(comDotsunDotstarDotembedDotVisualRepresentation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.DatabaseDeleteEvent")(comDotsunDotstarDotformDotDatabaseDeleteEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.DatabaseParameterEvent")(comDotsunDotstarDotformDotDatabaseParameterEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.ErrorEvent")(comDotsunDotstarDotformDotErrorEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.binding.ListEntryEvent")(comDotsunDotstarDotformDotbindingDotListEntryEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.runtime.FeatureState")(comDotsunDotstarDotformDotruntimeDotFeatureState.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.form.runtime.FilterEvent")(comDotsunDotstarDotformDotruntimeDotFilterEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.formula.SymbolDescriptor")(comDotsunDotstarDotformulaDotSymbolDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.BorderWidths")(comDotsunDotstarDotframeDotBorderWidths.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.ControlCommand")(comDotsunDotstarDotframeDotControlCommand.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.ControlEvent")(comDotsunDotstarDotframeDotControlEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchDescriptor")(comDotsunDotstarDotframeDotDispatchDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchInformation")(comDotsunDotstarDotframeDotDispatchInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchResultEvent")(comDotsunDotstarDotframeDotDispatchResultEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.DispatchStatement")(comDotsunDotstarDotframeDotDispatchStatement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.FeatureStateEvent")(comDotsunDotstarDotframeDotFeatureStateEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.FrameActionEvent")(comDotsunDotstarDotframeDotFrameActionEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.TitleChangedEvent")(comDotsunDotstarDotframeDotTitleChangedEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.ClipboardFormats")(comDotsunDotstarDotframeDotstatusDotClipboardFormats.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.FontHeight")(comDotsunDotstarDotframeDotstatusDotFontHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.ItemStatus")(comDotsunDotstarDotframeDotstatusDotItemStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.LeftRightMargin")(comDotsunDotstarDotframeDotstatusDotLeftRightMargin.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.LeftRightMarginScale")(comDotsunDotstarDotframeDotstatusDotLeftRightMarginScale.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.Template")(comDotsunDotstarDotframeDotstatusDotTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.UpperLowerMargin")(comDotsunDotstarDotframeDotstatusDotUpperLowerMargin.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.UpperLowerMarginScale")(comDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.Verb")(comDotsunDotstarDotframeDotstatusDotVerb.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.frame.status.Visibility")(comDotsunDotstarDotframeDotstatusDotVisibility.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.AffineMatrix2D")(comDotsunDotstarDotgeometryDotAffineMatrix2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.AffineMatrix3D")(comDotsunDotstarDotgeometryDotAffineMatrix3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.EllipticalArc")(comDotsunDotstarDotgeometryDotEllipticalArc.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerBezierSegment2D")(comDotsunDotstarDotgeometryDotIntegerBezierSegment2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerPoint2D")(comDotsunDotstarDotgeometryDotIntegerPoint2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerRectangle2D")(comDotsunDotstarDotgeometryDotIntegerRectangle2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.IntegerSize2D")(comDotsunDotstarDotgeometryDotIntegerSize2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.Matrix2D")(comDotsunDotstarDotgeometryDotMatrix2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealBezierSegment2D")(comDotsunDotstarDotgeometryDotRealBezierSegment2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealPoint2D")(comDotsunDotstarDotgeometryDotRealPoint2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealRectangle2D")(comDotsunDotstarDotgeometryDotRealRectangle2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealRectangle3D")(comDotsunDotstarDotgeometryDotRealRectangle3D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.geometry.RealSize2D")(comDotsunDotstarDotgeometryDotRealSize2D.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Boundary")(comDotsunDotstarDoti18nDotBoundary.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Calendar")(comDotsunDotstarDoti18nDotCalendar.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Calendar2")(comDotsunDotstarDoti18nDotCalendar2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.CalendarItem")(comDotsunDotstarDoti18nDotCalendarItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.CalendarItem2")(comDotsunDotstarDoti18nDotCalendarItem2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Currency")(comDotsunDotstarDoti18nDotCurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Currency2")(comDotsunDotstarDoti18nDotCurrency2.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.ForbiddenCharacters")(comDotsunDotstarDoti18nDotForbiddenCharacters.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.FormatElement")(comDotsunDotstarDoti18nDotFormatElement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.Implementation")(comDotsunDotstarDoti18nDotImplementation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LanguageCountryInfo")(comDotsunDotstarDoti18nDotLanguageCountryInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LineBreakHyphenationOptions")(comDotsunDotstarDoti18nDotLineBreakHyphenationOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LineBreakResults")(comDotsunDotstarDoti18nDotLineBreakResults.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LineBreakUserOptions")(comDotsunDotstarDoti18nDotLineBreakUserOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.LocaleDataItem")(comDotsunDotstarDoti18nDotLocaleDataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.NativeNumberXmlAttributes")(comDotsunDotstarDoti18nDotNativeNumberXmlAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.NumberFormatCode")(comDotsunDotstarDoti18nDotNumberFormatCode.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.ParseResult")(comDotsunDotstarDoti18nDotParseResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.i18n.TextConversionResult")(comDotsunDotstarDoti18nDotTextConversionResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.inspection.LineDescriptor")(comDotsunDotstarDotinspectionDotLineDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.inspection.PropertyCategoryDescriptor")(comDotsunDotstarDotinspectionDotPropertyCategoryDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.io.DataTransferEvent")(comDotsunDotstarDotioDotDataTransferEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.io.FilePermission")(comDotsunDotstarDotioDotFilePermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.lang.EventObject")(comDotsunDotstarDotlangDotEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.lang.Locale")(comDotsunDotstarDotlangDotLocale.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.DictionaryEvent")(comDotsunDotstarDotlinguistic2DotDictionaryEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.DictionaryListEvent")(comDotsunDotstarDotlinguistic2DotDictionaryListEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.LinguServiceEvent")(comDotsunDotstarDotlinguistic2DotLinguServiceEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.ProofreadingResult")(comDotsunDotstarDotlinguistic2DotProofreadingResult.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.linguistic2.SingleProofreadingError")(comDotsunDotstarDotlinguistic2DotSingleProofreadingError.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.logging.LogRecord")(comDotsunDotstarDotloggingDotLogRecord.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.mail.MailAttachment")(comDotsunDotstarDotmailDotMailAttachment.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.mozilla.MenuMultipleChange")(comDotsunDotstarDotmozillaDotMenuMultipleChange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.mozilla.MenuSingleChange")(comDotsunDotstarDotmozillaDotMenuSingleChange.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.packages.zip.ZipEntry")(comDotsunDotstarDotpackagesDotzipDotZipEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.presentation.ParagraphTarget")(comDotsunDotstarDotpresentationDotParagraphTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rdf.Statement")(comDotsunDotstarDotrdfDotStatement.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.reflection.ParamInfo")(comDotsunDotstarDotreflectionDotParamInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.ARGBColor")(comDotsunDotstarDotrenderingDotARGBColor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.AnimationAttributes")(comDotsunDotstarDotrenderingDotAnimationAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.Caret")(comDotsunDotstarDotrenderingDotCaret.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.ColorProfile")(comDotsunDotstarDotrenderingDotColorProfile.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FloatingPointBitmapLayout")(comDotsunDotstarDotrenderingDotFloatingPointBitmapLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FontInfo")(comDotsunDotstarDotrenderingDotFontInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FontMetrics")(comDotsunDotstarDotrenderingDotFontMetrics.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.FontRequest")(comDotsunDotstarDotrenderingDotFontRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.IntegerBitmapLayout")(comDotsunDotstarDotrenderingDotIntegerBitmapLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.Panose")(comDotsunDotstarDotrenderingDotPanose.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.RGBColor")(comDotsunDotstarDotrenderingDotRGBColor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.RenderState")(comDotsunDotstarDotrenderingDotRenderState.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.StringContext")(comDotsunDotstarDotrenderingDotStringContext.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.StrokeAttributes")(comDotsunDotstarDotrenderingDotStrokeAttributes.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.TextHit")(comDotsunDotstarDotrenderingDotTextHit.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.Texture")(comDotsunDotstarDotrenderingDotTexture.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.rendering.ViewState")(comDotsunDotstarDotrenderingDotViewState.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.scanner.ScannerContext")(comDotsunDotstarDotscannerDotScannerContext.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.AllEventObject")(comDotsunDotstarDotscriptDotAllEventObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ArrayWrapper")(comDotsunDotstarDotscriptDotArrayWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ContextInformation")(comDotsunDotstarDotscriptDotContextInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.EventListener")(comDotsunDotstarDotscriptDotEventListener.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.FinishEngineEvent")(comDotsunDotstarDotscriptDotFinishEngineEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.InterruptEngineEvent")(comDotsunDotstarDotscriptDotInterruptEngineEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.InvocationInfo")(comDotsunDotstarDotscriptDotInvocationInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ModuleInfo")(comDotsunDotstarDotscriptDotModuleInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.NativeObjectWrapper")(comDotsunDotstarDotscriptDotNativeObjectWrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ScriptEvent")(comDotsunDotstarDotscriptDotScriptEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.ScriptEventDescriptor")(comDotsunDotstarDotscriptDotScriptEventDescriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.script.vba.VBAScriptEvent")(comDotsunDotstarDotscriptDotvbaDotVBAScriptEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.DatabaseRegistrationEvent")(comDotsunDotstarDotsdbDotDatabaseRegistrationEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.RowChangeEvent")(comDotsunDotstarDotsdbDotRowChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.RowsChangeEvent")(comDotsunDotstarDotsdbDotRowsChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.SQLErrorEvent")(comDotsunDotstarDotsdbDotSQLErrorEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.application.CopyTableRowEvent")(comDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdb.application.NamedDatabaseObject")(comDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdbc.ChangeEvent")(comDotsunDotstarDotsdbcDotChangeEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sdbc.DriverPropertyInfo")(comDotsunDotstarDotsdbcDotDriverPropertyInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.AllPermission")(comDotsunDotstarDotsecurityDotAllPermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.CertAltNameEntry")(comDotsunDotstarDotsecurityDotCertAltNameEntry.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.DocumentSignatureInformation")(comDotsunDotstarDotsecurityDotDocumentSignatureInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.security.RuntimePermission")(comDotsunDotstarDotsecurityDotRuntimePermission.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.ActivationEvent")(comDotsunDotstarDotsheetDotActivationEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.ComplexReference")(comDotsunDotstarDotsheetDotComplexReference.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DDEItemInfo")(comDotsunDotstarDotsheetDotDDEItemInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DDELinkInfo")(comDotsunDotstarDotsheetDotDDELinkInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldAutoShowInfo")(comDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldFilter")(comDotsunDotstarDotsheetDotDataPilotFieldFilter.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldGroupInfo")(comDotsunDotstarDotsheetDotDataPilotFieldGroupInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("com.sun.star.sheet.DataPilotFieldLayoutInfo")(comDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructNameMap]
  }
  @scala.inline
  implicit class StructNameMapOps[Self <: StructNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComDotsunDotstarDotaccessibilityDotAccessibleEventObject(value: AccessibleEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.accessibility.AccessibleEventObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotaccessibilityDotAccessibleRelation(value: AccessibleRelation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.accessibility.AccessibleRelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotaccessibilityDotAccessibleTableModelChange(value: AccessibleTableModelChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.accessibility.AccessibleTableModelChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotaccessibilityDotTextSegment(value: TextSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.accessibility.TextSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotanimationsDotEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.animations.Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotanimationsDotTargetProperties(value: TargetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.animations.TargetProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotanimationsDotTimeFilterPair(value: TimeFilterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.animations.TimeFilterPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotanimationsDotValuePair(value: ValuePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.animations.ValuePair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotActionEvent(value: ActionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.ActionEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotAdjustmentEvent(value: AdjustmentEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.AdjustmentEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotDeviceInfo(value: DeviceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.DeviceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotDockingData(value: DockingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.DockingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotDockingEvent(value: DockingEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.DockingEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotEndDockingEvent(value: EndDockingEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.EndDockingEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotEndPopupModeEvent(value: EndPopupModeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.EndPopupModeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotEnhancedMouseEvent(value: EnhancedMouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.EnhancedMouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotFocusEvent(value: FocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.FocusEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotFontDescriptor(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.FontDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotGradient(value: Gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.Gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotInputEvent(value: InputEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.InputEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotItemEvent(value: ItemEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.ItemEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotItemListEvent(value: ItemListEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.ItemListEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotKeyEvent(value: KeyEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.KeyEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotKeyStroke(value: KeyStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.KeyStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotMenuEvent(value: MenuEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.MenuEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.MouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotPaintEvent(value: PaintEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.PaintEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.Point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.Rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotSelection(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.Selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotSimpleFontMetric(value: SimpleFontMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.SimpleFontMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotSpinEvent(value: SpinEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.SpinEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotSystemDependentXWindow(value: SystemDependentXWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.SystemDependentXWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotTextEvent(value: TextEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.TextEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotVclContainerEvent(value: VclContainerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.VclContainerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotWindowDescriptor(value: WindowDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.WindowDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotWindowEvent(value: WindowEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.WindowEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotgridDotGridColumnEvent(value: GridColumnEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.grid.GridColumnEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotgridDotGridDataEvent(value: GridDataEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.grid.GridDataEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDotgridDotGridSelectionEvent(value: GridSelectionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.grid.GridSelectionEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDottabDotTabPageActivatedEvent(value: TabPageActivatedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.tab.TabPageActivatedEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDottreeDotTreeDataModelEvent(value: TreeDataModelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.tree.TreeDataModelEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotawtDottreeDotTreeExpansionEvent(value: TreeExpansionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.awt.tree.TreeExpansionEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotGetDirectPropertyTolerantResult(value: GetDirectPropertyTolerantResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.GetDirectPropertyTolerantResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotGetPropertyTolerantResult(value: GetPropertyTolerantResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.GetPropertyTolerantResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotNamedValue(value: NamedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.NamedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotProperty(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.Property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotPropertyChangeEvent(value: PropertyChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.PropertyChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotPropertySetInfoChangeEvent(value: PropertySetInfoChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.PropertySetInfoChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotPropertyStateChangeEvent(value: PropertyStateChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.PropertyStateChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotPropertyValue(value: PropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.PropertyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotSetPropertyTolerantFailed(value: SetPropertyTolerantFailed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.SetPropertyTolerantFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbeansDotStringPair(value: StringPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.beans.StringPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotProtocolProperty(value: ProtocolProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.ProtocolProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotoleautomationDotCurrency(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.oleautomation.Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotoleautomationDotDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.oleautomation.Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotoleautomationDotDecimal(value: Decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.oleautomation.Decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotoleautomationDotNamedArgument(value: NamedArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.oleautomation.NamedArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotoleautomationDotPropertyPutArgument(value: PropertyPutArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.oleautomation.PropertyPutArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotbridgeDotoleautomationDotSCode(value: SCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.bridge.oleautomation.SCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotDataPointLabel(value: DataPointLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.DataPointLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotFillBitmap(value: FillBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.FillBitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotIncrementData(value: IncrementData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.IncrementData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotInterpretedData(value: InterpretedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.InterpretedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotLightSource(value: LightSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.LightSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotRelativePosition(value: RelativePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.RelativePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotRelativeSize(value: RelativeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.RelativeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotScaleData(value: ScaleData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.ScaleData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotSubIncrement(value: SubIncrement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.SubIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotSymbol(value: Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.Symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchart2DotdataDotHighlightedRange(value: HighlightedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart2.data.HighlightedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchartDotChartDataChangeEvent(value: ChartDataChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart.ChartDataChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchartDotChartDataRow(value: ChartDataRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart.ChartDataRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchartDotChartDataValue(value: ChartDataValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart.ChartDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchartDotChartSeriesAddress(value: ChartSeriesAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart.ChartSeriesAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchartDotTimeIncrement(value: TimeIncrement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart.TimeIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotchartDotTimeInterval(value: TimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.chart.TimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotconfigurationDotbackendDotComponentChangeEvent(value: ComponentChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.configuration.backend.ComponentChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotconfigurationDotbackendDotPropertyInfo(value: PropertyInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.configuration.backend.PropertyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotconfigurationDotbackendDotTemplateIdentifier(value: TemplateIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.configuration.backend.TemplateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotconnectionDotSocketPermission(value: SocketPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.connection.SocketPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotcontainerDotContainerEvent(value: ContainerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.container.ContainerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotDataFlavor(value: DataFlavor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.DataFlavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotclipboardDotClipboardEvent(value: ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.clipboard.ClipboardEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDragGestureEvent(value: DragGestureEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DragGestureEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDragSourceDragEvent(value: DragSourceDragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DragSourceDragEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDragSourceDropEvent(value: DragSourceDropEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DragSourceDropEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDragSourceEvent(value: DragSourceEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DragSourceEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDropTargetDragEnterEvent(value: DropTargetDragEnterEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDragEnterEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDropTargetDragEvent(value: DropTargetDragEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDragEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDropTargetDropEvent(value: DropTargetDropEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DropTargetDropEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdatatransferDotdndDotDropTargetEvent(value: DropTargetEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.datatransfer.dnd.DropTargetEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdeploymentDotUpdateInformationEntry(value: UpdateInformationEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.deployment.UpdateInformationEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdocumentDotCmisProperty(value: CmisProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.document.CmisProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdocumentDotCmisVersion(value: CmisVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.document.CmisVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdocumentDotDocumentEvent(value: DocumentEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.document.DocumentEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdocumentDotEventObject(value: EventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.document.EventObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdocumentDotUndoManagerEvent(value: UndoManagerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.document.UndoManagerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotBezierPoint(value: BezierPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.BezierPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotBoundVolume(value: BoundVolume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.BoundVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotCameraGeometry(value: CameraGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.CameraGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotDirection3D(value: Direction3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.Direction3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotEnhancedCustomShapeAdjustmentValue(value: EnhancedCustomShapeAdjustmentValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.EnhancedCustomShapeAdjustmentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotEnhancedCustomShapeParameter(value: EnhancedCustomShapeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.EnhancedCustomShapeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotEnhancedCustomShapeParameterPair(value: EnhancedCustomShapeParameterPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.EnhancedCustomShapeParameterPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotEnhancedCustomShapeSegment(value: EnhancedCustomShapeSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.EnhancedCustomShapeSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotEnhancedCustomShapeTextFrame(value: EnhancedCustomShapeTextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.EnhancedCustomShapeTextFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotGluePoint(value: GluePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.GluePoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotGluePoint2(value: GluePoint2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.GluePoint2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHatch(value: Hatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.Hatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHomogenMatrix(value: HomogenMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.HomogenMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHomogenMatrix3(value: HomogenMatrix3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.HomogenMatrix3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHomogenMatrix4(value: HomogenMatrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.HomogenMatrix4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHomogenMatrixLine(value: HomogenMatrixLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.HomogenMatrixLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHomogenMatrixLine3(value: HomogenMatrixLine3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.HomogenMatrixLine3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotHomogenMatrixLine4(value: HomogenMatrixLine4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.HomogenMatrixLine4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotLineDash(value: LineDash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.LineDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotPolyPolygonBezierCoords(value: PolyPolygonBezierCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.PolyPolygonBezierCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotPolyPolygonShape3D(value: PolyPolygonShape3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.PolyPolygonShape3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotPosition3D(value: Position3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.Position3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotframeworkDotConfigurationChangeEvent(value: ConfigurationChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.framework.ConfigurationChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotdrawingDotframeworkDotTabBarButton(value: TabBarButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.drawing.framework.TabBarButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotembedDotInsertedObjectInfo(value: InsertedObjectInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.embed.InsertedObjectInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotembedDotVerbDescriptor(value: VerbDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.embed.VerbDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotembedDotVisualRepresentation(value: VisualRepresentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.embed.VisualRepresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformDotDatabaseDeleteEvent(value: DatabaseDeleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.form.DatabaseDeleteEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformDotDatabaseParameterEvent(value: DatabaseParameterEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.form.DatabaseParameterEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformDotErrorEvent(value: ErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.form.ErrorEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformDotbindingDotListEntryEvent(value: ListEntryEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.form.binding.ListEntryEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformDotruntimeDotFeatureState(value: FeatureState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.form.runtime.FeatureState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformDotruntimeDotFilterEvent(value: FilterEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.form.runtime.FilterEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotformulaDotSymbolDescriptor(value: SymbolDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.formula.SymbolDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotBorderWidths(value: BorderWidths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.BorderWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotControlCommand(value: ControlCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.ControlCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotControlEvent(value: ControlEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.ControlEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotDispatchDescriptor(value: DispatchDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.DispatchDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotDispatchInformation(value: DispatchInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.DispatchInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotDispatchResultEvent(value: DispatchResultEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.DispatchResultEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotDispatchStatement(value: DispatchStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.DispatchStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotFeatureStateEvent(value: FeatureStateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.FeatureStateEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotFrameActionEvent(value: FrameActionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.FrameActionEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotTitleChangedEvent(value: TitleChangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.TitleChangedEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotClipboardFormats(value: ClipboardFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.ClipboardFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotFontHeight(value: FontHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.FontHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotItemStatus(value: ItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.ItemStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotLeftRightMargin(value: LeftRightMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.LeftRightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotLeftRightMarginScale(value: LeftRightMarginScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.LeftRightMarginScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.Template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotUpperLowerMargin(value: UpperLowerMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.UpperLowerMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotUpperLowerMarginScale(value: UpperLowerMarginScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.UpperLowerMarginScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotVerb(value: Verb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.Verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotframeDotstatusDotVisibility(value: Visibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.frame.status.Visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotAffineMatrix2D(value: AffineMatrix2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.AffineMatrix2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotAffineMatrix3D(value: AffineMatrix3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.AffineMatrix3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotEllipticalArc(value: EllipticalArc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.EllipticalArc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotIntegerBezierSegment2D(value: IntegerBezierSegment2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.IntegerBezierSegment2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotIntegerPoint2D(value: IntegerPoint2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.IntegerPoint2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotIntegerRectangle2D(value: IntegerRectangle2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.IntegerRectangle2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotIntegerSize2D(value: IntegerSize2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.IntegerSize2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotMatrix2D(value: Matrix2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.Matrix2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotRealBezierSegment2D(value: RealBezierSegment2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.RealBezierSegment2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotRealPoint2D(value: RealPoint2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.RealPoint2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotRealRectangle2D(value: RealRectangle2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.RealRectangle2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotRealRectangle3D(value: RealRectangle3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.RealRectangle3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotgeometryDotRealSize2D(value: RealSize2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.geometry.RealSize2D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotBoundary(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.Boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.Calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotCalendar2(value: Calendar2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.Calendar2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotCalendarItem(value: CalendarItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.CalendarItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotCalendarItem2(value: CalendarItem2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.CalendarItem2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotCurrency(value: typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotCurrency2(value: Currency2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.Currency2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotForbiddenCharacters(value: ForbiddenCharacters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.ForbiddenCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotFormatElement(value: FormatElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.FormatElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotImplementation(value: Implementation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.Implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotLanguageCountryInfo(value: LanguageCountryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.LanguageCountryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotLineBreakHyphenationOptions(value: LineBreakHyphenationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.LineBreakHyphenationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotLineBreakResults(value: LineBreakResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.LineBreakResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotLineBreakUserOptions(value: LineBreakUserOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.LineBreakUserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotLocaleDataItem(value: LocaleDataItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.LocaleDataItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotNativeNumberXmlAttributes(value: NativeNumberXmlAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.NativeNumberXmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotNumberFormatCode(value: NumberFormatCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.NumberFormatCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotParseResult(value: ParseResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.ParseResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDoti18nDotTextConversionResult(value: TextConversionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.i18n.TextConversionResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotinspectionDotLineDescriptor(value: LineDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.inspection.LineDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotinspectionDotPropertyCategoryDescriptor(value: PropertyCategoryDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.inspection.PropertyCategoryDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotioDotDataTransferEvent(value: DataTransferEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.io.DataTransferEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotioDotFilePermission(value: FilePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.io.FilePermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlangDotEventObject(value: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.lang.EventObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlangDotLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.lang.Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlinguistic2DotDictionaryEvent(value: DictionaryEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.linguistic2.DictionaryEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlinguistic2DotDictionaryListEvent(value: DictionaryListEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.linguistic2.DictionaryListEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlinguistic2DotLinguServiceEvent(value: LinguServiceEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.linguistic2.LinguServiceEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlinguistic2DotProofreadingResult(value: ProofreadingResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.linguistic2.ProofreadingResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotlinguistic2DotSingleProofreadingError(value: SingleProofreadingError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.linguistic2.SingleProofreadingError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotloggingDotLogRecord(value: LogRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.logging.LogRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotmailDotMailAttachment(value: MailAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.mail.MailAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotmozillaDotMenuMultipleChange(value: MenuMultipleChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.mozilla.MenuMultipleChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotmozillaDotMenuSingleChange(value: MenuSingleChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.mozilla.MenuSingleChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotpackagesDotzipDotZipEntry(value: ZipEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.packages.zip.ZipEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotpresentationDotParagraphTarget(value: ParagraphTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.presentation.ParagraphTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrdfDotStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rdf.Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotreflectionDotParamInfo(value: ParamInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.reflection.ParamInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotARGBColor(value: ARGBColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.ARGBColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotAnimationAttributes(value: AnimationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.AnimationAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotCaret(value: Caret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.Caret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotColorProfile(value: ColorProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.ColorProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotFloatingPointBitmapLayout(value: FloatingPointBitmapLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.FloatingPointBitmapLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotFontInfo(value: FontInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.FontInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotFontMetrics(value: FontMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.FontMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotFontRequest(value: FontRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.FontRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotIntegerBitmapLayout(value: IntegerBitmapLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.IntegerBitmapLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotPanose(value: Panose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.Panose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotRGBColor(value: RGBColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.RGBColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotRenderState(value: RenderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.RenderState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotStringContext(value: StringContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.StringContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotStrokeAttributes(value: StrokeAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.StrokeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotTextHit(value: TextHit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.TextHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotTexture(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.Texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotrenderingDotViewState(value: ViewState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.rendering.ViewState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscannerDotScannerContext(value: ScannerContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.scanner.ScannerContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotAllEventObject(value: AllEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.AllEventObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotArrayWrapper(value: ArrayWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.ArrayWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotContextInformation(value: ContextInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.ContextInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotEventListener(value: EventListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.EventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotFinishEngineEvent(value: FinishEngineEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.FinishEngineEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotInterruptEngineEvent(value: InterruptEngineEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.InterruptEngineEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotInvocationInfo(value: InvocationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.InvocationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotModuleInfo(value: ModuleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.ModuleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotNativeObjectWrapper(value: NativeObjectWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.NativeObjectWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotScriptEvent(value: ScriptEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.ScriptEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotScriptEventDescriptor(value: ScriptEventDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.ScriptEventDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotscriptDotvbaDotVBAScriptEvent(value: VBAScriptEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.script.vba.VBAScriptEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbDotDatabaseRegistrationEvent(value: DatabaseRegistrationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdb.DatabaseRegistrationEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbDotRowChangeEvent(value: RowChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdb.RowChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbDotRowsChangeEvent(value: RowsChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdb.RowsChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbDotSQLErrorEvent(value: SQLErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdb.SQLErrorEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbDotapplicationDotCopyTableRowEvent(value: CopyTableRowEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdb.application.CopyTableRowEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbDotapplicationDotNamedDatabaseObject(value: NamedDatabaseObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdb.application.NamedDatabaseObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbcDotChangeEvent(value: ChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdbc.ChangeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsdbcDotDriverPropertyInfo(value: DriverPropertyInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sdbc.DriverPropertyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsecurityDotAllPermission(value: AllPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.security.AllPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsecurityDotCertAltNameEntry(value: CertAltNameEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.security.CertAltNameEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsecurityDotDocumentSignatureInformation(value: DocumentSignatureInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.security.DocumentSignatureInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsecurityDotRuntimePermission(value: RuntimePermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.security.RuntimePermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotActivationEvent(value: ActivationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.ActivationEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotComplexReference(value: ComplexReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.ComplexReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotDDEItemInfo(value: DDEItemInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.DDEItemInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotDDELinkInfo(value: DDELinkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.DDELinkInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotDataPilotFieldAutoShowInfo(value: DataPilotFieldAutoShowInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.DataPilotFieldAutoShowInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotDataPilotFieldFilter(value: DataPilotFieldFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.DataPilotFieldFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotDataPilotFieldGroupInfo(value: DataPilotFieldGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.DataPilotFieldGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComDotsunDotstarDotsheetDotDataPilotFieldLayoutInfo(value: DataPilotFieldLayoutInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("com.sun.star.sheet.DataPilotFieldLayoutInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

