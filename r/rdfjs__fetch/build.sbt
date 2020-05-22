organization := "org.scalablytyped.slinky"
name := "rdfjs__fetch"
version := "2.0-dt-20200322Z-c7b99b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "rdf-js" % "3.0-dt-20200515Z-13b5a4",
  "org.scalablytyped.slinky" %%% "rdfjs__fetch-lite" % "2.0-dt-20200302Z-a771b6",
  "org.scalablytyped.slinky" %%% "rdfjs__sink-map" % "1.0-dt-20200116Z-16c927",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
