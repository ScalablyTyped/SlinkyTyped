organization := "org.scalablytyped.slinky"
name := "dagre-d3"
version := "0.4-dt-20200226Z-344364"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-b39db8",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-134dee",
  "org.scalablytyped.slinky" %%% "dagre" % "0.7-dt-20200507Z-68a792",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
