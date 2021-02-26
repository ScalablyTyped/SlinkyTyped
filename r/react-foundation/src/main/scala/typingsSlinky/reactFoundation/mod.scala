package typingsSlinky.reactFoundation

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactFoundation.accordionMod.AccordianContentProps
import typingsSlinky.reactFoundation.accordionMod.AccordianItemProps
import typingsSlinky.reactFoundation.accordionMod.AccordianProps
import typingsSlinky.reactFoundation.accordionMod.AccordionTitleProps
import typingsSlinky.reactFoundation.anon.AlignX
import typingsSlinky.reactFoundation.anon.Breakpoint
import typingsSlinky.reactFoundation.badgeMod.BadgeProps
import typingsSlinky.reactFoundation.breadcrumbsMod.BreadcrumbItemProps
import typingsSlinky.reactFoundation.breadcrumbsMod.BreadcrumbsProps
import typingsSlinky.reactFoundation.buttonGroupMod.ButtonGroupProps
import typingsSlinky.reactFoundation.buttonMod.ButtonProps
import typingsSlinky.reactFoundation.buttonMod.LinkProps
import typingsSlinky.reactFoundation.calloutMod.CalloutProps
import typingsSlinky.reactFoundation.closeButtonMod.CloseButtonProps
import typingsSlinky.reactFoundation.elementMod.BlockProps
import typingsSlinky.reactFoundation.elementMod.InlineProps
import typingsSlinky.reactFoundation.enumsMod.BadgeColors
import typingsSlinky.reactFoundation.enumsMod.ButtonColors
import typingsSlinky.reactFoundation.enumsMod.ButtonSizes
import typingsSlinky.reactFoundation.enumsMod.HorizontalAlignments
import typingsSlinky.reactFoundation.enumsMod.MenuAlignments
import typingsSlinky.reactFoundation.enumsMod.ProgressColors
import typingsSlinky.reactFoundation.enumsMod.SwitchInputTypes
import typingsSlinky.reactFoundation.enumsMod.VerticalAlignments
import typingsSlinky.reactFoundation.flexVideoMod.FlexVideoProps
import typingsSlinky.reactFoundation.gridMod.ColumnProps
import typingsSlinky.reactFoundation.gridMod.RowProps
import typingsSlinky.reactFoundation.iconMod.IconProps
import typingsSlinky.reactFoundation.labelMod.LabelProps
import typingsSlinky.reactFoundation.mediaObjectMod.MediaObjectProps
import typingsSlinky.reactFoundation.mediaObjectMod.MediaObjectSectionProps
import typingsSlinky.reactFoundation.menuMod.MenuItemProps
import typingsSlinky.reactFoundation.menuMod.MenuProps
import typingsSlinky.reactFoundation.paginationMod.PaginationItemProps
import typingsSlinky.reactFoundation.paginationMod.PaginationProps
import typingsSlinky.reactFoundation.progressBarMod.NativeProgressProps
import typingsSlinky.reactFoundation.progressBarMod.ProgressMeterProps
import typingsSlinky.reactFoundation.progressBarMod.ProgressMeterTextProps
import typingsSlinky.reactFoundation.progressBarMod.ProgressMeterWithTextProps
import typingsSlinky.reactFoundation.responsiveMod.MenuIconProps
import typingsSlinky.reactFoundation.responsiveMod.TitleBarProps
import typingsSlinky.reactFoundation.responsiveMod.TitleBarTitleProps
import typingsSlinky.reactFoundation.sliderMod.SliderFillProps
import typingsSlinky.reactFoundation.sliderMod.SliderHandleProps
import typingsSlinky.reactFoundation.switchMod.SwitchActiveProps
import typingsSlinky.reactFoundation.switchMod.SwitchInactiveProps
import typingsSlinky.reactFoundation.switchMod.SwitchInputProps
import typingsSlinky.reactFoundation.switchMod.SwitchPaddleProps
import typingsSlinky.reactFoundation.switchMod.SwitchProps
import typingsSlinky.reactFoundation.tabsMod.TabItemProps
import typingsSlinky.reactFoundation.tabsMod.TabPanelProps
import typingsSlinky.reactFoundation.tabsMod.TabsContentProps
import typingsSlinky.reactFoundation.tabsMod.TabsProps
import typingsSlinky.reactFoundation.thumbnailMod.ThumbnailProps
import typingsSlinky.reactFoundation.topBarMod.TopBarProps
import typingsSlinky.reactFoundation.xyGridMod.CellProps
import typingsSlinky.reactFoundation.xyGridMod.GridContainerProps
import typingsSlinky.reactFoundation.xyGridMod.GridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-foundation", "Accordion")
  @js.native
  val Accordion: ReactComponentClass[AccordianProps] = js.native
  
  @JSImport("react-foundation", "AccordionContent")
  @js.native
  val AccordionContent: ReactComponentClass[AccordianContentProps] = js.native
  
  @JSImport("react-foundation", "AccordionItem")
  @js.native
  val AccordionItem: ReactComponentClass[AccordianItemProps] = js.native
  
  @JSImport("react-foundation", "AccordionTitle")
  @js.native
  val AccordionTitle: ReactComponentClass[AccordionTitleProps] = js.native
  
  object Alignments {
    
    @JSImport("react-foundation", "Alignments")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Alignments.BOTTOM")
    @js.native
    def BOTTOM: VerticalAlignments = js.native
    @scala.inline
    def BOTTOM_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.CENTER")
    @js.native
    def CENTER: MenuAlignments = js.native
    @scala.inline
    def CENTER_=(x: MenuAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.JUSTIFY")
    @js.native
    def JUSTIFY: HorizontalAlignments = js.native
    @scala.inline
    def JUSTIFY_=(x: HorizontalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JUSTIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.MIDDLE")
    @js.native
    def MIDDLE: VerticalAlignments = js.native
    @scala.inline
    def MIDDLE_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.RIGHT")
    @js.native
    def RIGHT: MenuAlignments = js.native
    @scala.inline
    def RIGHT_=(x: MenuAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.SPACED")
    @js.native
    def SPACED: HorizontalAlignments = js.native
    @scala.inline
    def SPACED_=(x: HorizontalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.STRETCH")
    @js.native
    def STRETCH: VerticalAlignments = js.native
    @scala.inline
    def STRETCH_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.TOP")
    @js.native
    def TOP: VerticalAlignments = js.native
    @scala.inline
    def TOP_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Badge")
  @js.native
  val Badge: ReactComponentClass[BadgeProps] = js.native
  
  @JSImport("react-foundation", "Block")
  @js.native
  val Block: ReactComponentClass[BlockProps] = js.native
  
  @JSImport("react-foundation", "BreadcrumbItem")
  @js.native
  val BreadcrumbItem: ReactComponentClass[BreadcrumbItemProps] = js.native
  
  @JSImport("react-foundation", "Breadcrumbs")
  @js.native
  val Breadcrumbs: ReactComponentClass[BreadcrumbsProps] = js.native
  
  object Breakpoints {
    
    @JSImport("react-foundation", "Breakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Breakpoints.LARGE")
    @js.native
    def LARGE: typingsSlinky.reactFoundation.enumsMod.Breakpoints = js.native
    @scala.inline
    def LARGE_=(x: typingsSlinky.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.MEDIUM")
    @js.native
    def MEDIUM: typingsSlinky.reactFoundation.enumsMod.Breakpoints = js.native
    @scala.inline
    def MEDIUM_=(x: typingsSlinky.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.SMALL")
    @js.native
    def SMALL: typingsSlinky.reactFoundation.enumsMod.Breakpoints = js.native
    @scala.inline
    def SMALL_=(x: typingsSlinky.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.XLARGE")
    @js.native
    def XLARGE: typingsSlinky.reactFoundation.enumsMod.Breakpoints = js.native
    @scala.inline
    def XLARGE_=(x: typingsSlinky.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XLARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.XXLARGE")
    @js.native
    def XXLARGE: typingsSlinky.reactFoundation.enumsMod.Breakpoints = js.native
    @scala.inline
    def XXLARGE_=(x: typingsSlinky.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XXLARGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Button")
  @js.native
  val Button: ReactComponentClass[ButtonProps] = js.native
  
  @JSImport("react-foundation", "ButtonGroup")
  @js.native
  val ButtonGroup: ReactComponentClass[ButtonGroupProps] = js.native
  
  @JSImport("react-foundation", "Callout")
  @js.native
  val Callout: ReactComponentClass[CalloutProps] = js.native
  
  @JSImport("react-foundation", "Cell")
  @js.native
  val Cell: ReactComponentClass[CellProps] = js.native
  
  @JSImport("react-foundation", "CloseButton")
  @js.native
  val CloseButton: ReactComponentClass[CloseButtonProps] = js.native
  
  object Colors {
    
    @JSImport("react-foundation", "Colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Colors.ALERT")
    @js.native
    def ALERT: ProgressColors = js.native
    @scala.inline
    def ALERT_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.INFO")
    @js.native
    def INFO: BadgeColors = js.native
    @scala.inline
    def INFO_=(x: BadgeColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.PRIMARY")
    @js.native
    def PRIMARY: ButtonColors = js.native
    @scala.inline
    def PRIMARY_=(x: ButtonColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.SECONDARY")
    @js.native
    def SECONDARY: ProgressColors = js.native
    @scala.inline
    def SECONDARY_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.SUCCESS")
    @js.native
    def SUCCESS: ProgressColors = js.native
    @scala.inline
    def SUCCESS_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.WARNING")
    @js.native
    def WARNING: ProgressColors = js.native
    @scala.inline
    def WARNING_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Column")
  @js.native
  val Column: ReactComponentClass[ColumnProps] = js.native
  
  object ExtendedBreakpoints {
    
    @JSImport("react-foundation", "ExtendedBreakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "ExtendedBreakpoints.ALL")
    @js.native
    def ALL: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    @scala.inline
    def ALL_=(x: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.LARGE")
    @js.native
    def LARGE: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    @scala.inline
    def LARGE_=(x: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.MEDIUM")
    @js.native
    def MEDIUM: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    @scala.inline
    def MEDIUM_=(x: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.SMALL")
    @js.native
    def SMALL: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    @scala.inline
    def SMALL_=(x: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.XLARGE")
    @js.native
    def XLARGE: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    @scala.inline
    def XLARGE_=(x: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XLARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.XXLARGE")
    @js.native
    def XXLARGE: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    @scala.inline
    def XXLARGE_=(x: typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XXLARGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "FlexVideo")
  @js.native
  val FlexVideo: ReactComponentClass[FlexVideoProps] = js.native
  
  object FloatTypes {
    
    @JSImport("react-foundation", "FloatTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "FloatTypes.CENTER")
    @js.native
    def CENTER: typingsSlinky.reactFoundation.enumsMod.FloatTypes = js.native
    @scala.inline
    def CENTER_=(x: typingsSlinky.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "FloatTypes.LEFT")
    @js.native
    def LEFT: typingsSlinky.reactFoundation.enumsMod.FloatTypes = js.native
    @scala.inline
    def LEFT_=(x: typingsSlinky.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "FloatTypes.RIGHT")
    @js.native
    def RIGHT: typingsSlinky.reactFoundation.enumsMod.FloatTypes = js.native
    @scala.inline
    def RIGHT_=(x: typingsSlinky.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Grid")
  @js.native
  val Grid: ReactComponentClass[GridProps] = js.native
  
  @JSImport("react-foundation", "GridContainer")
  @js.native
  val GridContainer: ReactComponentClass[GridContainerProps] = js.native
  
  object GutterTypes {
    
    @JSImport("react-foundation", "GutterTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "GutterTypes.MARGIN")
    @js.native
    def MARGIN: typingsSlinky.reactFoundation.enumsMod.GutterTypes = js.native
    @scala.inline
    def MARGIN_=(x: typingsSlinky.reactFoundation.enumsMod.GutterTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "GutterTypes.PADDING")
    @js.native
    def PADDING: typingsSlinky.reactFoundation.enumsMod.GutterTypes = js.native
    @scala.inline
    def PADDING_=(x: typingsSlinky.reactFoundation.enumsMod.GutterTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PADDING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Icon")
  @js.native
  val Icon: ReactComponentClass[IconProps] = js.native
  
  @JSImport("react-foundation", "Inline")
  @js.native
  val Inline: ReactComponentClass[InlineProps] = js.native
  
  object InputTypes {
    
    @JSImport("react-foundation", "InputTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "InputTypes.CHECKBOX")
    @js.native
    def CHECKBOX: SwitchInputTypes = js.native
    @scala.inline
    def CHECKBOX_=(x: SwitchInputTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "InputTypes.RADIO")
    @js.native
    def RADIO: SwitchInputTypes = js.native
    @scala.inline
    def RADIO_=(x: SwitchInputTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIO")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Label")
  @js.native
  val Label: ReactComponentClass[LabelProps] = js.native
  
  @JSImport("react-foundation", "Link")
  @js.native
  val Link: ReactComponentClass[LinkProps] = js.native
  
  @JSImport("react-foundation", "MediaObject")
  @js.native
  val MediaObject: ReactComponentClass[MediaObjectProps] = js.native
  
  @JSImport("react-foundation", "MediaObjectSection")
  @js.native
  val MediaObjectSection: ReactComponentClass[MediaObjectSectionProps] = js.native
  
  @JSImport("react-foundation", "Menu")
  @js.native
  val Menu: ReactComponentClass[MenuProps] = js.native
  
  @JSImport("react-foundation", "MenuIcon")
  @js.native
  val MenuIcon: ReactComponentClass[MenuIconProps] = js.native
  
  @JSImport("react-foundation", "MenuItem")
  @js.native
  val MenuItem: ReactComponentClass[MenuItemProps] = js.native
  
  @JSImport("react-foundation", "MenuText")
  @js.native
  def MenuText(props: MenuItemProps): ReactElement = js.native
  
  @JSImport("react-foundation", "NativeProgress")
  @js.native
  val NativeProgress: ReactComponentClass[NativeProgressProps] = js.native
  
  @JSImport("react-foundation", "Pagination")
  @js.native
  val Pagination: ReactComponentClass[PaginationProps] = js.native
  
  @JSImport("react-foundation", "PaginationEllipsis")
  @js.native
  val PaginationEllipsis: ReactComponentClass[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationItem")
  @js.native
  val PaginationItem: ReactComponentClass[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationNext")
  @js.native
  val PaginationNext: ReactComponentClass[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationPrevious")
  @js.native
  val PaginationPrevious: ReactComponentClass[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "Progress")
  @js.native
  val Progress: ReactComponentClass[typingsSlinky.reactFoundation.progressBarMod.PaginationProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeter")
  @js.native
  val ProgressMeter: ReactComponentClass[ProgressMeterProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeterText")
  @js.native
  val ProgressMeterText: ReactComponentClass[ProgressMeterTextProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeterWithText")
  @js.native
  val ProgressMeterWithText: ReactComponentClass[ProgressMeterWithTextProps] = js.native
  
  @JSImport("react-foundation", "ResponsiveNavigation")
  @js.native
  class ResponsiveNavigation ()
    extends typingsSlinky.reactFoundation.responsiveMod.ResponsiveNavigation
  /* static members */
  object ResponsiveNavigation {
    
    @JSImport("react-foundation", "ResponsiveNavigation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "ResponsiveNavigation.defaultProps")
    @js.native
    def defaultProps: Breakpoint = js.native
    @scala.inline
    def defaultProps_=(x: Breakpoint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ResponsiveNavigation.propTypes")
    @js.native
    def propTypes: AlignX = js.native
    @scala.inline
    def propTypes_=(x: AlignX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Reveal")
  @js.native
  val Reveal: ReactComponentClass[typingsSlinky.reactFoundation.revealMod.PaginationProps] = js.native
  
  @JSImport("react-foundation", "Row")
  @js.native
  val Row: ReactComponentClass[RowProps] = js.native
  
  object Sizes {
    
    @JSImport("react-foundation", "Sizes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Sizes.LARGE")
    @js.native
    def LARGE: ButtonSizes = js.native
    @scala.inline
    def LARGE_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Sizes.SMALL")
    @js.native
    def SMALL: ButtonSizes = js.native
    @scala.inline
    def SMALL_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Sizes.TINY")
    @js.native
    def TINY: ButtonSizes = js.native
    @scala.inline
    def TINY_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TINY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Slider")
  @js.native
  class Slider ()
    extends typingsSlinky.reactFoundation.sliderMod.Slider
  
  @JSImport("react-foundation", "SliderFill")
  @js.native
  val SliderFill: ReactComponentClass[SliderFillProps] = js.native
  
  @JSImport("react-foundation", "SliderHandle")
  @js.native
  val SliderHandle: ReactComponentClass[SliderHandleProps] = js.native
  
  object SpaceControls {
    
    @JSImport("react-foundation", "SpaceControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "SpaceControls.AUTO")
    @js.native
    def AUTO: typingsSlinky.reactFoundation.enumsMod.SpaceControls = js.native
    @scala.inline
    def AUTO_=(x: typingsSlinky.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "SpaceControls.GROW")
    @js.native
    def GROW: typingsSlinky.reactFoundation.enumsMod.SpaceControls = js.native
    @scala.inline
    def GROW_=(x: typingsSlinky.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROW")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "SpaceControls.SHRINK")
    @js.native
    def SHRINK: typingsSlinky.reactFoundation.enumsMod.SpaceControls = js.native
    @scala.inline
    def SHRINK_=(x: typingsSlinky.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHRINK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Switch")
  @js.native
  val Switch: ReactComponentClass[SwitchProps] = js.native
  
  @JSImport("react-foundation", "SwitchActive")
  @js.native
  val SwitchActive: ReactComponentClass[SwitchActiveProps] = js.native
  
  @JSImport("react-foundation", "SwitchInactive")
  @js.native
  val SwitchInactive: ReactComponentClass[SwitchInactiveProps] = js.native
  
  @JSImport("react-foundation", "SwitchInput")
  @js.native
  val SwitchInput: ReactComponentClass[SwitchInputProps] = js.native
  
  @JSImport("react-foundation", "SwitchPaddle")
  @js.native
  val SwitchPaddle: ReactComponentClass[SwitchPaddleProps] = js.native
  
  @JSImport("react-foundation", "TabItem")
  @js.native
  val TabItem: ReactComponentClass[TabItemProps] = js.native
  
  @JSImport("react-foundation", "TabPanel")
  @js.native
  val TabPanel: ReactComponentClass[TabPanelProps] = js.native
  
  @JSImport("react-foundation", "Tabs")
  @js.native
  val Tabs: ReactComponentClass[TabsProps] = js.native
  
  @JSImport("react-foundation", "TabsContent")
  @js.native
  val TabsContent: ReactComponentClass[TabsContentProps] = js.native
  
  @JSImport("react-foundation", "Thumbnail")
  @js.native
  val Thumbnail: ReactComponentClass[ThumbnailProps] = js.native
  
  @JSImport("react-foundation", "ThumbnailLink")
  @js.native
  val ThumbnailLink: ReactComponentClass[ThumbnailProps] = js.native
  
  @JSImport("react-foundation", "TitleBar")
  @js.native
  val TitleBar: ReactComponentClass[TitleBarProps] = js.native
  
  @JSImport("react-foundation", "TitleBarTitle")
  @js.native
  val TitleBarTitle: ReactComponentClass[TitleBarTitleProps] = js.native
  
  @JSImport("react-foundation", "TopBar")
  @js.native
  val TopBar: ReactComponentClass[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarLeft")
  @js.native
  val TopBarLeft: ReactComponentClass[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarRight")
  @js.native
  val TopBarRight: ReactComponentClass[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarTitle")
  @js.native
  val TopBarTitle: ReactComponentClass[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TwoHandleSlider")
  @js.native
  class TwoHandleSlider ()
    extends typingsSlinky.reactFoundation.sliderMod.TwoHandleSlider
}
