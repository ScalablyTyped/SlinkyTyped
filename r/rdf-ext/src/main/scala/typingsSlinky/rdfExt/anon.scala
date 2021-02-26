package typingsSlinky.rdfExt

import typingsSlinky.rdfExt.propTypeMod.PropType
import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.rdfExtStrings.`object`
import typingsSlinky.rdfExt.rdfExtStrings.graph
import typingsSlinky.rdfExt.rdfExtStrings.language
import typingsSlinky.rdfExt.rdfExtStrings.predicate
import typingsSlinky.rdfExt.rdfExtStrings.subject
import typingsSlinky.rdfExt.rdfExtStrings.termType
import typingsSlinky.rdfExt.rdfExtStrings.toJSON
import typingsSlinky.rdfExt.rdfExtStrings.value
import typingsSlinky.rdfJs.mod.BlankNode
import typingsSlinky.rdfJs.mod.DefaultGraph
import typingsSlinky.rdfJs.mod.Literal
import typingsSlinky.rdfJs.mod.NamedNode
import typingsSlinky.rdfJs.mod.Variable
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Datatype extends StObject {
    
    var datatype: TermTypeValue = js.native
    
    var language: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.language] = js.native
    
    var termType: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
    
    var value: PropType[Literal, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
  }
  object Datatype {
    
    @scala.inline
    def apply(
      datatype: TermTypeValue,
      language: PropType[Literal, language],
      termType: PropType[Literal, termType],
      value: PropType[Literal, value]
    ): Datatype = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datatype]
    }
    
    @scala.inline
    implicit class DatatypeMutableBuilder[Self <: Datatype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatatype(value: TermTypeValue): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: PropType[Literal, language]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermType(value: PropType[Literal, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: PropType[Literal, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Graph extends StObject {
    
    var graph: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.graph], toJSON]] = js.native
    
    var `object`: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.`object`], toJSON]] = js.native
    
    var predicate: ReturnType[
        PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.predicate], toJSON]
      ] = js.native
    
    var subject: ReturnType[PropType[PropType[QuadExt, typingsSlinky.rdfExt.rdfExtStrings.subject], toJSON]] = js.native
  }
  object Graph {
    
    @scala.inline
    def apply(
      graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
      `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
      predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
      subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
    ): Graph = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    @scala.inline
    implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGraph(value: ReturnType[PropType[PropType[QuadExt, graph], toJSON]]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicate(value: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TermType extends StObject {
    
    var termType: PropType[BlankNode, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
    
    var value: PropType[BlankNode, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
  }
  object TermType {
    
    @scala.inline
    def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): TermType = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermType]
    }
    
    @scala.inline
    implicit class TermTypeMutableBuilder[Self <: TermType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTermType(value: PropType[BlankNode, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: PropType[BlankNode, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TermTypePropType extends StObject {
    
    var termType: PropType[Variable, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
    
    var value: PropType[Variable, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
  }
  object TermTypePropType {
    
    @scala.inline
    def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): TermTypePropType = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermTypePropType]
    }
    
    @scala.inline
    implicit class TermTypePropTypeMutableBuilder[Self <: TermTypePropType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTermType(value: PropType[Variable, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: PropType[Variable, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TermTypeValue extends StObject {
    
    var termType: PropType[NamedNode[String], typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
    
    var value: PropType[NamedNode[String], typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
  }
  object TermTypeValue {
    
    @scala.inline
    def apply(termType: PropType[NamedNode[String], termType], value: PropType[NamedNode[String], value]): TermTypeValue = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermTypeValue]
    }
    
    @scala.inline
    implicit class TermTypeValueMutableBuilder[Self <: TermTypeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTermType(value: PropType[NamedNode[String], termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: PropType[NamedNode[String], value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var termType: PropType[DefaultGraph, typingsSlinky.rdfExt.rdfExtStrings.termType] = js.native
    
    var value: PropType[DefaultGraph, typingsSlinky.rdfExt.rdfExtStrings.value] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): Value = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTermType(value: PropType[DefaultGraph, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: PropType[DefaultGraph, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
