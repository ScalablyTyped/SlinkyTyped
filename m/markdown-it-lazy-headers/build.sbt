organization := "org.scalablytyped.slinky"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20200515Z-cc0716"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20200515Z-3e7f38",
  "org.scalablytyped.slinky" %%% "markdown-it" % "v10.0.0-dt-20201109Z-ac6235",
  "org.scalablytyped.slinky" %%% "mdurl" % "1.0-dt-20200515Z-f9c725",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
