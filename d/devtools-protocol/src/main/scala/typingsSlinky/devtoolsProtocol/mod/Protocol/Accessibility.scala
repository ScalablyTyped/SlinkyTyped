package typingsSlinky.devtoolsProtocol.mod.Protocol

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accessibility {
  
  @js.native
  trait AXNode extends StObject {
    
    /**
      * The backend ID for the associated DOM node, if any.
      */
    var backendDOMNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * IDs for each of this node's child nodes.
      */
    var childIds: js.UndefOr[js.Array[AXNodeId]] = js.native
    
    /**
      * The accessible description for this `Node`.
      */
    var description: js.UndefOr[AXValue] = js.native
    
    /**
      * Whether this node is ignored for accessibility
      */
    var ignored: Boolean = js.native
    
    /**
      * Collection of reasons why this node is hidden.
      */
    var ignoredReasons: js.UndefOr[js.Array[AXProperty]] = js.native
    
    /**
      * The accessible name for this `Node`.
      */
    var name: js.UndefOr[AXValue] = js.native
    
    /**
      * Unique identifier for this node.
      */
    var nodeId: AXNodeId = js.native
    
    /**
      * All other properties
      */
    var properties: js.UndefOr[js.Array[AXProperty]] = js.native
    
    /**
      * This `Node`'s role, whether explicit or implicit.
      */
    var role: js.UndefOr[AXValue] = js.native
    
    /**
      * The value for this `Node`.
      */
    var value: js.UndefOr[AXValue] = js.native
  }
  object AXNode {
    
    @scala.inline
    def apply(ignored: Boolean, nodeId: AXNodeId): AXNode = {
      val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXNode]
    }
    
    @scala.inline
    implicit class AXNodeMutableBuilder[Self <: AXNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendDOMNodeIdUndefined: Self = StObject.set(x, "backendDOMNodeId", js.undefined)
      
      @scala.inline
      def setChildIds(value: js.Array[AXNodeId]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdsUndefined: Self = StObject.set(x, "childIds", js.undefined)
      
      @scala.inline
      def setChildIdsVarargs(value: AXNodeId*): Self = StObject.set(x, "childIds", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: AXValue): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredReasons(value: js.Array[AXProperty]): Self = StObject.set(x, "ignoredReasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredReasonsUndefined: Self = StObject.set(x, "ignoredReasons", js.undefined)
      
      @scala.inline
      def setIgnoredReasonsVarargs(value: AXProperty*): Self = StObject.set(x, "ignoredReasons", js.Array(value :_*))
      
      @scala.inline
      def setName(value: AXValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNodeId(value: AXNodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Array[AXProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: AXProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setRole(value: AXValue): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type AXNodeId = String
  
  @js.native
  trait AXProperty extends StObject {
    
    /**
      * The name of this property.
      */
    var name: AXPropertyName = js.native
    
    /**
      * The value of this property.
      */
    var value: AXValue = js.native
  }
  object AXProperty {
    
    @scala.inline
    def apply(name: AXPropertyName, value: AXValue): AXProperty = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXProperty]
    }
    
    @scala.inline
    implicit class AXPropertyMutableBuilder[Self <: AXProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: AXPropertyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.busy
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.disabled
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.editable
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.focusable
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.focused
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hidden
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.invalid
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.settable
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.roledescription
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.live
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.atomic
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.relevant
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.root
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.autocomplete
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hasPopup
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.level
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.multiselectable
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.orientation
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.multiline
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.readonly
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.required
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuemin
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuemax
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuetext
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.checked
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.expanded
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.modal
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.pressed
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.selected
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.activedescendant
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.controls
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.describedby
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.details
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.errormessage
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.flowto
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelledby
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.owns
  */
  trait AXPropertyName extends StObject
  object AXPropertyName {
    
    @scala.inline
    def activedescendant: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.activedescendant = "activedescendant".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.activedescendant]
    
    @scala.inline
    def atomic: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.atomic = "atomic".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.atomic]
    
    @scala.inline
    def autocomplete: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.autocomplete = "autocomplete".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.autocomplete]
    
    @scala.inline
    def busy: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.busy = "busy".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.busy]
    
    @scala.inline
    def checked: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.checked = "checked".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.checked]
    
    @scala.inline
    def controls: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.controls = "controls".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.controls]
    
    @scala.inline
    def describedby: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.describedby = "describedby".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.describedby]
    
    @scala.inline
    def details: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.details = "details".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.details]
    
    @scala.inline
    def disabled: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.disabled = "disabled".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.disabled]
    
    @scala.inline
    def editable: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.editable = "editable".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.editable]
    
    @scala.inline
    def errormessage: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.errormessage = "errormessage".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.errormessage]
    
    @scala.inline
    def expanded: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.expanded = "expanded".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.expanded]
    
    @scala.inline
    def flowto: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.flowto = "flowto".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.flowto]
    
    @scala.inline
    def focusable: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.focusable = "focusable".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.focusable]
    
    @scala.inline
    def focused: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.focused = "focused".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.focused]
    
    @scala.inline
    def hasPopup: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hasPopup = "hasPopup".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hasPopup]
    
    @scala.inline
    def hidden: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hidden = "hidden".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hidden]
    
    @scala.inline
    def hiddenRoot: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot = "hiddenRoot".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.hiddenRoot]
    
    @scala.inline
    def invalid: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.invalid = "invalid".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.invalid]
    
    @scala.inline
    def keyshortcuts: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts = "keyshortcuts".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.keyshortcuts]
    
    @scala.inline
    def labelledby: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelledby = "labelledby".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelledby]
    
    @scala.inline
    def level: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.level = "level".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.level]
    
    @scala.inline
    def live: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.live = "live".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.live]
    
    @scala.inline
    def modal: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.modal = "modal".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.modal]
    
    @scala.inline
    def multiline: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.multiline = "multiline".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.multiline]
    
    @scala.inline
    def multiselectable: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.multiselectable = "multiselectable".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.multiselectable]
    
    @scala.inline
    def orientation: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.orientation = "orientation".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.orientation]
    
    @scala.inline
    def owns: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.owns = "owns".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.owns]
    
    @scala.inline
    def pressed: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.pressed = "pressed".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.pressed]
    
    @scala.inline
    def readonly: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.readonly = "readonly".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.readonly]
    
    @scala.inline
    def relevant: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.relevant = "relevant".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.relevant]
    
    @scala.inline
    def required: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.required = "required".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.required]
    
    @scala.inline
    def roledescription: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.roledescription = "roledescription".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.roledescription]
    
    @scala.inline
    def root: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.root = "root".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.root]
    
    @scala.inline
    def selected: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.selected = "selected".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.selected]
    
    @scala.inline
    def settable: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.settable = "settable".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.settable]
    
    @scala.inline
    def valuemax: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuemax = "valuemax".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuemax]
    
    @scala.inline
    def valuemin: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuemin = "valuemin".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuemin]
    
    @scala.inline
    def valuetext: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuetext = "valuetext".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valuetext]
  }
  
  @js.native
  trait AXRelatedNode extends StObject {
    
    /**
      * The BackendNodeId of the related DOM node.
      */
    var backendDOMNodeId: BackendNodeId = js.native
    
    /**
      * The IDRef value provided, if any.
      */
    var idref: js.UndefOr[String] = js.native
    
    /**
      * The text alternative of this node in the current context.
      */
    var text: js.UndefOr[String] = js.native
  }
  object AXRelatedNode {
    
    @scala.inline
    def apply(backendDOMNodeId: BackendNodeId): AXRelatedNode = {
      val __obj = js.Dynamic.literal(backendDOMNodeId = backendDOMNodeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXRelatedNode]
    }
    
    @scala.inline
    implicit class AXRelatedNodeMutableBuilder[Self <: AXRelatedNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendDOMNodeId(value: BackendNodeId): Self = StObject.set(x, "backendDOMNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdref(value: String): Self = StObject.set(x, "idref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdrefUndefined: Self = StObject.set(x, "idref", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait AXValue extends StObject {
    
    /**
      * One or more related nodes, if applicable.
      */
    var relatedNodes: js.UndefOr[js.Array[AXRelatedNode]] = js.native
    
    /**
      * The sources which contributed to the computation of this property.
      */
    var sources: js.UndefOr[js.Array[AXValueSource]] = js.native
    
    /**
      * The type of this value.
      */
    var `type`: AXValueType = js.native
    
    /**
      * The computed value of this property.
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object AXValue {
    
    @scala.inline
    def apply(`type`: AXValueType): AXValue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXValue]
    }
    
    @scala.inline
    implicit class AXValueMutableBuilder[Self <: AXValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelatedNodes(value: js.Array[AXRelatedNode]): Self = StObject.set(x, "relatedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedNodesUndefined: Self = StObject.set(x, "relatedNodes", js.undefined)
      
      @scala.inline
      def setRelatedNodesVarargs(value: AXRelatedNode*): Self = StObject.set(x, "relatedNodes", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[AXValueSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      @scala.inline
      def setSourcesVarargs(value: AXValueSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setType(value: AXValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.figcaption
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.label
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelfor
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.legend
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tablecaption
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.title
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
  */
  trait AXValueNativeSourceType extends StObject
  object AXValueNativeSourceType {
    
    @scala.inline
    def figcaption: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.figcaption = "figcaption".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.figcaption]
    
    @scala.inline
    def label: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.label = "label".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.label]
    
    @scala.inline
    def labelfor: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelfor = "labelfor".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelfor]
    
    @scala.inline
    def labelwrapped: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped = "labelwrapped".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.labelwrapped]
    
    @scala.inline
    def legend: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.legend = "legend".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.legend]
    
    @scala.inline
    def other: other_ = "other".asInstanceOf[other_]
    
    @scala.inline
    def tablecaption: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tablecaption = "tablecaption".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tablecaption]
    
    @scala.inline
    def title: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.title = "title".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.title]
  }
  
  @js.native
  trait AXValueSource extends StObject {
    
    /**
      * The name of the relevant attribute, if any.
      */
    var attribute: js.UndefOr[String] = js.native
    
    /**
      * The value of the relevant attribute, if any.
      */
    var attributeValue: js.UndefOr[AXValue] = js.native
    
    /**
      * Whether the value for this property is invalid.
      */
    var invalid: js.UndefOr[Boolean] = js.native
    
    /**
      * Reason for the value being invalid, if it is.
      */
    var invalidReason: js.UndefOr[String] = js.native
    
    /**
      * The native markup source for this value, e.g. a <label> element.
      */
    var nativeSource: js.UndefOr[AXValueNativeSourceType] = js.native
    
    /**
      * The value, such as a node or node list, of the native source.
      */
    var nativeSourceValue: js.UndefOr[AXValue] = js.native
    
    /**
      * Whether this source is superseded by a higher priority source.
      */
    var superseded: js.UndefOr[Boolean] = js.native
    
    /**
      * What type of source this is.
      */
    var `type`: AXValueSourceType = js.native
    
    /**
      * The value of this property source.
      */
    var value: js.UndefOr[AXValue] = js.native
  }
  object AXValueSource {
    
    @scala.inline
    def apply(`type`: AXValueSourceType): AXValueSource = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AXValueSource]
    }
    
    @scala.inline
    implicit class AXValueSourceMutableBuilder[Self <: AXValueSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setAttributeValue(value: AXValue): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidReason(value: String): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setNativeSource(value: AXValueNativeSourceType): Self = StObject.set(x, "nativeSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeSourceUndefined: Self = StObject.set(x, "nativeSource", js.undefined)
      
      @scala.inline
      def setNativeSourceValue(value: AXValue): Self = StObject.set(x, "nativeSourceValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeSourceValueUndefined: Self = StObject.set(x, "nativeSourceValue", js.undefined)
      
      @scala.inline
      def setSuperseded(value: Boolean): Self = StObject.set(x, "superseded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupersededUndefined: Self = StObject.set(x, "superseded", js.undefined)
      
      @scala.inline
      def setType(value: AXValueSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: AXValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.attribute
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`implicit`
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.style
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.contents
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.placeholder
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.relatedElement
  */
  trait AXValueSourceType extends StObject
  object AXValueSourceType {
    
    @scala.inline
    def attribute: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.attribute = "attribute".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.attribute]
    
    @scala.inline
    def contents: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.contents = "contents".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.contents]
    
    @scala.inline
    def `implicit`: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`implicit` = "implicit".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`implicit`]
    
    @scala.inline
    def placeholder: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.placeholder = "placeholder".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.placeholder]
    
    @scala.inline
    def relatedElement: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.relatedElement = "relatedElement".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.relatedElement]
    
    @scala.inline
    def style: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.style = "style".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.style]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tristate
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.idref
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.idrefList
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.integer
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.node
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.nodeList
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.computedString
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.token
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tokenList
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.domRelation
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.role
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.internalRole
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined
  */
  trait AXValueType extends StObject
  object AXValueType {
    
    @scala.inline
    def boolean: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean = "boolean".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean]
    
    @scala.inline
    def booleanOrUndefined: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined = "booleanOrUndefined".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.booleanOrUndefined]
    
    @scala.inline
    def computedString: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.computedString = "computedString".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.computedString]
    
    @scala.inline
    def domRelation: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.domRelation = "domRelation".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.domRelation]
    
    @scala.inline
    def idref: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.idref = "idref".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.idref]
    
    @scala.inline
    def idrefList: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.idrefList = "idrefList".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.idrefList]
    
    @scala.inline
    def integer: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.integer = "integer".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.integer]
    
    @scala.inline
    def internalRole: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.internalRole = "internalRole".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.internalRole]
    
    @scala.inline
    def node: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.node = "node".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.node]
    
    @scala.inline
    def nodeList: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.nodeList = "nodeList".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.nodeList]
    
    @scala.inline
    def number: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number = "number".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number]
    
    @scala.inline
    def role: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.role = "role".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.role]
    
    @scala.inline
    def string: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string = "string".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string]
    
    @scala.inline
    def token: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.token = "token".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.token]
    
    @scala.inline
    def tokenList: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tokenList = "tokenList".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tokenList]
    
    @scala.inline
    def tristate: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tristate = "tristate".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.tristate]
    
    @scala.inline
    def valueUndefined: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined = "valueUndefined".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.valueUndefined]
  }
  
  @js.native
  trait GetFullAXTreeResponse extends StObject {
    
    var nodes: js.Array[AXNode] = js.native
  }
  object GetFullAXTreeResponse {
    
    @scala.inline
    def apply(nodes: js.Array[AXNode]): GetFullAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFullAXTreeResponse]
    }
    
    @scala.inline
    implicit class GetFullAXTreeResponseMutableBuilder[Self <: GetFullAXTreeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetPartialAXTreeRequest extends StObject {
    
    /**
      * Identifier of the backend node to get the partial accessibility tree for.
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * Whether to fetch this nodes ancestors, siblings and children. Defaults to true.
      */
    var fetchRelatives: js.UndefOr[Boolean] = js.native
    
    /**
      * Identifier of the node to get the partial accessibility tree for.
      */
    var nodeId: js.UndefOr[NodeId] = js.native
    
    /**
      * JavaScript object id of the node wrapper to get the partial accessibility tree for.
      */
    var objectId: js.UndefOr[RemoteObjectId] = js.native
  }
  object GetPartialAXTreeRequest {
    
    @scala.inline
    def apply(): GetPartialAXTreeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPartialAXTreeRequest]
    }
    
    @scala.inline
    implicit class GetPartialAXTreeRequestMutableBuilder[Self <: GetPartialAXTreeRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      @scala.inline
      def setFetchRelatives(value: Boolean): Self = StObject.set(x, "fetchRelatives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchRelativesUndefined: Self = StObject.set(x, "fetchRelatives", js.undefined)
      
      @scala.inline
      def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      @scala.inline
      def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  @js.native
  trait GetPartialAXTreeResponse extends StObject {
    
    /**
      * The `Accessibility.AXNode` for this DOM node, if it exists, plus its ancestors, siblings and
      * children, if requested.
      */
    var nodes: js.Array[AXNode] = js.native
  }
  object GetPartialAXTreeResponse {
    
    @scala.inline
    def apply(nodes: js.Array[AXNode]): GetPartialAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPartialAXTreeResponse]
    }
    
    @scala.inline
    implicit class GetPartialAXTreeResponseMutableBuilder[Self <: GetPartialAXTreeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QueryAXTreeRequest extends StObject {
    
    /**
      * Find nodes with this computed name.
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the backend node for the root to query.
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.native
    
    /**
      * Identifier of the node for the root to query.
      */
    var nodeId: js.UndefOr[NodeId] = js.native
    
    /**
      * JavaScript object id of the node wrapper for the root to query.
      */
    var objectId: js.UndefOr[RemoteObjectId] = js.native
    
    /**
      * Find nodes with this computed role.
      */
    var role: js.UndefOr[String] = js.native
  }
  object QueryAXTreeRequest {
    
    @scala.inline
    def apply(): QueryAXTreeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryAXTreeRequest]
    }
    
    @scala.inline
    implicit class QueryAXTreeRequestMutableBuilder[Self <: QueryAXTreeRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      @scala.inline
      def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      @scala.inline
      def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      @scala.inline
      def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  @js.native
  trait QueryAXTreeResponse extends StObject {
    
    /**
      * A list of `Accessibility.AXNode` matching the specified attributes,
      * including nodes that are ignored for accessibility.
      */
    var nodes: js.Array[AXNode] = js.native
  }
  object QueryAXTreeResponse {
    
    @scala.inline
    def apply(nodes: js.Array[AXNode]): QueryAXTreeResponse = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryAXTreeResponse]
    }
    
    @scala.inline
    implicit class QueryAXTreeResponseMutableBuilder[Self <: QueryAXTreeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[AXNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: AXNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
}
