organization := "org.scalablytyped.slinky"
name := "apollo__react-hoc"
version := "3.1.3-8af413"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.4-46658e",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.8-a342be",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-631faf",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-727d87",
  "org.scalablytyped.slinky" %%% "apollo__react-common" % "3.1.3-573782",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-444891",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200225Z-a8e85d",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-044a86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
