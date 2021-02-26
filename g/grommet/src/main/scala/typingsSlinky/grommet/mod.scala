package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.accordionMod.AccordionProps
import typingsSlinky.grommet.accordionPanelMod.AccordionPanelProps
import typingsSlinky.grommet.anchorMod.AnchorProps
import typingsSlinky.grommet.announceContextMod.AnnounceValue
import typingsSlinky.grommet.anon.Analog
import typingsSlinky.grommet.anon.Animation
import typingsSlinky.grommet.anon.AnimationDisabled
import typingsSlinky.grommet.anon.Baseline
import typingsSlinky.grommet.anon.BodyContainer
import typingsSlinky.grommet.anon.Captions
import typingsSlinky.grommet.anon.Check
import typingsSlinky.grommet.anon.ColorExtend
import typingsSlinky.grommet.anon.Colors
import typingsSlinky.grommet.anon.Container
import typingsSlinky.grommet.anon.Content
import typingsSlinky.grommet.anon.Continent
import typingsSlinky.grommet.anon.Control
import typingsSlinky.grommet.anon.Day
import typingsSlinky.grommet.anon.DeepReadonlyThemeType
import typingsSlinky.grommet.anon.Default
import typingsSlinky.grommet.anon.DisabledExtend
import typingsSlinky.grommet.anon.Edge
import typingsSlinky.grommet.anon.Extend
import typingsSlinky.grommet.anon.FontWeight
import typingsSlinky.grommet.anon.GroupEnd
import typingsSlinky.grommet.anon.Hover
import typingsSlinky.grommet.anon.Icons
import typingsSlinky.grommet.anon.Item
import typingsSlinky.grommet.anon.Line
import typingsSlinky.grommet.anon.MaxHeight
import typingsSlinky.grommet.anon.Overlay
import typingsSlinky.grommet.anon.Panel
import typingsSlinky.grommet.anon.Position
import typingsSlinky.grommet.anon.ResponsiveBreakpoint
import typingsSlinky.grommet.anon.RoutedAnchorPropsOmitAnch
import typingsSlinky.grommet.anon.SizeText
import typingsSlinky.grommet.anon.Thumb
import typingsSlinky.grommet.anon.Toggle
import typingsSlinky.grommet.anon.Xlarge
import typingsSlinky.grommet.anon.Xsmall
import typingsSlinky.grommet.anon.`13`
import typingsSlinky.grommet.anon.`14`
import typingsSlinky.grommet.anon.`22`
import typingsSlinky.grommet.anon.`25`
import typingsSlinky.grommet.avatarMod.AvatarProps
import typingsSlinky.grommet.baseMod.ThemeType
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.boxMod.BoxTypes
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.buttonMod.ButtonType
import typingsSlinky.grommet.calendarMod.CalendarProps
import typingsSlinky.grommet.carouselMod.CarouselProps
import typingsSlinky.grommet.chartMod.ChartProps
import typingsSlinky.grommet.checkBoxGroupMod.CheckBoxGroupProps
import typingsSlinky.grommet.checkBoxMod.CheckBoxProps
import typingsSlinky.grommet.clockMod.ClockProps
import typingsSlinky.grommet.collapsibleMod.CollapsibleProps
import typingsSlinky.grommet.dataChartMod.DataChartProps
import typingsSlinky.grommet.dataTableMod.DataTableProps
import typingsSlinky.grommet.dateInputMod.DateInputProps
import typingsSlinky.grommet.diagramMod.DiagramProps
import typingsSlinky.grommet.distributionMod.DistributionProps
import typingsSlinky.grommet.dropButtonMod.DropButtonProps
import typingsSlinky.grommet.dropMod.DropProps
import typingsSlinky.grommet.formFieldMod.FormFieldProps
import typingsSlinky.grommet.formMod.FormProps
import typingsSlinky.grommet.gridMod.GridProps
import typingsSlinky.grommet.grommetMod.GrommetProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.grommetStrings.controls
import typingsSlinky.grommet.grommetStrings.icon
import typingsSlinky.grommet.grommetStrings.id
import typingsSlinky.grommet.grommetStrings.mask
import typingsSlinky.grommet.grommetStrings.name
import typingsSlinky.grommet.grommetStrings.onBlur
import typingsSlinky.grommet.grommetStrings.onChange
import typingsSlinky.grommet.grommetStrings.onSelect
import typingsSlinky.grommet.grommetStrings.onSubmit
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.grommetStrings.plain
import typingsSlinky.grommet.grommetStrings.reverse
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.grommetStrings.title
import typingsSlinky.grommet.grommetStrings.value
import typingsSlinky.grommet.headingMod.HeadingProps
import typingsSlinky.grommet.imageMod.ImageProps
import typingsSlinky.grommet.infiniteScrollMod.InfiniteScrollProps
import typingsSlinky.grommet.keyboardMod.KeyboardProps
import typingsSlinky.grommet.layerMod.LayerProps
import typingsSlinky.grommet.listMod.ListProps
import typingsSlinky.grommet.markdownMod.MarkdownProps
import typingsSlinky.grommet.maskedInputMod.MaskedInputProps
import typingsSlinky.grommet.menuMod.MenuProps
import typingsSlinky.grommet.meterMod.MeterProps
import typingsSlinky.grommet.paragraphMod.ParagraphProps
import typingsSlinky.grommet.radioButtonGroupMod.RadioButtonGroupProps
import typingsSlinky.grommet.radioButtonMod.RadioButtonProps
import typingsSlinky.grommet.rangeInputMod.RangeInputProps
import typingsSlinky.grommet.rangeSelectorMod.RangeSelectorProps
import typingsSlinky.grommet.responsiveContextMod.ResponsiveValue
import typingsSlinky.grommet.routedButtonMod.RoutedButtonProps
import typingsSlinky.grommet.selectMod.SelectProps
import typingsSlinky.grommet.sidebarMod.SidebarProps
import typingsSlinky.grommet.skipLinkMod.SkipLinkProps
import typingsSlinky.grommet.skipLinkTargetMod.SkipLinkTargetProps
import typingsSlinky.grommet.skipLinksMod.SkipLinksProps
import typingsSlinky.grommet.stackMod.StackProps
import typingsSlinky.grommet.tabMod.TabProps
import typingsSlinky.grommet.tableBodyMod.TableBodyProps
import typingsSlinky.grommet.tableCellMod.TableCellProps
import typingsSlinky.grommet.tableFooterMod.TableFooterProps
import typingsSlinky.grommet.tableHeaderMod.TableHeaderProps
import typingsSlinky.grommet.tableMod.TableProps
import typingsSlinky.grommet.tableRowMod.TableRowProps
import typingsSlinky.grommet.tabsMod.TabsProps
import typingsSlinky.grommet.textAreaMod.TextAreaProps
import typingsSlinky.grommet.textInputMod.TextInputProps
import typingsSlinky.grommet.textMod.TextProps
import typingsSlinky.grommet.themeContextMod.ThemeContextI
import typingsSlinky.grommet.utilsMod.DeepReadonly
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.grommet.videoMod.VideoProps
import typingsSlinky.grommet.worldMapMod.WorldMapProps
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.react.mod.TdHTMLAttributes
import typingsSlinky.react.mod.TextareaHTMLAttributes
import typingsSlinky.react.mod.VideoHTMLAttributes
import typingsSlinky.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grommet", "Accordion")
  @js.native
  val Accordion: ReactComponentClass[
    BoxProps with AccordionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "AccordionPanel")
  @js.native
  class AccordionPanel protected ()
    extends Component[
          AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "AccordionPanel")
  @js.native
  val AccordionPanel: ReactComponentClass[
    AccordionPanelProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Anchor")
  @js.native
  val Anchor: ReactComponentClass[
    AnchorProps with (Omit[
      DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
      color
    ])
  ] = js.native
  
  @JSImport("grommet", "AnnounceContext")
  @js.native
  val AnnounceContext: Context[AnnounceValue] = js.native
  
  @JSImport("grommet", "Avatar")
  @js.native
  val Avatar: ReactComponentClass[
    BoxProps with AvatarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Box")
  @js.native
  val Box: ReactComponentClass[
    BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Button")
  @js.native
  val Button: ReactComponentClass[
    ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[
          CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Calendar")
  @js.native
  val Calendar: ReactComponentClass[
    CalendarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Card")
  @js.native
  val Card: ReactComponentClass[BoxTypes] = js.native
  
  @JSImport("grommet", "CardBody")
  @js.native
  val CardBody: ReactComponentClass[BoxTypes] = js.native
  
  @JSImport("grommet", "CardFooter")
  @js.native
  val CardFooter: ReactComponentClass[BoxTypes] = js.native
  
  @JSImport("grommet", "CardHeader")
  @js.native
  val CardHeader: ReactComponentClass[BoxTypes] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Carousel")
  @js.native
  class Carousel protected ()
    extends Component[
          CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Carousel")
  @js.native
  val Carousel: ReactComponentClass[
    CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Chart")
  @js.native
  class Chart protected ()
    extends Component[ChartProps, js.Object, js.Any] {
    def this(props: ChartProps) = this()
    def this(props: ChartProps, context: js.Any) = this()
  }
  @JSImport("grommet", "Chart")
  @js.native
  val Chart: ReactComponentClass[ChartProps] = js.native
  
  @JSImport("grommet", "CheckBox")
  @js.native
  val CheckBox: ReactComponentClass[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "CheckBoxGroup")
  @js.native
  class CheckBoxGroup protected ()
    extends Component[
          CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "CheckBoxGroup")
  @js.native
  val CheckBoxGroup: ReactComponentClass[
    CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Clock")
  @js.native
  class Clock protected ()
    extends Component[
          ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])) = this()
    def this(
      props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Clock")
  @js.native
  val Clock: ReactComponentClass[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Collapsible")
  @js.native
  class Collapsible protected ()
    extends Component[
          CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Collapsible")
  @js.native
  val Collapsible: ReactComponentClass[
    CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "ContainerTargetContext")
  @js.native
  val ContainerTargetContext: Context[Node] = js.native
  
  @JSImport("grommet", "DataChart")
  @js.native
  val DataChart: ReactComponentClass[DataChartProps] = js.native
  
  @JSImport("grommet", "DataTable")
  @js.native
  class DataTable[TRowType] protected ()
    extends typingsSlinky.grommet.dataTableMod.DataTable[TRowType] {
    def this(props: DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]),
      context: js.Any
    ) = this()
  }
  
  @JSImport("grommet", "DateInput")
  @js.native
  val DateInput: ReactComponentClass[DateInputProps] = js.native
  
  @JSImport("grommet", "Diagram")
  @js.native
  val Diagram: ReactComponentClass[DiagramProps with SVGProps[SVGSVGElement]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Distribution")
  @js.native
  class Distribution protected ()
    extends Component[
          DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Distribution")
  @js.native
  val Distribution: ReactComponentClass[
    DistributionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Drop")
  @js.native
  class Drop protected ()
    extends Component[
          DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Drop")
  @js.native
  val Drop: ReactComponentClass[
    DropProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "DropButton")
  @js.native
  class DropButton protected ()
    extends Component[
          DropButtonProps with ButtonProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: DropButtonProps with ButtonProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ])) = this()
    def this(
      props: DropButtonProps with ButtonProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            color
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "DropButton")
  @js.native
  val DropButton: ReactComponentClass[
    DropButtonProps with ButtonProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      color
    ])
  ] = js.native
  
  @JSImport("grommet", "Footer")
  @js.native
  val Footer: ReactComponentClass[BoxProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Form")
  @js.native
  class Form protected ()
    extends Component[
          FormProps[_] with (typingsSlinky.std.Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: FormProps[_] with (typingsSlinky.std.Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ])) = this()
    def this(
      props: FormProps[_] with (typingsSlinky.std.Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Form")
  @js.native
  val Form: ReactComponentClass[
    FormProps[js.Any] with (typingsSlinky.std.Omit[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      onChange | onSubmit
    ])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "FormField")
  @js.native
  class FormField protected ()
    extends Component[
          FormFieldProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: FormFieldProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ])) = this()
    def this(
      props: FormFieldProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "FormField")
  @js.native
  val FormField: ReactComponentClass[
    FormFieldProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      placeholder
    ])
  ] = js.native
  
  @JSImport("grommet", "Grid")
  @js.native
  val Grid: ReactComponentClass[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Grommet")
  @js.native
  class Grommet_ protected ()
    extends Component[
          GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  
  @JSImport("grommet", "Grommet")
  @js.native
  val Grommet_ : ReactComponentClass[
    GrommetProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Header")
  @js.native
  val Header: ReactComponentClass[BoxTypes] = js.native
  
  @JSImport("grommet", "Heading")
  @js.native
  val Heading: ReactComponentClass[
    HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
  ] = js.native
  
  @JSImport("grommet", "Image")
  @js.native
  val Image: ReactComponentClass[
    ImageProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "InfiniteScroll")
  @js.native
  class InfiniteScroll protected ()
    extends Component[InfiniteScrollProps, js.Object, js.Any] {
    def this(props: InfiniteScrollProps) = this()
    def this(props: InfiniteScrollProps, context: js.Any) = this()
  }
  @JSImport("grommet", "InfiniteScroll")
  @js.native
  val InfiniteScroll: ReactComponentClass[InfiniteScrollProps] = js.native
  
  @JSImport("grommet", "Keyboard")
  @js.native
  val Keyboard: ReactComponentClass[KeyboardProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Layer")
  @js.native
  class Layer protected ()
    extends Component[
          LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Layer")
  @js.native
  val Layer: ReactComponentClass[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "List")
  @js.native
  class List protected ()
    extends Component[
          ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])) = this()
    def this(
      props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "List")
  @js.native
  val List: ReactComponentClass[
    ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
  ] = js.native
  
  @JSImport("grommet", "Main")
  @js.native
  val Main: ReactComponentClass[BoxProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Markdown")
  @js.native
  class Markdown protected ()
    extends Component[
          MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Markdown")
  @js.native
  val Markdown: ReactComponentClass[
    MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "MaskedInput")
  @js.native
  class MaskedInput protected ()
    extends Component[
          MaskedInputProps with (typingsSlinky.std.Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: MaskedInputProps with (typingsSlinky.std.Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ])) = this()
    def this(
      props: MaskedInputProps with (typingsSlinky.std.Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            icon | id | mask | name | onBlur | plain | reverse | size | value
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "MaskedInput")
  @js.native
  val MaskedInput: ReactComponentClass[
    MaskedInputProps with (typingsSlinky.std.Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      icon | id | mask | name | onBlur | plain | reverse | size | value
    ])
  ] = js.native
  
  @JSImport("grommet", "Menu")
  @js.native
  val Menu: ReactComponentClass[MenuProps with (Omit[ButtonType, icon])] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Meter")
  @js.native
  class Meter protected ()
    extends Component[MeterProps, js.Object, js.Any] {
    def this(props: MeterProps) = this()
    def this(props: MeterProps, context: js.Any) = this()
  }
  @JSImport("grommet", "Meter")
  @js.native
  val Meter: ReactComponentClass[MeterProps] = js.native
  
  @JSImport("grommet", "Nav")
  @js.native
  val Nav: ReactComponentClass[BoxProps] = js.native
  
  @JSImport("grommet", "Paragraph")
  @js.native
  val Paragraph: ReactComponentClass[
    ParagraphProps with (Omit[
      DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
      color
    ])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends Component[
          RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])) = this()
    def this(
      props: RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "RadioButton")
  @js.native
  val RadioButton: ReactComponentClass[
    RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RadioButtonGroup")
  @js.native
  class RadioButtonGroup protected ()
    extends Component[
          RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "RadioButtonGroup")
  @js.native
  val RadioButtonGroup: ReactComponentClass[
    RadioButtonGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "RangeInput")
  @js.native
  val RangeInput: ReactComponentClass[
    RangeInputProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RangeSelector")
  @js.native
  class RangeSelector protected ()
    extends Component[
          RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
          js.Object, 
          js.Any
        ] {
    def this(props: RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])) = this()
    def this(
      props: RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "RangeSelector")
  @js.native
  val RangeSelector: ReactComponentClass[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ] = js.native
  
  @JSImport("grommet", "ResponsiveContext")
  @js.native
  val ResponsiveContext: Context[ResponsiveValue] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RoutedAnchor")
  @js.native
  class RoutedAnchor protected ()
    extends Component[RoutedAnchorPropsOmitAnch, js.Object, js.Any] {
    def this(props: RoutedAnchorPropsOmitAnch) = this()
    def this(props: RoutedAnchorPropsOmitAnch, context: js.Any) = this()
  }
  @JSImport("grommet", "RoutedAnchor")
  @js.native
  val RoutedAnchor: ReactComponentClass[RoutedAnchorPropsOmitAnch] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "RoutedButton")
  @js.native
  class RoutedButton protected ()
    extends Component[RoutedButtonProps with ButtonProps, js.Object, js.Any] {
    def this(props: RoutedButtonProps with ButtonProps) = this()
    def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
  }
  @JSImport("grommet", "RoutedButton")
  @js.native
  val RoutedButton: ReactComponentClass[RoutedButtonProps with ButtonProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Select")
  @js.native
  class Select protected ()
    extends Component[SelectProps, js.Object, js.Any] {
    def this(props: SelectProps) = this()
    def this(props: SelectProps, context: js.Any) = this()
  }
  @JSImport("grommet", "Select")
  @js.native
  val Select: ReactComponentClass[SelectProps] = js.native
  
  @JSImport("grommet", "Sidebar")
  @js.native
  val Sidebar: ReactComponentClass[
    BoxProps with SidebarProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "SkipLink")
  @js.native
  val SkipLink: ReactComponentClass[SkipLinkProps] = js.native
  
  @JSImport("grommet", "SkipLinkTarget")
  @js.native
  val SkipLinkTarget: ReactComponentClass[SkipLinkTargetProps] = js.native
  
  @JSImport("grommet", "SkipLinks")
  @js.native
  val SkipLinks: ReactComponentClass[SkipLinksProps] = js.native
  
  @JSImport("grommet", "Stack")
  @js.native
  val Stack: ReactComponentClass[
    StackProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Tab")
  @js.native
  class Tab protected ()
    extends Component[
          TabProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: TabProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ])) = this()
    def this(
      props: TabProps with (Omit[
            DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
            title
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Tab")
  @js.native
  val Tab: ReactComponentClass[
    TabProps with (Omit[
      DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
      title
    ])
  ] = js.native
  
  @JSImport("grommet", "Table")
  @js.native
  val Table: ReactComponentClass[
    TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
  ] = js.native
  
  @JSImport("grommet", "TableBody")
  @js.native
  val TableBody: ReactComponentClass[
    TableBodyProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  
  @JSImport("grommet", "TableCell")
  @js.native
  val TableCell: ReactComponentClass[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = js.native
  
  @JSImport("grommet", "TableFooter")
  @js.native
  val TableFooter: ReactComponentClass[
    TableFooterProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  
  @JSImport("grommet", "TableHeader")
  @js.native
  val TableHeader: ReactComponentClass[
    TableHeaderProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement])
  ] = js.native
  
  @JSImport("grommet", "TableRow")
  @js.native
  val TableRow: ReactComponentClass[
    TableRowProps with (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement])
  ] = js.native
  
  @JSImport("grommet", "Tabs")
  @js.native
  val Tabs: ReactComponentClass[
    TabsProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @JSImport("grommet", "Text")
  @js.native
  val Text: ReactComponentClass[
    TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
  ] = js.native
  
  @JSImport("grommet", "TextArea")
  @js.native
  val TextArea: ReactComponentClass[
    TextAreaProps with (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "TextInput")
  @js.native
  class TextInput protected ()
    extends Component[
          TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ])) = this()
    def this(
      props: TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "TextInput")
  @js.native
  val TextInput: ReactComponentClass[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ])
  ] = js.native
  
  @JSImport("grommet", "ThemeContext")
  @js.native
  val ThemeContext: ThemeContextI = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "Video")
  @js.native
  class Video protected ()
    extends Component[
          VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ])) = this()
    def this(
      props: VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
            DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
            controls
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "Video")
  @js.native
  val Video: ReactComponentClass[
    VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
      DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
      controls
    ])
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet", "WorldMap")
  @js.native
  class WorldMap protected ()
    extends Component[
          WorldMapProps with (typingsSlinky.std.Omit[SVGProps[SVGSVGElement], color]), 
          js.Object, 
          js.Any
        ] {
    def this(props: WorldMapProps with (typingsSlinky.std.Omit[SVGProps[SVGSVGElement], color])) = this()
    def this(
      props: WorldMapProps with (typingsSlinky.std.Omit[SVGProps[SVGSVGElement], color]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet", "WorldMap")
  @js.native
  val WorldMap: ReactComponentClass[WorldMapProps with (typingsSlinky.std.Omit[SVGProps[SVGSVGElement], color])] = js.native
  
  /* Inlined grommet.grommet/utils.DeepReadonly<grommet.grommet/themes/base.ThemeType> */
  object base {
    
    @JSImport("grommet", "base.accordion")
    @js.native
    val accordion: js.UndefOr[Panel | DeepReadonly[js.UndefOr[Panel]]] = js.native
    
    @JSImport("grommet", "base.anchor")
    @js.native
    val anchor: js.UndefOr[FontWeight | DeepReadonly[js.UndefOr[FontWeight]]] = js.native
    
    @JSImport("grommet", "base.avatar")
    @js.native
    val avatar: js.UndefOr[SizeText | DeepReadonly[js.UndefOr[SizeText]]] = js.native
    
    @JSImport("grommet", "base.box")
    @js.native
    val box: js.UndefOr[ResponsiveBreakpoint | DeepReadonly[js.UndefOr[ResponsiveBreakpoint]]] = js.native
    
    @JSImport("grommet", "base.button")
    @js.native
    val button: js.UndefOr[Default | DeepReadonly[js.UndefOr[Default]]] = js.native
    
    @JSImport("grommet", "base.calendar")
    @js.native
    val calendar: js.UndefOr[Day | DeepReadonly[js.UndefOr[Day]]] = js.native
    
    @JSImport("grommet", "base.card")
    @js.native
    val card: js.UndefOr[BodyContainer | DeepReadonly[js.UndefOr[BodyContainer]]] = js.native
    
    @JSImport("grommet", "base.carousel")
    @js.native
    val carousel: js.UndefOr[AnimationDisabled | DeepReadonly[js.UndefOr[AnimationDisabled]]] = js.native
    
    @JSImport("grommet", "base.chart")
    @js.native
    val chart: js.UndefOr[ColorExtend | DeepReadonly[js.UndefOr[ColorExtend]]] = js.native
    
    @JSImport("grommet", "base.checkBox")
    @js.native
    val checkBox: js.UndefOr[Toggle | DeepReadonly[js.UndefOr[Toggle]]] = js.native
    
    @JSImport("grommet", "base.clock")
    @js.native
    val clock: js.UndefOr[Analog | DeepReadonly[js.UndefOr[Analog]]] = js.native
    
    @JSImport("grommet", "base.collapsible")
    @js.native
    val collapsible: js.UndefOr[Baseline | DeepReadonly[js.UndefOr[Baseline]]] = js.native
    
    @JSImport("grommet", "base.dataTable")
    @js.native
    val dataTable: js.UndefOr[GroupEnd | DeepReadonly[js.UndefOr[GroupEnd]]] = js.native
    
    @JSImport("grommet", "base.dateInput")
    @js.native
    val dateInput: js.UndefOr[`13` | DeepReadonly[js.UndefOr[`13`]]] = js.native
    
    @JSImport("grommet", "base.diagram")
    @js.native
    val diagram: js.UndefOr[Line | DeepReadonly[js.UndefOr[Line]]] = js.native
    
    @JSImport("grommet", "base.drop")
    @js.native
    val drop: js.UndefOr[MaxHeight | DeepReadonly[js.UndefOr[MaxHeight]]] = js.native
    
    @JSImport("grommet", "base.formField")
    @js.native
    val formField: js.UndefOr[Content | DeepReadonly[js.UndefOr[Content]]] = js.native
    
    @JSImport("grommet", "base.global")
    @js.native
    val global: js.UndefOr[Animation | DeepReadonly[js.UndefOr[Animation]]] = js.native
    
    @JSImport("grommet", "base.grommet")
    @js.native
    val grommet: js.UndefOr[`14` | DeepReadonly[js.UndefOr[`14`]]] = js.native
    
    @JSImport("grommet", "base.heading")
    @js.native
    val heading: js.UndefOr[Extend | DeepReadonly[js.UndefOr[Extend]]] = js.native
    
    @JSImport("grommet", "base.icon")
    @js.native
    val icon: js.UndefOr[`25` | DeepReadonly[js.UndefOr[`25`]]] = js.native
    
    @JSImport("grommet", "base.layer")
    @js.native
    val layer: js.UndefOr[Overlay | DeepReadonly[js.UndefOr[Overlay]]] = js.native
    
    @JSImport("grommet", "base.list")
    @js.native
    val list: js.UndefOr[Item | DeepReadonly[js.UndefOr[Item]]] = js.native
    
    @JSImport("grommet", "base.maskedInput")
    @js.native
    val maskedInput: js.UndefOr[`22` | DeepReadonly[js.UndefOr[`22`]]] = js.native
    
    @JSImport("grommet", "base.menu")
    @js.native
    val menu: js.UndefOr[Icons | DeepReadonly[js.UndefOr[Icons]]] = js.native
    
    @JSImport("grommet", "base.meter")
    @js.native
    val meter: js.UndefOr[Colors | DeepReadonly[js.UndefOr[Colors]]] = js.native
    
    @JSImport("grommet", "base.paragraph")
    @js.native
    val paragraph: js.UndefOr[Xlarge | DeepReadonly[js.UndefOr[Xlarge]]] = js.native
    
    @JSImport("grommet", "base.radioButton")
    @js.native
    val radioButton: js.UndefOr[Check | DeepReadonly[js.UndefOr[Check]]] = js.native
    
    @JSImport("grommet", "base.radioButtonGroup")
    @js.native
    val radioButtonGroup: js.UndefOr[Container | DeepReadonly[js.UndefOr[Container]]] = js.native
    
    @JSImport("grommet", "base.rangeInput")
    @js.native
    val rangeInput: js.UndefOr[Thumb | DeepReadonly[js.UndefOr[Thumb]]] = js.native
    
    @JSImport("grommet", "base.rangeSelector")
    @js.native
    val rangeSelector: js.UndefOr[Edge | DeepReadonly[js.UndefOr[Edge]]] = js.native
    
    @JSImport("grommet", "base.select")
    @js.native
    val select: js.UndefOr[Control | DeepReadonly[js.UndefOr[Control]]] = js.native
    
    @JSImport("grommet", "base.skipLinks")
    @js.native
    val skipLinks: js.UndefOr[Position | DeepReadonly[js.UndefOr[Position]]] = js.native
    
    @JSImport("grommet", "base.tab")
    @js.native
    val tab: js.UndefOr[Hover | DeepReadonly[js.UndefOr[Hover]]] = js.native
    
    @JSImport("grommet", "base.table")
    @js.native
    val table: js.UndefOr[
        typingsSlinky.grommet.anon.Footer | DeepReadonly[js.UndefOr[typingsSlinky.grommet.anon.Footer]]
      ] = js.native
    
    @JSImport("grommet", "base.tabs")
    @js.native
    val tabs: js.UndefOr[
        typingsSlinky.grommet.anon.Header | DeepReadonly[js.UndefOr[typingsSlinky.grommet.anon.Header]]
      ] = js.native
    
    @JSImport("grommet", "base.text")
    @js.native
    val text: js.UndefOr[Xsmall | DeepReadonly[js.UndefOr[Xsmall]]] = js.native
    
    @JSImport("grommet", "base.textArea")
    @js.native
    val textArea: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
    
    @JSImport("grommet", "base.textInput")
    @js.native
    val textInput: js.UndefOr[DisabledExtend | DeepReadonly[js.UndefOr[DisabledExtend]]] = js.native
    
    @JSImport("grommet", "base.video")
    @js.native
    val video: js.UndefOr[Captions | DeepReadonly[js.UndefOr[Captions]]] = js.native
    
    @JSImport("grommet", "base.worldMap")
    @js.native
    val worldMap: js.UndefOr[Continent | DeepReadonly[js.UndefOr[Continent]]] = js.native
  }
  
  @JSImport("grommet", "dark")
  @js.native
  val dark: ThemeType = js.native
  
  @JSImport("grommet", "extendDefaultTheme")
  @js.native
  def extendDefaultTheme(theme: ThemeType): Unit = js.native
  
  @JSImport("grommet", "generate")
  @js.native
  def generate(): DeepReadonlyThemeType = js.native
  @JSImport("grommet", "generate")
  @js.native
  def generate(baseSpacing: js.UndefOr[scala.Nothing], scale: Double): DeepReadonlyThemeType = js.native
  @JSImport("grommet", "generate")
  @js.native
  def generate(baseSpacing: Double): DeepReadonlyThemeType = js.native
  @JSImport("grommet", "generate")
  @js.native
  def generate(baseSpacing: Double, scale: Double): DeepReadonlyThemeType = js.native
  
  @JSImport("grommet", "grommet")
  @js.native
  val grommet: ThemeType = js.native
}
